package com.selva.FxTradeProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class Trade {
	private int tradeNumber;
	private String customerName;
	private String currencyPair;
	private double transferAmount;
	private String rate;
	private String bookConfirmation;
	private static double usdRate=85.22;
	private static String message;
	private static String bookStatus;
	
	
	Trade() {
	}

	public Trade(int tradeNumber, String customerName, String currencyPair, double transferAmount, String rate,
			String bookConfirmation) {
		super();
		this.tradeNumber = tradeNumber;
		this.customerName = customerName;
		this.currencyPair = currencyPair;
		this.transferAmount = transferAmount;
		this.rate = rate;
		this.bookConfirmation = bookConfirmation;
	}

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

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getBookConfirmation() {
		return bookConfirmation;
	}

	public void setBookConfirmation(String bookConfirmation) {
		this.bookConfirmation = bookConfirmation;
	}

	@Override
	public String toString() {
		return "Trade [tradeNumber=" + tradeNumber + ", customerName=" + customerName + ", currencyPair=" + currencyPair
				+ ", transferAmount=" + transferAmount + ", rate=" + rate + ", bookConfirmation=" + bookConfirmation
				+ "]";
	}
	
	public String bookTrade(Trade trade) {
		
		double inrRate=usdRate*transferAmount;
		    if (getRate() != null && getRate().equalsIgnoreCase("Yes"))
		    {
			message="You are transferring INR " + inrRate + " "+"to " + customerName;
		    }
		    else if(getRate().equalsIgnoreCase("no")) {
			message="";
		    }
		    else {
		    	message="Invalid input";
		    }
			if (getBookConfirmation().equalsIgnoreCase("Book"))
			{
				 bookStatus="Trade for USDINR has been booked and with rate 85.22,The amount of Rs " + inrRate + " will be transferred in 2 working days to " + customerName + "..";

			}
			else if (getBookConfirmation().equalsIgnoreCase("Cancel"))
			{
				bookStatus="Your booking is cancelled";
			}
			else {
				bookStatus="Invalid input";
			}
		return "Customer name: "+customerName;
	}
	
	public static String exitTrade() {
		return "Bye have a good day";
	}
	
	public static String showTradeDetails()
	{
		
		return message+"\n"+bookStatus;
	}
	
		

}


