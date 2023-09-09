package com.selva.FxTradeProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class TradeDetails {
	private int tradeNumber;
	private String customerName;
	private String currencyPair;
	private double transferAmount;
	private String getRate;
	private String bookConfirmation;
	private static double usdRate=85.22;
	private static String bookStatus;
	private static String bookStatus1;
	
	TradeDetails(){
	}
	
	TradeDetails(int tradeNumber,String customerName,String currencyPair,double transferAmount, String getRate, String confirmation)
	{
		this.tradeNumber=tradeNumber;
		this.customerName =customerName;
		this.currencyPair =currencyPair;
		this.transferAmount =transferAmount;
		this.getRate=getRate;
		this.bookConfirmation=confirmation;
		
	}
	
	public int gettradeNumber() {
		return tradeNumber;
	}
	public void settradeNumber(int tradeNumber) {
		this.tradeNumber = tradeNumber;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getcurrencyPair() {
		return currencyPair;
	}
	public void setcurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public double gettransferAmount() {
		return transferAmount;
	}
	public void settransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getgetRate() {
		return getRate;
	}
	public void setgetRate(String getRate) {
		this.getRate = getRate;
	}
	public String getbookConfirmation() {
		return bookConfirmation;
	}
	public void setbookConfirmation(String bookConfirmation) {
		this.bookConfirmation=bookConfirmation;
	}
	
	@Override
	public String toString() {
		return "TradeDetails [tradeNumber=" + tradeNumber + ", customerName=" + customerName + ", currencyPair="
				+ currencyPair + ", transferAmount=" + transferAmount + ", getRate=" + getRate + ", confirmation="
				+ bookConfirmation + "]";
	}
	public String bookTrade(TradeDetails trade) {
		
		double inrRate=usdRate*transferAmount;
		if(getgetRate().equalsIgnoreCase("Yes"))
		{
			bookStatus="You are transferring INR " + inrRate + " "+"to " + customerName;
		}
			if(getbookConfirmation().equalsIgnoreCase("Book"))
			{
				 bookStatus1="Trade for USDINR has been booked and with rate 85.22,The amount of Rs " + inrRate + " will be transferred in 2 working days to " + customerName + "..";

			}
			else if(getbookConfirmation().equalsIgnoreCase("Cancel"))
			{
				bookStatus1="you cancel the trade";
			}
			else {
				bookStatus="Invalid choice";
				bookStatus1="";
			}
		return "Customer name: "+customerName;
	}
	
	public static String showDetails()
	{
		return bookStatus+"\n"+bookStatus1;
	}
	public static String exitTrade() {
		return "Bye have a good day";
	}
		

}

