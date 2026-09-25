import java.util.Scanner;
import java.text.DecimalFormat;


public class Ticket_Concert
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		final double ADULT = 45.50;
		final double YOUNGER = 60.00;
		
		int age;
		
		System.out.print("Enter Age: ");
		age = kd.nextInt();
		
		//prpcessing
		if (age >= 18)
		{
			System.out.println("You need to pay: " + (df.format(ADULT)));
		}
		else
		{
			System.out.println("You need to pay: " + (df.format(YOUNGER)));
			
		}
	}
}