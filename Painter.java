import java.util.Scanner;

public class Painter{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		//Declaring  Constant variables 
		final double FEE_PER_MINUTE = 7.50;
		
		//Declaring variables
		double PaintCost,TimeSpentPainting,TotalFee;
		
		//Prompting the user to enter cost and tie worked on this project
		System.out.print("Provide the cost of paint: R");
		PaintCost = kb.nextDouble();
		System.out.print("Provide the hours spent painting (1 decimal): ");
		TimeSpentPainting = kb.nextDouble();
		
		
		//processing
		TotalFee = PaintCost * 2 + TimeSpentPainting * 60 * FEE_PER_MINUTE;
		
		//output
		System.out.println("Total Painter Fee will be: R" + TotalFee);
	}
}
		