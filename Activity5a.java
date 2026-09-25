import java.util.Scanner;
import java.text.DecimalFormat;
public class Activity5a
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		//constant variable
		final double BASIC_COST = 300;
		final double DISCOUNT = 0.05;
		
		//declare variable
		int numberOfKilometres,numberOfDays;
		double costPerKilomtre,kmAmt,cost,costAmtAfterDiscout,totalAmt,disAmt;
		
		
		//prompting the user to enter the number of kilometres they want to travel
		System.out.print("Enter the number of kilometres: ");
		numberOfKilometres = kd.nextInt();
		
		System.out.print("enter the cost per kilometre: ");
		costPerKilomtre = kd.nextDouble();
		
		System.out.print("Enter thr number of days: ");
		numberOfDays = kd.nextInt();
		
		cost = numberOfKilometres * costPerKilomtre;
		disAmt = cost * DISCOUNT;
		costAmtAfterDiscout = cost - disAmt;
		if ( numberOfKilometres > 400)
		{
			totalAmt = (BASIC_COST  + costAmtAfterDiscout) * numberOfDays;
		}
		else
		{	
			totalAmt = (BASIC_COST + cost * numberOfDays);
		}
		System.out.println("You owe: "+ (df.format(totalAmt)));
	}
}