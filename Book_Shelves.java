//260843222 Mr M Mphelo
import java.util.Scanner; //step 1 create a scanner object

public class Book_Shelves // class name
{   //start of thee class

	public static void main(String[] args) //initialising the main method
	{ //start of main method
	
		Scanner kb = new Scanner(System.in);
		
		//declare constant variables
		final int ONE_SHELVE = 5;
		
		//declare variables
		int totalBooks; 
		
		//displaying inputs
		System.out.print("Enter total number of books in storeroom: ");
		totalBooks = kb.nextInt();
		
		//processing calculations 
		int fullShelvesNeeded = (int) totalBooks / ONE_SHELVE;
		int booksStoredInShelves = fullShelvesNeeded * ONE_SHELVE;
		int remainder = totalBooks - booksStoredInShelves;
		
		//percentages 
		double percentageInShelves = (totalBooks % fullShelvesNeeded * 100);
		double percentageRemaining = ( ONE_SHELVE \200 * 100);
		
		//displaying the report
		System.out.println();
		System.out.println("==== BOOK STORAGE REPORT ====");
		System.out.println("Total Books: " + totalBooks);
		System.out.println("Books per shelf: " + ONE_SHELVE);
		System.out.println("Full Shelves Needed: " + fullShelvesNeeded);
		System.out.println("Books Stored in shelves: " + booksStoredInShelves);
		System.out.println("Remaining Books (Remainder): " + remainder);
		
		//percentages
		System.out.println();
		System.out.println("==== PERCENTAGES ====");
		System.out.println("Percentage Stored in Shelves: " + percentageInShelves);
		System.out.println("Percentage Remaining: " + percentageRemaining);
		
	} //end of main metthod
} //end of the class