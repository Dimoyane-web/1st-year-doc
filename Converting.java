import java.util.Scanner;
public class LoanInstallments {
	public static void main(String[] args) {
		
		Scanner kd = new Scanner(System.in);
		
		double rLoanAmt,rInterest,rTotalLoanAmt,rInstallment;
		int iYearsToPay;
		
		//inputs 
		System.out.print("Please enter the amount to be borrowed: ");
		rLoanAmt = kd.nextDouble();
		System.out.print("Please enter the interest rate[%]: ");
		rInterest = kd.nextDouble();
		
		
		rTotalLoanAmt = rLoanAmt * (rInterest/100 * 1);
		
		System.out.println(" Final Loan Amount: R" + rTotalLoanAmt);
		System.out.print("Please enter the number of years loan will be paid over: ");
		iYearsToPay = kd.nextInt();
		
		rInstallment = rLoanAmt/(iYearsToPay * 12);
		
		System.out.println("You will payback an installement of: R" + rInstallment);
	}
}		