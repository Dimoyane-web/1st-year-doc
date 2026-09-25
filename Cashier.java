import java.util.Scanner;
import java.text.DecimalFormat;

public  class Cashier
{
	public static void main(String [] args)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		final double VAT = 0.15;
		double Amountdue,itemsAmount,change;
		
		System.out.print("Amount for all items the customer brought: R");
		itemsAmount = kd.nextDouble();
		
		double Vat_Amount = VAT * itemsAmount;
		itemsAmount += Vat_Amount;
		System.out.print("Customer should pay " + df.format(itemsAmount));
		
		System.out.print("\nAmount customer handed to caisher: R");
		Amountdue = kd.nextDouble();
		
		while (Amountdue < itemsAmount)
		{
			System.out.print("It is not enough money - enter the amount again.");
			
			System.out.print("Amount customer handed to caisher: R");
			Amountdue = kd.nextDouble();
		}
		change = Amountdue - itemsAmount;
		System.out.println("Customer must receive " + df.format(change) + " change.");
	}
}
		
		
		