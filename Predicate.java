import java.util.Random;
import java.util.Scanner;

public class Predicate {
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner kd = new Scanner(System.in);
		
		int iRandomNumber = rd.nextInt(99999999 - 1000000 + 1) + 1000000;
		
		String sNumber = "22";
		 
		 
		System.out.println("Student Number: " + sNumber + iRandomNumber );
		
		//declaring constnat variable
		final double SEMESTER_TEST = 0.2;
		final double CLASS_TEST = 0.1;	
		
		
		int sSemester1,sSemester2,sSemester3;
		int sClassTest1,sClassTest2,sClassTest3,sClassTest4;
		double rSemesterTestWeight,rClassTestWeight,rPredicateMark;
		
		System.out.print("Enter Semester Test 1: ");
		sSemester1 = kd.nextInt();
		System.out.print("Enter Semester Test 2: ");
		sSemester2 = kd.nextInt();
		System.out.print("Enter Semester Test 3: ");
		sSemester3 = kd.nextInt();
		
		System.out.print("Enter Class Test 1: ");
		sClassTest1 =kd.nextInt();
		System.out.print("Enter Class Test 2: ");
		sClassTest2 = kd.nextInt();
		System.out.print("Enter Class Test 3: ");
		sClassTest3 = kd.nextInt();
		System.out.print("Enter Class Test 4: ");
		sClassTest4 = kd.nextInt();
		
		
		//processing
		rSemesterTestWeight = ((sSemester1 + sSemester2 + sSemester3) * SEMESTER_TEST);
		rClassTestWeight = ((sClassTest2 + sClassTest3 + sClassTest4) * CLASS_TEST);
		rPredicateMark = rClassTestWeight + rSemesterTestWeight;
		
	System.out.println("===== RESULTS ====");
	System.out.println("The Student Number is " + sNumber + iRandomNumber);
	System.out.println("Semester Test Weight Total: " + rSemesterTestWeight + "%");
	System.out.println("Class Test Weight Total: " + rClassTestWeight + "%");
	System.out.println("Predicate Mark: " + rPredicateMark + "%");
	}
}