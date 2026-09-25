import java.util.Scanner;

public class PainterFee{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		final double FEE_PER_MINUTE = 7.50;
		double Cost,TotalFee;
		double Time;
		
		
		System.out.print("Privide the cost of paint: ");
		Cost = kd.nextDouble();
		System.out.print("Provide the hours spent painting (1 decimal): ");
		Time = kd.nextDouble();
		 
		 
		TotalFee = Cost * 2 + Time * 60 *FEE_PER_MINUTE;
		
		System.out.println("Total Painter Fee will be: " + TotalFee);
	}
}