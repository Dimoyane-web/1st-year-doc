import java.util.Scanner;

public class Activity23a
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		double number;
		
		System.out.print("Enter the number that is greater or equal to 1: ");
		number = kd.nextDouble();
		
		
		if (number <=20)
		{
			number  *=  1.05;
			
			System.out.println("New value of number: " + number);
		}
		else
		{
			if (number >=21)
			{
				number *= 1.08;
				System.out.println("New value of  number: " + number);
				
			}
			else
			{
				System.out.println("Incorrect value was entered" );
			}
		}
	}
}