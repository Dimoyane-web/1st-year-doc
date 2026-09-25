import java.util.Scanner;

public class StudentProfile{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		
		String Faculty = "Faculty of ICT";
		String Message = "Welcome to TUT - we empower people!";
		String StudentNumber, StudentName;
		double Fee;
		
		System.out.print("Enter Student name: ");
		StudentName = kb.nextLine();
		System.out.print("Enter student number: ");
		StudentNumber = kb.nextLine();
		System.out.print("Enter registration fee: ");
		Fee = kb.nextDouble();
		
		System.out.println();
		System.out.println("--- Student Profile ---");
		System.out.println("Name:"+ StudentName);
		System.out.println("Registration Fee:" + Fee);
		System.out.println("Faculty:" + Faculty);
		System.out.println("Message:" + Message);
	}
}