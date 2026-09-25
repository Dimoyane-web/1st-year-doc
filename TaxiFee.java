import java.util.Scanner;

public class TaxiFee{
	public static void main(String[] agrs){
		
		
		Scanner kb = new Scanner(System.in);
		
		final double ADDITIONAL_PASSANGER = 40.00;
		final double BABY_FEE = 0.2;
		final int FIRSTPASSANGER = 6;
		
		
		double InitialFee,AdultPay,BabiesPay,TotalCost,FirstSixPassanger;
		int NumberOfAdults,NumberOfBabies,RemAdults;
		
		System.out.print("Number of adults: ");
		NumberOfAdults = kb.nextInt();
		System.out.print("NUmber of babies: ");
		NumberOfBabies = kb.nextInt();
		System.out.print("Fee for first 6 passengers: R");
		InitialFee = kb.nextDouble();
		
		
		FirstSixPassanger = InitialFee * 6;
		RemAdults = NumberOfAdults - FIRSTPASSANGER;
		
		AdultPay = FirstSixPassanger + (ADDITIONAL_PASSANGER* RemAdults);
		BabiesPay = (InitialFee * NumberOfBabies) * BABY_FEE;
		TotalCost = AdultPay + BabiesPay;
		
		System.out.println("Adults pay         R" + AdultPay);
		System.out.println("Babies pay         R" + BabiesPay);
		System.out.println("======================================");
		System.out.println("TotalCost          R" + TotalCost);
	}
}