package com.example.consume.ConsumeRESTAPI.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.consume.ConsumeRESTAPI.processor.MyProcessor;

@Component
public class RouteBuilderToAPI extends RouteBuilder {
	
	@Value(value = "${sourceEndPoint}")
	private String sourceEndPoint;
	
	@Value(value = "${destinationEndPoint}")
	private String destinationEndPoint;
	
	@Override
	public void configure() throws Exception {
		
		from("timer:rest-client?period=10s")
		.log("REST API Calling .....")
		.setHeader(Exchange.HTTP_METHOD,simple("GET"))
		.to(sourceEndPoint)
		.streamCaching()
		.log("Incoming Body is ${body}")
		.setHeader(Exchange.HTTP_METHOD, constant("POST"))
		.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		.to(destinationEndPoint);
		//.process(new MyProcessor());

	}

}