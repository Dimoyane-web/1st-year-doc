//260843222 Mr M Mphelo
import java.util.Scanner; //create a file Scanner from the java.util package

public class Phone_Call { //start of the class
	
	public static void main(String[] args) { //start of the main method
		
		
	//create an object from the scanner file
	Scanner keyboard = new Scanner(System.in);
	
	//declaring constant variables
	final double THREE_MINUTES = 1.50;
	final double ONE_MINUTE = 0.15;
	
	//declare variables
	int numberOfMinutes;
	double remaining_minutes;
	double totalCost;
	double costOfRemaningMinutes;
	
	//prompting the user to enter number of minutes spend on the call
	System.out.print("Duration of call: ");
	numberOfMinutes = keyboard.nextInt(); 
	
	//processing
	remaining_minutes = numberOfMinutes - 3;
    costOfRemaningMinutes = remaining_minutes * ONE_MINUTE;
	totalCost = THREE_MINUTES + costOfRemaningMinutes;
	
	
	//displaying the outputs
	System.out.println();
	System.out.println("Duration of call: " + numberOfMinutes);
	System.out.println("The total cost is: R " + totalCost);
	} //end of the main method
} //end of the class