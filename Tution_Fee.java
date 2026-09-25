//260843222 Mr M MMphelo
import java.util.Scanner; //step 1 importing the scanner package

public class Tution_Fee // step 2 start of the class
{
	public static void main(String[] args) // step3 start of the main method  
	{
		// step 4 create scanner object
		Scanner kb = new Scanner(System.in);
		
		//step 5 declare inputs
		int student1;
		int student2;
		int student3;
		
		//step 6 prompting the user to enter the tution fee of each of the student
		System.out.print("Enter fee for the student 1: ");
		student1 = kb.nextInt();
		System.out.print("Enter fee for the student 2: ");
		student2 = kb.nextInt();
		System.out.print("Enter fee for the Student 3: ");
		student3 = kb.nextInt();
		
		//step 7 processing (adding the tution fee of all the 2 students)
		int totalfees = student1 + student2 + student3;
		
		//step division to find the average 
		double average = totalfees / 3.0;
		
		// step 8 modulus devision
		double remainder = totalfees % 7;
		
		//step 10 displaying output
		System.out.println();
		System.out.println("==== RESULTS ====");
		System.out.println("Total fees: " + totalfees);
		System.out.println("Avarage Fee: " + average);
		System.out.println("Remainder: " + remainder);
	} //end of the main method
}//end of class