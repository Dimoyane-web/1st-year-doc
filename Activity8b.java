import java.util.Scanner; //importing Scanner file from the java.util package
import java.text.DecimalFormat; //importing DeciamlFormat file form java.text package

public class Activity8b
{ //start of the class
	public static void main(String[] args)
	{ //start of the main method
		
		
		//instantiate Scanner & DecimalFormat
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		//constant variables
		final double BASIC_RATE = 60; //basic rate in rands
		final double FIRST_MESSAGES = 5; //first messages in cents
		final double MORE_MESSAGES = 10; //more messages in cents
		
		//declare variables
		int numberOfMessages;
		double billAmount;
		
		//prompting the user to enter the number of messages they sent for a month
		System.out.print("Enter the number of messages texted: ");
		numberOfMessages = kd.nextInt();
		
		//inserting the if else condition in order to calculate the billAmount depending on the number of messages texted by the customer
		if (numberOfMessages == 100)
		{ //start of the if statement
			billAmount = BASIC_RATE + (numberOfMessages * (FIRST_MESSAGES/100)); //processing part to agree with the condition
		} //end of if statement
		else
		{ //start of else statement
			billAmount = BASIC_RATE + (numberOfMessages * (MORE_MESSAGES/100));
		}
		
		System.out.println("Your monthly bill amount is: " + df.format(billAmount));
	} //end of the main method
}//end of the class