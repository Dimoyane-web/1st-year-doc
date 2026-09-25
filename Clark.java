import java.text.DecimalFormat; //importing the decimal format class from the java.text package
import java.util.Scanner; //importing the scanner class from the java.util package

public class Clark{ //start of the class
	 public static void main(String[] args){ //start of the main class
		 
		 Scanner kd = new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat("R0.00");
		 
		 //declaring constant variables 
		 final double INTEREST_RATE = 0.0705;
		 
		 //declaring variables
		 int NumberOfYears;
		 double Amount, Simple,Compound,Quaterly,Best;
		 
		 //promting the user to enter the number of years and the amount that they want to invest
		 System.out.print("Please enter the amount to invest: R");
		 Amount = kd.nextDouble();
		 System.out.print("how many years do you wish to invest for: ");
		 NumberOfYears = kd.nextInt();
		 
		 //Processing
		 Simple = (Amount * INTEREST_RATE * NumberOfYears) + Amount;
		 Compound =  Amount * Math.pow((1 + INTEREST_RATE),NumberOfYears);
		 Quaterly = Amount * Math.pow((1 + INTEREST_RATE / 4),(4* NumberOfYears));
		 
		 Best = Math.max(Simple,Math.max(Compound,Quaterly));
		 
		 
		 //output
		 System.out.println("\nInvestment Results @ 7.05 Interest:" + "\n-----------------------------------------" + "\nOption\t\t|Future Value" + "\n------------------------------------------" + "\nSimple Interest\t\t\t|" + df.format(Simple) + "\nCompound Interest (Yearly)\t|" + df.format(Compound) + "\nCompound Interest (Quaterly)\t|" + df.format(Quaterly) + "\n-----------------------------------------" + "\n\n>>The best performing option yields:" + df.format(Best));
		 
	 }
}