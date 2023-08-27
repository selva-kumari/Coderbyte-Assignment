package FXTrade;
public class Main{
	public static void main(String[] args){
		TradeProcess tradeprocess=new TradeProcess();
		System.out.println("Welcome to Foreign Exchange Trading");
		while(true)
		{
			tradeprocess.displayOptions();
		}
	}
}
