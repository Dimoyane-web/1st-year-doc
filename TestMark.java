import java.util.Scanner; 
import java.util.Random;

public class TestMark {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int Max = 229999999;
		int Min = 220000000;
		
		int StudentNumber = rd.nextInt(Max - Min + 1) + Min;
		
		
		Scanner kd = new Scanner(System.in);
		
		final double SEMESTER_TEST_WEIGHT = 0.2;
		final double CLASS_TEST_WEIGHT = 0.1;
		double Predicate;
		double SemesterTest1,SemesterTest2,SemesterTest3,ClassTest1,ClassTest2,ClassTest3,ClassTest4;
		double StWeight,CtWeight;
		double ClassTestMin;
		System.out.print("Enter Semester Test 1: ");
		SemesterTest1 = kd.nextInt();
		System.out.print("Enter Semester Test 2: ");
		SemesterTest2 = kd.nextInt();
		System.out.print("Enter Semester Test 3: ");
		SemesterTest3 = kd.nextInt();
		
		System.out.print("Enter Class Test 1: ");
		ClassTest1 = kd.nextInt();
		System.out.print("Enter Class Test 2: ");
		ClassTest2 = kd.nextInt();
		System.out.print("Enter Class Test 3: ");
		ClassTest3 = kd.nextInt();
		System.out.print("Enter Class Test 4: ");
		ClassTest4 = kd.nextInt();
		
		
		//processing
		StWeight = ((SemesterTest1 + SemesterTest2 + SemesterTest3)* 0.2);
		ClassTestMin = Math.min(ClassTest1,Math.min(ClassTest2,Math.min(ClassTest3,ClassTest4)));
		CtWeight = ((ClassTest1 + ClassTest2 + ClassTest3 + ClassTest4 - ClassTestMin) * 0.1);
		
		Predicate = StWeight + CtWeight;
	
	
		
		
		
		
		
		
		
		System.out.println("==== Results ==== ");
		System.out.println("The Student Number is " + StudentNumber);
		System.out.println("Semester Test Weight Total: " + StWeight + "%");
		System.out.println("Class Test Weight Total: " + CtWeight + "%");
		System.out.println("Predicate Mark: " + Predicate + "%");
		 
	}
}
