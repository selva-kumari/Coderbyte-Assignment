package FXTrade;
public class TradeDetails {
	private int tradeNumber = 0;
	private String currencyPair;
	private String customerName;
	private double totalAmount;
	private double rate;
	TradeDetails(String currencyPair,String customerName,double totalAmount,double rate)
	{
		this.currencyPair =currencyPair;
		this.customerName =customerName;
		this.totalAmount =totalAmount;
		this.rate=rate;
	}

	public double getTotalAmount()
	{
		return totalAmount;
	}

	public double getRate()
	{
		return rate;
	}

	public String getCurrencyPair()
	{
		return currencyPair;
	}

	public String getCustomerName()
	{
		return customerName;
	}
}


