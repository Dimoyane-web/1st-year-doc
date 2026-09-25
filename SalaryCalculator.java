import java.text.DecimalFormat;
import java.util.Scanner;


public class SalaryCalculator{
	public static void main(String[] args){
		
		Scanner kd = new  Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R####.0");
		
		int Hours;
		String Name;
		double Salary, Payrate;
		
		
		
		System.out.print("Please enter your name: ");
		Name = kd.next();
		System.out.print("How many hours did you work this month? ");
		Hours = kd.nextInt();
		System.out.print("What is your pay rate  per hour? ");
		Payrate = kd.nextDouble();
		
		Salary = Hours * Payrate;
		
		
		System.out.println(Name + ", your total salary for this month is: " + df.format(Salary));
	}
}