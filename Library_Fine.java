//260843222 Mr M Mphelo
import java.util.Scanner; //create a scanner file from the java.util package

public class Library_Fine { //start of the class
	
	public static void main(String[] args) { //start of the main method
		
		
		//create an object file from the scanner
		Scanner kb = new Scanner(System.in);
		
		//declaring constant varible
		final double FINE = 0.5;
		
		//declaring varible
		int numberOfBooks,numberOfDays;
		double Fine_Charged;
		
		//prompting the user to enter the number of books they brought
		System.out.print("How many books: ");
		numberOfBooks = kb.nextInt();
		System.out.print("How many days late: ");
		numberOfDays = kb.nextInt();
		
		//processing
		Fine_Charged = (numberOfBooks * numberOfDays * FINE);
		
		//displaying the outputs
		System.out.println();
		System.out.println("How many books: " + numberOfBooks);
		System.out.println("How many days late: " + numberOfDays);
		System.out.println("The fine is: R " + Fine_Charged);
	} //end of the main method
} //end of the class