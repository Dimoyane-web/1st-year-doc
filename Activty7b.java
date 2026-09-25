import java.util.Scanner; //importing Scanner file from the java.util package
import java.text.DecimalFormat; '//importing DecimalFormat file from the java.text package

public class Activity7b
{ //start of the class
	public static void main(String[] args)
	{ //start of the main method
		
		
		//instantiate Scanner
		Scanner kd = new Scanner(System.in);
		//instantiate DecimalFormat
		DecimalFormat df = new DecimalFormat("R0.00");
		
		//constant variables
		final double TICKET_PRICE = 550;
		
		
		//declare variables
		int numberOfPeople;
		double totalAmount;
		
		//promptng the user to enter the number people who want to buy the tickets for the concert
		System.out.print("Enter the number of people in the group: ");
		numberOfPeople = kd.nextInt();
		
		if (numberOfPeople >35)
		{
			totalAmount = numberOfPeople * 500;
		}
		
		totalAmount = numberOfPeople * TICKET_PRICE;
		
		System.out.println("Total amount for all tickets: " + df.format(totalAmount));
		
	} //end of the main method
} //end of the class