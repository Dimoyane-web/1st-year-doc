import java.util.Scanner; //importing Scanner class from the java.util package

public class ChairsStudentCentre //classname
{ //start of  the class
	
	public static void main(String[] args) //main method 
	{ //start of the main method 
		
		//create an a object from Scanner class 
		Scanner keyboard = new Scanner(System.in);
		
		//declring constant variables
		final int ONEROWOFCHAIRS = 54;
		
		//declare variables
		int iNumberOfChairsAvailable;
		int iNumberOfChairsLeft;
		int iMaximumNumberOfRows;
		
		//prompting the user to enter the number of chairs available
		System.out.print("How many chairs are available ");
		iNumberOfChairsAvailable = keyboard.nextInt();
		
		//processing
		iMaximumNumberOfRows = iNumberOfChairsAvailable / ONEROWOFCHAIRS;
		iNumberOfChairsLeft = iNumberOfChairsAvailable % ONEROWOFCHAIRS;
		
		//output
		System.out.println("The maximum number of rows is " + iMaximumNumberOfRows);
		System.out.println(iNumberOfChairsLeft + " chairs will be left");
	} //end of the main method 
} //end of the class