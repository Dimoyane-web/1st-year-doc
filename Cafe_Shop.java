import java.util.Scanner;

public class Cafe_Shop{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		final double COFFEE = 30.50;
		final double PASTRY = 22.99;
		final double TAX_FEE = 0.075;
		
		int NumberOfCoffees,NumberOfPastries;
		double Subtotal,Tax,Total;
		
		System.out.print("Enter the Quantity of coffees: ");
		NumberOfCoffees = kb.nextInt();
		System.out.print("Enter the Quantity of pastries: ");
		NumberOfPastries = kb.nextInt();
		
		
		//processing
		double Quantity1 = NumberOfCoffees * COFFEE;
		double Quantity2 = NumberOfPastries * PASTRY;
		Subtotal = Quantity1 + Quantity2;
		Tax = Math.round((Subtotal * TAX_FEE) * 100)/100.0;
		Total = Math.round((Subtotal + Tax)*100)/100.0;
		
		System.out.println("Subtotal: R" + Subtotal);
		System.out.println("Tax: R" + Tax);
		System.out.println("Total bill including tax: R" + Total);
	}
}