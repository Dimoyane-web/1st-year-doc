//260843222
import java.util.Scanner; //create a file scanner from java.util package

public class Calculate_Average { //start of the class
	
	public static void main(String[] args) { //start of the main method 
		
		//create an object file from the Scanner file
		Scanner kb = new Scanner(System.in);
		
		//declaring variables
		String name;
		int PPA,COH,CFA;
		double average;
		final double TOTAL_MODULES = 3;
		
		//prompt the user to enter the name oo the student whose avarage is to be calculated
		System.out.print("Enter the name of the student: ");
		name = kb.nextLine();
		
		//prompting the user to enter the marks obtained in PPA,CFA & COH
		System.out.print("Enter the marks obtained in PPA: ");
		PPA = kb.nextInt();
		System.out.print("Enter the marks obtained in COH: ");
		COH = kb.nextInt();
		System.out.print("Enter the marks obtained in CFA: ");
		CFA = kb.nextInt();
		
		//calculate the average score
		average = (PPA + CFA + COH) / TOTAL_MODULES;
		
		//display the average on the screen
		System.out.println();
		System.out.println("Enter the Name of the student: " + name);
		System.out.println("Enter the marks obtained in PPA: " + PPA);
		System.out.println();
		System.out.println("Enter the marks obtained in COH: " + COH);
		System.out.println();
		System.out.println("Enter the marks obtained in CFA: " + CFA);
		System.out.println();
		System.out.println("In the three tests conducted: " + name + " scored an average of " + average +"%");
	} //end of the main mwthod
} //end of the class