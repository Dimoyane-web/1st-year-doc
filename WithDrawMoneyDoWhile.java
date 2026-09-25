import java.util.Scanner;
import java.text.DecimalFormat;

public class WithDrawMoneyDoWhile
{
	public static void main(String[] agrs)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		final double BALANCE = 5000.00;
		
		int Counter = 0;
		double Withdrawal,RemainingBalance = 0, WithdrawalAmount = 0,FinalRemainingBalance = 0;
		
		
		System.out.print("Enter the amount to withdraw: (0 to stop)");
		Withdrawal = kd.nextDouble();
			
			
			
		do
		{
			
			RemainingBalance = BALANCE - Withdrawal;
			System.out.println("The remaining balance is: " + df.format(RemainingBalance));
			Counter++;
			WithdrawalAmount +=  Withdrawal;
			FinalRemainingBalance = BALANCE - WithdrawalAmount;
			
			System.out.print("Enter the amount to withdraw: (0 to stop)");
			Withdrawal = kd.nextDouble();
		}while(Withdrawal != 0);
		
		System.out.println("Number of withdraws: " + Counter);
		System.out.println("Total amount withdrawn: " + df.format(WithdrawalAmount));
		
		System.out.println("The remaining balance is: " + df.format(FinalRemainingBalance));
	}
}