//260843222 Mr M Mphelo
import java.util.Scanner; // step 1 create a scanner file

public class Cookie_Sale //step 2 start of class
{
	public static void main(String[] args) //step 3 start of the main class
	{
		Scanner kb = new Scanner(System.in); //step 4 create an object 
		
		// step 5 declare constant
		final double PACKAGING_COST = 0.05;
		
		//step 6 declare inputs 
		int numberOfPacketSold; 
		double pricePerPacket;
		double costPerPacket;
		
		
		//step 7 prompt the user to enter the number of packets sold
		System.out.print("Enter the number of packets sold: ");
		numberOfPacketSold = kb.nextInt();
		
		// step 8 prompt the user to enter the price per packet
		System.out.print("Enter the price per packet: R");
		pricePerPacket = kb.nextDouble();
		
		//step 9 prompt the user to enter the cost per packet
		System.out.print("Enter the cost per packet: R");
		costPerPacket = kb.nextDouble();
		
		//cacluating 
		double totalsales = numberOfPacketSold * pricePerPacket;
		double packagingCost = totalsales * 0.05;
		double totalProductionCost = numberOfPacketSold * costPerPacket;
		double profit = totalsales - (packagingCost + totalProductionCost);
		
		//displaying the results
		System.out.println();
		System.out.println("Total sales: R" + totalsales);
		System.out.println("Packaging cost: R" +  packagingCost);
		System.out.println("Total production cost: R" + totalProductionCost);
		System.out.println("Profit: R" + profit);
		
	} //end of the main method
} //end of the class
		
		
		