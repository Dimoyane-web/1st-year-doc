import java.util.Scanner;

public class HighestMark{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		int Mark1,Mark2,HighestTest;
		
		
		System.out.print("Please the enter the marks from test 1: ");
		Mark1 = kb.nextInt();
		System.out.print("Please enter the marks from test 2: ");
		Mark2 = kb.nextInt();
		
		
		//processing
		HighestTest = Math.max(Mark1,Mark2);
		
		
		System.out.println("Highest Test Mark is: " + HighestTest);
	}
}