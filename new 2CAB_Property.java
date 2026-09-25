import java.util.Scanner;

public class CAB_Property{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		double Interest,Amount,FinalLoan,Installment;
		int Years;
		
		System.out.print("Please enter the amount to be borrowed: ");
		Amount = kd.nextDouble();
		System.out.print("Please enter the interest rate[%]: ");
		Interest = kd.nextDouble();
		
		
		FinalLoan = Amount * Interest;
		
		System.out.print("Please enter the number of years loan will be paid over: ");
		Years = kd.nextInt();
		
		Installment = FinalLoan / (Years * 12);
		System.out.Println("You will payback an installement of: "+ Installment);
	}
}