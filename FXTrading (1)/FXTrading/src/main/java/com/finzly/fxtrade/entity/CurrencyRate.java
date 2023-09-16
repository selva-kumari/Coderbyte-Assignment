package com.finzly.fxtrade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyRate {
	@Id
	private int currencyNo;
	private String currencyPair;
	private double exchangeRate;
	
	public int getCurrencyNo() {
		return currencyNo;
	}
	public void setCurrencyNo(int currencyNo) {
		this.currencyNo = currencyNo;
	}
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	@Override
	public String toString() {
		return "CurrencyRate [currencyNo=" + currencyNo + ", currencyPair=" + currencyPair + ", exchangeRate="
				+ exchangeRate + "]";
	}
	
	
	
	
}
