package com.example.consume.ConsumeRESTAPI.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        //System.out.println(exchange.getIn().getBody(String.class));
    	String bodyStr = exchange.getIn().getBody(String.class);
        System.out.println(bodyStr);
        
        
    }

}