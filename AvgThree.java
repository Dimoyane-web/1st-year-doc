import java.util.Scanner;

public class AvgThree{
	
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		double Average;
		int Mark1,Mark3,Mark2;
		
		System.out.print("Enter the marks on test 1: ");
		Mark1 = kd.nextInt();
		System.out.print("Enter  the marks on test 2: ");
		Mark2 = kd.nextInt();
		System.out.print("Enter the marks on test 3: ");
		Mark3 =kd.nextInt();
		
		
		Average = (Mark1 + Mark2 + Mark3) / 3;
		
		int FinalAvg = (int) Math.ceil(Average);
		
		System.out.println("The average of the 3 test are: " + FinalAvg);
	}		
}