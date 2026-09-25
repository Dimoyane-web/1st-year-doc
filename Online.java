import java.util.Scanner;

public class Online 
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		double number;
		
		System.out.print("Enter a value that is greater or equal to 1: ");
		number = kd.nextInt();
		
		if (number < 1)
		{
			System.out.println("Incorrect value was entered.");
		}
		else 
		{
			if (number <= 20 )
			{
				number = number + number * 0.05;
			}
			else 
			{
				number = number - number * 0.08;
			}
		}
		
		System.out.println("The new value is " + number);
	}
}
		
		