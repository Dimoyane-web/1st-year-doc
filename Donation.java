import java.util.Scanner;
import java.text.DecimalFormat;


public class Donation
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		int Counter = 0;
		double Amount,TotalAmount = 0;
		char Answer;
		
		System.out.print("Do you want to donate? Y/N ");
		Answer = Character.toUpperCase(kd.next().charAt(0));
		
		while( Answer == 'Y')
		{
			Counter++;
			System.out.print("How much do you want to donate? ");
			Amount = kd.nextDouble();
			
			TotalAmount = TotalAmount + Amount;
			
			System.out.print("Do you want to donate? Y/N ");
			Answer = Character.toUpperCase(kd.next().charAt(0));
		}
		System.out.println("You Collected " + df.format(TotalAmount));
		System.out.println("There were " + Counter + " donations");
	}
}
		
			