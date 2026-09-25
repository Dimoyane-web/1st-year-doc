//260843222 Mr  M Mphelo
import java.util.Scanner; //create a scanner file from java.util package

public class Pool_Dimensions { //start of the class
	
	public static void main(String[] args) { //start of the main method
		
		//create an object file from the scanner
		Scanner kb = new Scanner(System.in);
		
		
		//declaring variables
		String namePool;
		double length,width,perimeter,area;
		
		//prompting the user to provide the name of the pool used 
		System.out.print("Which pool are you intersted in? ");
		namePool = kb.next();
		System.out.print("What is its length? ");
		length = kb.nextDouble();
		System.out.print("What is its width? ");
		width = kb.nextDouble();
		
		//performing calculations
		perimeter = (length + width) * 2;
		area = length * width;
		
		//displaying the answers
		System.out.println();
		System.out.println("Which pool are you intersted in? " + namePool);
		System.out.println();
		System.out.println("What is its length?" + length);
		System.out.println();
		System.out.println("What is its width?" + width);
		System.out.println();
		System.out.println("The Perimeter of " + namePool + " is " + perimeter + " meters, and its Area is " + area + " square meters.");
		
	} //end of the main method
	
} //end of the class