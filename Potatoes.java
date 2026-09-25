import java.util.Scanner;
import java.text.DecimalFormat;


public class Potatoes{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		final int WEIGHTING = 7;
		final double COST_PRICE_PER_KILOGRAM = 3.40;
		final double SELLING_PRICE_PER_KILOGRAM = 69.99;
		
		
		
		int NumberOfBags, WeightOfFirstBag,WeightOfSecondBag;
		double TotalWeightOfPotatoes,CostOfPotatoes,Revenue,Profit;
		
		System.out.print("Enter the weight of the first crate in  kilograms: ");
		WeightOfFirstBag = kd.nextInt();
		System.out.print("Enter the weight of the first crate in  kilograms: ");
		WeightOfSecondBag = kd.nextInt();
		System.out.println("*********************************************************");
		
		
		
		NumberOfBags = (WeightOfFirstBag + WeightOfSecondBag) / WEIGHTING;
		
		CostOfPotatoes = NumberOfBags * COST_PRICE_PER_KILOGRAM;
		Revenue = NumberOfBags * SELLING_PRICE_PER_KILOGRAM;
		Profit = Revenue - CostOfPotatoes;
		
		System.out.println("Number of bags of potatoes to be sold: " + NumberOfBags);
		
		System.out.println("The total cost of potatoes: " + df.format(CostOfPotatoes));
		System.out.println("Total revenue from selling bags of potatoes:" + df.format(Revenue));
		System.out.println("Profit to b made: " + df.format(Profit));
	}
}
	