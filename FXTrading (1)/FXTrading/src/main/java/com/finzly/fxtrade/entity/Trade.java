package com.finzly.fxtrade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade {
	@Id
	private int tradeNumber;
	private String customerName;
	private String currencyPair;
	private double amountToTransfer;
	private double transferredAmount;
	private double exchangeRate;
	public int getTradeNumber() {
		return tradeNumber;
	}
	public void setTradeNumber(int tradeNumber) {
		this.tradeNumber = tradeNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public double getAmountToTransfer() {
		return amountToTransfer;
	}
	public void setAmountToTransfer(double amountToTransfer) {
		this.amountToTransfer = amountToTransfer;
	}
	public double getTransferredAmount() {
		return transferredAmount;
	}
	public void setTransferredAmount(double transferredAmount) {
		this.transferredAmount = transferredAmount;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	@Override
	public String toString() {
		return "Trade [tradeNumber=" + tradeNumber + ", customerName=" + customerName + ", currencyPair=" + currencyPair
				+ ", amountToTransfer=" + amountToTransfer + ", transferredAmount=" + transferredAmount
				+ ", exchangeRate=" + exchangeRate + "]";
	}
	
	
}
