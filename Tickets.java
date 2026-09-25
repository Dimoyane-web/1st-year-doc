//26084322
import java.util.Scanner; //create a scanner file from the java.util package


public class Tickets { //start of the class
	
	public static void main(String[] args) { //start of the main method
	
		
		//create an object from the scanner file
		Scanner kb = new Scanner(System.in);
		
		//constant variable
		final double ONE_TICKECT = 200;
		
		//declarng variables
		String name;
		int numberOfTickets;
		double totalCost;
		
		//prompting the student to enter his\her name
		System.out.print("What is your name? ");
		name = kb.nextLine();
		System.out.print("How many tickets do you want to buy? ");
		numberOfTickets = kb.nextInt();
		
		//processing
		totalCost = numberOfTickets * ONE_TICKECT;
		
		//displaying the outputs
		System.out.println("What is your name? " + name);
		System.out.println("How many tickets do you want to but? " + numberOfTickets);
		System.out.println( name + " you need to pay R" + totalCost);
	} //end the main method
} //end of the class