import java.util.Scanner;

public class ZamaZama{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		
		final double ONE_POINT_R = 5.00;
		final double TEN_POINTS_R = 1.00;
		
		String IdNumber;
		double RewardPoints;
		double Amount,RandValue;
		
		
		System.out.print("Enter your id Number: ");
		IdNumber = kb.nextLine();
		System.out.print("Enter the amount you spent this month: ");
		Amount = kb.nextDouble();
		
		RewardPoints = Amount / ONE_POINT_R;
		RandValue = (RewardPoints / 10);
		
		System.out.println("You have earned: " + RewardPoints + " points");
		System.out.println("You can use R " + RandValue);
	}
}	