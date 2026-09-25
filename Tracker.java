import java.util.Scanner;

public class Tracker
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		final double PRODUCT1PRICE = 65.55;
		final  double PRODUCT2PRICE = 34.45;
		
		int Product1Quantity,Product2Quantity;
		double TotalRevenue;
		
		System.out.print("Enter the number of product-1 items bought: ");
		Product1Quantity = keyboard.nextInt();
		System.out.print("Enter the number of product-2 items bought: ");
		Product2Quantity = keyboard.nextInt();
		
		
		TotalRevenue = (Product1Quantity * PRODUCT1PRICE) + (Product2Quantity * PRODUCT2PRICE);
		
		System.out.println("Total Revenue: R" + TotalRevenue);
	}
}