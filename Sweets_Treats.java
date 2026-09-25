import java.util.Scanner; (12)

public class Sweets_Treats{
	public static void  main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		final double DAIRY = 80.50;
		final double NON_DAIRY = 99.99;
		final double TAX_RATE = 0.079;
		
		int QuantityOfDairy,QuantityOfNonDairy;
		double DairyIceCream,NonDairyIceCream,Subtotal,Tax,FinalAmount;
		
		System.out.print("Welcome to Sweet Treats Ice Cream Parlour!");
		System.out.print("Please enter the quantity of Dairy ice cream (R 80.50 each): ");
		QuantityOfDairy = kd.nextInt();
		System.out.print("Please enter the quantity of Non-Dairy ice cream (R 99.99 each): ");
		QuantityOfNonDairy = kd.nextInt();
		
		
		DairyIceCream = QuantityOfDairy * DAIRY;
	    NonDairyIceCream = QuantityOfNonDairy * NON_DAIRY;
		Subtotal  = DairyIceCream + NonDairyIceCream;
		Tax  = Subtotal * TAX_RATE;
		FinalAmount = Math.round((Subtotal + Tax)*100)/100.0;
		
		System.out.println("\n");
		System.out.println("Order Summary: ");
		System.out.println("Dairy Ice Cream: " + QuantityOfDairy +" @ R 80.50 each = R " + DairyIceCream);
		System.out.println("Non Dairy Ice Cream: " + QuantityOfNonDairy + " @ R99.99  each = R " + NonDairyIceCream);
		System.out.println("Subtotal: R " + Subtotal);
		System.out.println("Tax (7.9%): R " + Tax);
		System.out.println("Total: R " + FinalAmount);
	}
}