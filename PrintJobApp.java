import java.util.Scanner; //importing Scanner file from the java.util package

public class PrintJobApp{
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		final double PRICE_PER_PAGE = 0.80;
		final double SERVICE_FEE = 5.00;
		final double DISCOUNT = 0.1;
		
		String StudentNumber;
		int NumberOfPages;
		double CostPerPage,DiscountAmount,DiscountPageCost,TotalAmount;
		
		System.out.print("Enter student number: ");
		StudentNumber = kb.next();
		System.out.print("Enter number of pages: ");
		NumberOfPages = kb.nextInt();
		
		
		//Processing
		CostPerPage = Math.round(PRICE_PER_PAGE * NumberOfPages)*100/100.0;
		DiscountAmount = (CostPerPage * DISCOUNT);
		TotalAmount = Math.round(((CostPerPage + SERVICE_FEE) -  DiscountAmount)*100)/100.0;
		
		
		System.out.println();
		System.out.println("--- Print Job Invoice ---");
		System.out.println("Student Number: "+ StudentNumber);
		System.out.println("Pages Printed: "+ NumberOfPages);
		System.out.println("Page Cost: R"+ CostPerPage);
		System.out.println("Discount: R" + DiscountAmount);
		System.out.println("Total Amount: R" + TotalAmount);
	}
}