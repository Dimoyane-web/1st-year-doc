import java.util.Scanner;
import java.util.Random;

public class Activity11c
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		Random rd = new Random();
		
		
		int sum,first_number,second_number,generate_sum;
		
		
		first_number = rd.nextInt(10) + 1;
		second_number = rd.nextInt(10) + 1;
		
		
		
		System.out.println("The first number generated: " + first_number);
		System.out.println("The second number generated: " + second_number);
		
		
		System.out.print("Enter the sum of " + first_number + " + " + second_number );
		sum = kd.nextInt();
		
		generate_sum = first_number + second_number;
		
		if ( sum == generate_sum)
		{
			System.out.println("The answer is correct");
		}
		else
		{
			System.out.println("The answer s wrong");
		}
	}
}
			
		
		
		
		