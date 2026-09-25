import java.util.Scanner;
import java.text.DecimalFormat;

public class Savings
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R,000.00");
		
		double InvestAmount,TargetAmount,InterestAmount;
		int InterestRate,CounterYears = 0;
		
		do
		{
			System.out.print("Initial amount to invest (a vaule > 0) ");
			InvestAmount = kd.nextDouble();
		}while(InvestAmount <= 0);
		
		
		do{
			System.out.print("Target you want to achieve (must be more than)" + InvestAmount + ":");
			TargetAmount = kd.nextDouble();
		}while(TargetAmount <= InvestAmount);
		
		
		do
		{
			System.out.print("Interest rate (value greater than 0): ");
			InterestRate = kd.nextInt();
		}while(InterestRate <= 0);
		
		
		while (InvestAmount <= 0)
		{	
			CounterYears++;
			InterestAmount = InvestAmount * (InterestRate/100) + InvestAmount;
			System.out.println("After year " + CounterYears + " you will have have " + df.format(InterestAmount));
		}
		
		
		System.out.println("After " + CounterYears + " years you will have more than " + df.format(TargetAmount));
	}
}

			
		