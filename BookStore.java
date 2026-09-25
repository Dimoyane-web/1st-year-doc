import java.util.Scanner;
public class BookStore{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		final double NOVEL = 350.99;
		final double TEXT_BOOK = 780.99;
		final double TAX_FEE = 0.08;
		
		
		int QuantityOfNovels,QuantityOfTextBooks;
		double Subtotal,Tax,TotalAmount;
		
		System.out.print("\nEnter the quantity of novels:\n ");
		QuantityOfNovels = kd.nextInt();
		System.out.print("\nEnter the quantity of textbooks:\n ");
		QuantityOfTextBooks = kd.nextInt();
		
		Subtotal = Math.round((NOVEL * QuantityOfNovels) + (TEXT_BOOK * QuantityOfTextBooks)*100)/100.0;
		Tax = Math.round((TAX_FEE * Subtotal)*100)/100.0;
		TotalAmount = Math.round((Tax + Subtotal)*100)/100.0;
		
		System.out.println("Subtotal: R" + Subtotal);
		System.out.println("Tax: R" + Tax);
		System.out.println("Total bill including tax: R"+ TotalAmount);
		
	}
}
		
		
		
		
		