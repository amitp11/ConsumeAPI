package com.example.consume.ConsumeRESTAPI.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ValuationData {
	
	private int total;
	private List<ValuationRate> valuationRate;
	
	public ValuationData() {
		super();
	}
	public ValuationData(int total, List<ValuationRate> valuationRate) {
		super();
		this.total = total;
		this.valuationRate = valuationRate;
	}
	@Override
	public String toString() {
		return "ValuationData [total=" + total + ", valuationRate=" + valuationRate + "]";
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<ValuationRate> getValuationRate() {
		return valuationRate;
	}
	public void setValuationRate(List<ValuationRate> valuationRate) {
		this.valuationRate = valuationRate;
	}

}
