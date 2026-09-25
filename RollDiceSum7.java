import java.util.Random;

public class RollDiceSum
{
	public static void main(String [] args)
	{
		
		Random kd = new Random();
		
		int num1,num2,answer,sum,counter = 0;
		
		num1 = kd.nextInt(6) + 1;
		num2 = kd.nextInt(6) + 1;
		
		sum = num1 + num2;
		
		while( sum != 7)
		{
			System.out.println("Here I start rolling.");
			counter++;
			
			System.out.println(num1 + " + " + num2 + " + " + " = " + sum);
			
			
			num1 = kd.nextInt(6) + 1;
			num2 = kd.nextInt(6) + 1;
		}
		System.out.println("All done - I had to roll the dice " + counter + " times.");
	}
}
			
		
		