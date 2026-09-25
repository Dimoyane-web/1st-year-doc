import java.util.Scanner; //importing Scanner file from the java.util package
import java.text.DecimalFormat; //importing DecimalFormat file from the java.text package

public class Activity8c
{ //start of the class
	public static void main(String[] args)
	{ //start of the main method
	
		//instantiating Scanner & DecimalFormat
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R#,###.00");
		
		//constant variables
		final double FIVE_YEARS_PER_DAY = 300.00;
		final double LESS_YEARS_PER_DAY = 250.00;
		
		//declare variables 
		int numberOfYears,numberOfDays;
		double final_Wage;
		
		//prompting the user to enter the number of years they worked
		System.out.print("Number of years in the company: ");
		numberOfYears = kd.nextInt();
		//prompting the user to enter the number of days they worked
		System.out.print("Number of days employee worked: ");
		numberOfDays = kd.nextInt();
		
		//processing
		if (numberOfYears >= 5)
		{
			final_Wage = numberOfDays * FIVE_YEARS_PER_DAY;
		}
		else
		{
			final_Wage = numberOfDays * LESS_YEARS_PER_DAY;
		}
		
		System.out.println("The final wage is  " + df.format(final_Wage));
	}
}
