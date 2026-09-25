import java.util.Scanner;

public class Greatest{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		int First,Second,Third,Highest;
		
		
		System.out.print("Enter the first digits: ");
		First = kd.nextInt();
		System.out.print("Enter the second digit: ");
		Second = kd.nextInt();
		System.out.print("Enter the third digit: ");
		Third = kd.nextInt();
		
		Highest = Math.max(First,Math.max(Second,Third));
		
		System.out.println("The greatest number is: " + Highest);
	}
}