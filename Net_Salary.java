 //260843222 Mr M Mphelo
import java.util.Scanner; //import a scanner file from the java.util package

public class Net_Salary { //start of the class
	
	public static void main(String[] args) { //start of the main maethod
		
		//create an object file from the scanner
		Scanner kb = new Scanner(System.in);
		
		//declaring a constant variable
		final double ONE_HOUR = 100;
		final double INCREASED_HOURLY_WAGE = 115;
		final double TAX_RATE_PERC = 0.225;
		
		//declaring variables
		double grossSalary,taxToBePaid,netIncome,normalHoursWorkedWage,extraHoursWage;
		int normalHoursWorked = 5;
		int extraHours;
		int hoursWorked;
		
		//prompting the user to enter the number of hours worked
		System.out.print("Please enter number of hours worked: ");
		hoursWorked = kb.nextInt();
		
		//calculations
		normalHoursWorkedWage = normalHoursWorked * ONE_HOUR;
		extraHours = hoursWorked - normalHoursWorked;
		extraHoursWage = extraHours * INCREASED_HOURLY_WAGE;
		
		grossSalary = normalHoursWorkedWage + extraHoursWage;
		taxToBePaid = grossSalary * TAX_RATE_PERC;
		netIncome = grossSalary - taxToBePaid;
		
		//displaying the output
		System.out.println("Gross salary: R " + grossSalary);
		System.out.println("Tax: R " + taxToBePaid);
		System.out.println("NettSalary: R " + netIncome);
	} //end of the main method
} //end of the class