package com.example.consume.ConsumeRESTAPI.model;

import org.springframework.stereotype.Component;

@Component
public class ValuationRate {

	private String baseCurrency;
	private String quoteCurrency;
	private String bidRate;
	private String askRate;
	private String midRate;
	private String snapshotDateTime;
	private String spotDate;
	public ValuationRate() {
		super();
	}
	public ValuationRate(String baseCurrency, String quoteCurrency, String bidRate, String askRate, String midRate,
			String snapshotDateTime, String spotDate) {
		super();
		this.baseCurrency = baseCurrency;
		this.quoteCurrency = quoteCurrency;
		this.bidRate = bidRate;
		this.askRate = askRate;
		this.midRate = midRate;
		this.snapshotDateTime = snapshotDateTime;
		this.spotDate = spotDate;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getQuoteCurrency() {
		return quoteCurrency;
	}
	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}
	public String getBidRate() {
		return bidRate;
	}
	public void setBidRate(String bidRate) {
		this.bidRate = bidRate;
	}
	public String getAskRate() {
		return askRate;
	}
	public void setAskRate(String askRate) {
		this.askRate = askRate;
	}
	public String getMidRate() {
		return midRate;
	}
	public void setMidRate(String midRate) {
		this.midRate = midRate;
	}
	public String getSnapshotDateTime() {
		return snapshotDateTime;
	}
	public void setSnapshotDateTime(String snapshotDateTime) {
		this.snapshotDateTime = snapshotDateTime;
	}
	public String getSpotDate() {
		return spotDate;
	}
	public void setSpotDate(String spotDate) {
		this.spotDate = spotDate;
	}
	@Override
	public String toString() {
		return "ValuationRate [baseCurrency=" + baseCurrency + ", quoteCurrency=" + quoteCurrency + ", bidRate="
				+ bidRate + ", askRate=" + askRate + ", midRate=" + midRate + ", snapshotDateTime=" + snapshotDateTime
				+ ", spotDate=" + spotDate + "]";
	}
}
