import java.util.Scanner;

public class Investments{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		final double INTEREST = 0.0525;
		
		int Years;
		double CompoundInterest,SimpleInterest,QuarterlyCompound,Amount;
		
		System.out.print("Please enter the amount to invest: ");
		Amount = kb.nextDouble();
		System.out.print("How many years do you wish to invest for: ");
		Years = kb.nextInt();
		
		SimpleInterest = (Amount * INTEREST * Years); 
		CompoundInterest = Math.round((Amount* Math.pow((1 + INTEREST), 4)- Amount)*100)/100.0;
		QuarterlyCompound = Math.round((Amount * Math.pow((1+ INTEREST/4), (4*4)) - Amount)*100)/100.0;
		
		System.out.println("Investments Results @ 5.25% Interest:");
		System.out.println("---------------------------------------------------");
		System.out.println("Option                             |Interest Earned");
		System.out.println("---------------------------------------------------");
		System.out.println("Simple Interest                    |R" + SimpleInterest);
		System.out.println("Compound Interest (Yearly)         |R" + CompoundInterest);
		System.out.println("Compound Interesr (Quarterly)      |R" + QuarterlyCompound);
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println(">>>The best performing option yields: "+ Math.max(SimpleInterest,Math.max(QuarterlyCompound, CompoundInterest))+ " <<<");
	}
}