import java.util.Scanner;
public class ConvertPounds{
	
	public static void main(String[] args){ 
		
		
		Scanner kb = new Scanner(System.in);
		
		//declare constant variable 
		final double ONE_POUND = 22.00;
		
		double Amount;
		
		//prompting the user to enter the amount they have in pounds
		System.out.print("Enter the amount you have in pounds: ");
		Amount = kb.nextDouble();
		
		//processing
		double AmountInRands = Amount * ONE_POUND;
		
		double TotalAmount = Math.round(AmountInRands * 100) / 100.0;
		
		
		System.out.println("The total amount in R: " + TotalAmount);
	




	
	}
	
}