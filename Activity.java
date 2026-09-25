import java.util.Scanner;
import hava.util.Random;




public class Activity
{
	public static void main(String [] args)
	{
		 
		
		Scanner kd = new Scanner(System.in);
		Random rd = new Random();
		
		
		
		int num1, num2;
		
		double product, answer;
		
		num1 = rd.nextInt(10) + 1;
		num2 = rd.nextInt(10) + 1;
		
		answer = num1 * num2;
		
		System.out.print("What is " + num1 + " multiplied by " + num2 );
		product  = kd.nextDouble();
		
		if ( answer == product);
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Incorrect. The correct answer is " + answer);
		}
	}
}