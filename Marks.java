//260843222 Mr M Mphelo
import java.util.Scanner; //step 1 import the scanner file

public class Marks //step 2 define the class
{
	public static void main(String[] args) //step 3 start of the main method
	{
		// step 4 create a scanner object
		Scanner kb = new Scanner(System.in);
		
		//step 5 declare varaibles
		int student1, student2, student3;
		
		//step 6 prompt the user to enter marks of each student
		System.out.print("Enter mark for Student 1: ");
		student1 = kb.nextInt();
		
		System.out.print("Enter mark for Student 2: ");
		student2 = kb.nextInt();
		
		System.out.print("Enter mark for Student 3: ");
		student3 = kb.nextInt();
		
		//step 7 calculating the total marks (Processing)
		int total = student1 + student2 + student3;
		
		//step 8 computing average marks
		double average = total / 3;
		
		//displaying all the input values
		System.out.println();
		System.out.println("=== RESULTS ===");
		System.out.println("Student 1 Mark: " + student1);
		System.out.println("Student 2 Mark: " + student2);
		System.out.println("Student 3 Mark: " + student3);
		
		//output of values
		
		System.out.println("Total Marks: " + total);
		System.out.println("Average Marks: " + average);
		
		
	} //end of the main class
}