import java.util.Scanner; 
 
public class SalesTracker 
{ 
    public static void main(String[] args) 
   { 
         Scanner keyboard = new Scanner(System.in);
		 
		
         final double PRODUCT_1_PRICE = 75.45;
		 final double PRODUCT_2_PRICE = 24.55;
		 double totalRevenue;
		 int product1Quantity, product2Quantity; 
		 
		 System.out.print("Enter the number of product-1 items bought: ");
		 product1Quantity = keyboard.nextInt(); 
		 
		 System.out.print("Enter the number of product-2 items bought: ");
		 product2Quantity = keyboard.nextInt();
		 
		 
		 totalRevenue = (product1Quantity * PRODUCT_1_PRICE) + (product2Quantity * PRODUCT_2_PRICE); 
         
		 
		 System.out.println("Total Revenue: R" + totalRevenue); 
    } 
} 