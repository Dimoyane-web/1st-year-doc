import java.util.Scanner;
import java.util.Random;

public class PencilDistributionSimulator {
	
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
		// Declare variables         
        int iGrade, iNumStudents, iNumPencils, iPencilsPerStudent, iRemainingPencils;
        String sNameOfTeacher;
		int Min = 50;
		int Max = 100;
 
        // Input 
        System.out.print("Please enter grade taught (A whole number): ");
        iGrade = kb.nextInt();
        System.out.print("Enter teacher’s name: "); 
        sNameOfTeacher = kb.next();
        System.out.print("Please enter the number of students present: "); 
        iNumStudents = kb.nextInt(); 
 
        // Initialize number of pencils with a random value between 50 and 100 
        iNumPencils = rd.nextInt(Max - Min + 1) + Min; 
 
        // Calculate the number of pencils each student will receive 
        iPencilsPerStudent = iNumPencils / iNumStudents; 
        // Calculate the remaining pencils after distribution 
        iRemainingPencils = iNumPencils % iNumStudents; 
 
         //Output 
        System.out.println("Teacher: " + sNameOfTeacher); 
		System.out.println("Grade taught: " + iGrade);
        System.out.println("Number of students present: " + iNumStudents);
        System.out.println("Total number of pencils: " + iNumPencils); 
        System.out.println("Each student will receive " + iPencilsPerStudent + " pencils."); 
        System.out.println("There are " + iRemainingPencils + " pencils left after distribution.");
	}
}