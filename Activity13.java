import java.util.Scanner;

public class Activity13
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		
		final double TICKET_PRICE = 50.00;
		final double DISCOUNT = 0.2;
		
		int age;
		
		System.out.print("Please enter your  age: ");
		age = kd.nextInt();
		
		
		if ( age > 4 || age <= 12 && age > 60)
		{
			System.out.println("You qualify for a discount");
		}
		else 
		{
			System.out.println("You don\'t qualify");
		}
	}
}

			