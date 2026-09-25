import java.util.Scanner;

public class Multiplication
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		int NumberTable,Value,Answer,Counter;
		
		System.out.print("Which multiplication table do you want to see? : ");
		NumberTable = kd.nextInt();
		
		System.out.print("How many values of the " + NumberTable + " X multiplication table do you want? : ");
		Value = kd.nextInt();
		
		
		for (Counter = 1; Counter <= Value; Counter++)
		{
			Answer = NumberTable * Counter;
			System.out.println(Counter +  " times " + NumberTable + " = " + Answer);
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		