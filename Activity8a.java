import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity8a
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R###,##0.00");
		
		final double EMPLOYEE = 0.08;
		final double DEPARTMENT = 0.1;
		
		double salary,newSalary;
		char department;
		
		
		System.out.print("What is the current salary? R ");
		salary = kd.nextDouble();
		System.out.print("In what department is the employee? (Enter a capital letter.): ");
		department = kd.next().charAt(0);
		
		
		if (department == 'c')
		{
			System.out.println("You  recieve 10% increase" );
			newSalary = salary * (1 + DEPARTMENT);
		}
		else 
		{
			System.out.println("You recieve 8% increase ");
			newSalary = salary * (1 + EMPLOYEE);
		}
		
		System.out.println("The new salary is " + df.format(newSalary));
	}
}