import java.util.Random;

public class RollDiceSum
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		
		final int SUM_DICE = 7;
		int num1,num2,sum,counter =0;
		
		System.out.println("Here i start rolling.");
		
		num1 = rd.nextInt(6) + 1;
		num2 = rd.nextInt(6) + 1;
		
		sum = num1 + num2;
		
		//while loop
		while(sum != SUM_DICE)
		{
			num1 = rd.nextInt(6) + 1;
			num2 = rd.nextInt(6) + 1;
			
			sum = num1 + num2;
			counter++;	
			
			System.out.println(num1 + " + " +  num2 + "=" + sum);
		}
		System.out.println("All done - I had to roll the dice " + counter + " times.");
	}
}
