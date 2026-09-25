import java.util.Scanner; //importing Scanner file from java.util package
import java.text.DecimalFormat; //importing DecimalFormat file from java.text package

public class HomeActivity
{ //start of the class
	public static void main(String[] args)
	{ //start of the main method
		
		
		//instantiate Scanner
		Scanner kd = new Scanner(System.in);
		//instantiate DecimalFormat 
		DecimalFormat df = new DecimalFormat("R0.00");
		
		//constant variable 
		final double DELIVERY_AMT = 80.00;
		
		//declare variables
		double Amount,Total_Amt;
		
		//prompting the user to enter the total purchase amount
		System.out.print("Enter the total purchase amount: ");
		Amount = kd.nextDouble();
		
		Total_Amt = Amount + DELIVERY_AMT;
		
		if (Amount >= 500)
		{//start of if-statements
			System.out.println("Total amount to pay: " + df.format(Amount) + " You qualify for free delivery ");
		} //end of if-statements
		else 
		{ //start of else statements
			System.out.println("Total amount to pay: " + df.format(Total_Amt) + " You dont qualify for delivery.");
		} //end of else statements
	} //end of main method
} //end of the class
			
			
			 
	