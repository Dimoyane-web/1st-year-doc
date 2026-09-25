import java.util.Scanner;

public class  Simulator{
	public static void main(String[] agrs) {
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		final double NOVEL = 350.99;
		final double TEXTBOOK = 780.99;
		final double TAX_FEE = 0.08;
		
		
		int Quantity1, Quantity2;
		double Subtotal,Tax,Total;
		
		
		System.out.println("Enter the quantity of novels:");
		Quantity1 = keyboard.nextInt();
		System.out.println("Enter the quantity of textbooks: ");
		Quantity2 = keyboard.nextInt();
		
		//processing
		double Novel_Price = Quantity1 * NOVEL;
		double TextBook_Price = Quantity2 * TEXTBOOK;
		Subtotal = Math.round((Novel_Price + TextBook_Price)*100)/100.0;
		Tax = Math.round( (Subtotal * TAX_FEE) *100)/100.0;
		Total = Math.round((Subtotal + Tax) * 100)/100.0;
		
		System.out.println("Subtotal: R" + Subtotal);
		System.out.println("Tax: R" + Tax);
		System.out.println("Total bill incuding tax: R"+ Total);
	}
}
		
		
		
		
		