import java.util.Scanner;


public class FiveNumbers{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		int First,Second,Third,Fourth,Firth,Sum,Average;
		
		System.out.print("Enter the first digit: ");
		First = kd.nextInt();
		System.out.print("Enter the second digit: ");
		Second = kd.nextInt();
		System.out.print("Enter the third digit: ");
		Third = kd.nextInt();
		System.out.print("Enter the fourth digit: ");
		Fourth = kd.nextInt();
		System.out.print("Enter the firth digit: ");
		Firth = kd.nextInt();
		
		
		Sum = (First + Second + Third + Fourth + Firth);
		Average = Sum / 5;
		
		System.out.println("The sum of the 5 digits: " + Sum);
		System.out.println("The Average of the 5 digits: " + Average);
	}
}