import java.util.Scanner;
import java.util.Random;


public class SubtractQuiz
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		Random rd = new Random();
		
		int num1,num2,answer,sum,counterQuestion = 0,counterAnswer = 0;
		
		
		
		while(counterQuestion <= 4)
		{
			
			num1 = rd.nextInt(9) + 1; //numbers from 1- 9 digits
			num2 = rd.nextInt(9) + 1;
			
			sum = num1 - num2;
		
			counterQuestion++;
			System.out.println("This is question number " + counterQuestion);
			
			System.out.print("What is " + num1 + " - " + num2 + "?");
			answer = kd.nextInt();
			
			if (answer == sum)
			{
				System.out.println("Correct!");
				counterAnswer++;
			}
			else
				System.out.println("No! " + num1 + " - " + num2 + " = " + sum);
			
		}
		System.out.println("You had " + counterAnswer + " correct answers.");
	}
}