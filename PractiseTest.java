import java.util.Scanner; //import scanner class from the java.util package

public class PractiseTest { //start of the class
	
	public static void main(String[] args) { //start of the main method 
		
		
		//create a scanner object from scanner class
		Scanner kb = new Scanner(System.in);
		
		//declaring constants variables
		final double BASIC_AMT = 400;
		final double EXTRA_AMT = 440;
        final int MIN_DIST = 2;
		final int FOR_ANY_2_CONSTANTS_USED_AVAIL_AMT = 3000;
		final double AVAIL_AMT = 2150;
		
		//declaring variables
		String surname;
		String studentNumber;
		double numberOfDistintions;
		double reward;
		double remainingAmount;
		
		//input
		System.out.print("Provide your surname ");
		surname = kb.next();
		System.out.print("Enter the student number ");
		studentNumber = kb.next();
		System.out.print("enter the number of distintions ");
		numberOfDistintions = kb.nextInt();
		
		
		//processing
		reward = BASIC_AMT * MIN_DIST + (numberOfDistintions) * EXTRA_AMT;
		
		remainingAmount = AVAIL_AMT - reward;
		
		//output
		System.out.println( surname + ",student number: " + studentNumber + ",your reward is R" + reward);
	
	} //end of the main method
} //end of the class