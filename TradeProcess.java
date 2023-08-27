package FXTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TradeProcess extends TradeDetails
{           TradeProcess(){
            }
	    TradeProcess(String currencyPair, String customerName, double totalAmount, double rate) 
	    {
		super(currencyPair, customerName, totalAmount, rate);
	    }
	    
		static Scanner sc = new Scanner(System.in);
		static double usdRate = 88.5;
		static List<TradeDetails> tradeDetails=new ArrayList<>();
		public static void bookTrade()
		{
			System.out.println("Enter Customer Name:");
			sc.nextLine();
			String customerName = sc.nextLine();
			System.out.println("Enter Currency Pair:");
			String currencyPair = sc.nextLine();
			if(currencyPair.equalsIgnoreCase("USDINR"))
			{
				System.out.println("Enter amount to transfer:");
				double amount = sc.nextDouble();
				sc.nextLine();
				double totalAmount = usdRate * amount;
				System.out.println("Do you want to getRate Yes/No");
				String s = sc.nextLine();
				if(s.equalsIgnoreCase("Yes"))
				{
					System.out.println("You are transferring INR " + totalAmount + "to " + customerName);
					System.out.println("If you Continue to transfer amount please enter: Book/Cancel");
					String bookopt= sc.nextLine();
					if(bookopt.equalsIgnoreCase("Book"))
					{
						System.out.println("Trade for USDINR has been booked and with rate 85.22,The amount of Rs " + totalAmount + " will be transferred in 2 working days to " + customerName + "..");
						tradeDetails.add(new TradeDetails(currencyPair,customerName,totalAmount,usdRate));

					}
					else if(bookopt.equalsIgnoreCase("Cancel"))
					{
						System.out.println("Trade is canceled");
					}
					else
					{
						System.out.println("please choose a valid option..");
					}
				}
			}
			else
			{
				System.out.println("Invalid..Please Enter USDINR");
				displayOptions();
			}
		}
	public static void printTrade()
		{
			    int tradeCount =0;
				for(TradeDetails tradeDetail : tradeDetails)
				{
					System.out.println("Trade No:"+ ++tradeCount+ " "+"Currency Pair:"+tradeDetail.getCurrencyPair()+" "+"Customer Name:"+tradeDetail.getCustomerName()+" "+"Amount:"+tradeDetail.getTotalAmount()+" "+"Rate:"+tradeDetail.getRate());

				}
		}
	public static void exit()
		{
			System.out.println("Do you really want to exit..Y/N");
			char e = sc.next().charAt(0);
			if(e == 'Y' || e == 'y')
			{
				System.out.println("Bye-Have a good day");
			}
			else
			{
				displayOptions();
			}

		}
	public static void computeExchange()
	{
		System.out.println("Enter the choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				bookTrade();
				break;
			case 2:
				printTrade();
				break;
			case 3:
				exit();
				break;
		}
	}

		public static void displayOptions()
		{
			System.out.println("1.Book trade");
			System.out.println("2.print trade");
			System.out.println("3.Exit");
			computeExchange();
		}

}
