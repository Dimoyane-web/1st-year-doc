import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity5b {
	public static void main(String[] args)  {
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		double salary, txPerc, taxAmt,
		
		System.out.print("Enter your salary: ");
		salary = kd.nextDouble();
		
		if (salary < 20000)
		{
			taxPerc = 0.18;
		}
		else
		{
			taxPerc = 0.27;
		}
		
		taxAmt = TaxPerc * salary;
		
		System.out.println("Your tax is " + df.format(taxAmt));
		
	}
}	