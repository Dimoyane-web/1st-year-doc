import java.util.Scanner; //import scaneer file from java.util package

public class Contractor_Fees { //start of the class
	
	
	public static void main(String[] args) { //start of the main method
		
		
		//create an object from the scanner file
		Scanner kb = new Scanner(System.in);
		
		//declaring constant variables
		final double COST_PER_TILE = 65.45;
		final double DEPOSIT_PERC = 0.1;
		
		//declaring variables
		int Length;
		int Width;
		double Area;
		double TotalCost,Balance,DepositAmount;
		
		//prompting the user to enter the length of the room
		System.out.print("Length of room in meters: ");
		Length = kb.nextInt();
		System.out.print("Width of room in meters: ");
		Width = kb.nextInt();
		
		//performing calculations
		Area = Length * Width;
		TotalCost = Area * COST_PER_TILE;
		DepositAmount = DEPOSIT_PERC * TotalCost;
		Balance = TotalCost - DepositAmount;
		
		//displaying output
		System.out.println("The room is 4.0 x 5.0 ");
		System.out.println("Area " + Area + " square meters");
		System.out.println("Total cost: " + TotalCost);
		System.out.println("Deposit: " + DepositAmount);
		System.out.println("Balance: " + Balance);
	}
}