import java.util.Scanner;

public class TutLibraries{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		String Name;
		int HoursWorked;
		double PayRate,Salary;
		
		System.out.print("Please provide the name of the Assisant: ");
		Name = kd.next();
		System.out.print("Please provide the hours worked: ");
		HoursWorked = kd.nextInt();
		System.out.print("Please provide the pay per hour: ");
		PayRate = kd.nextInt();
		
		
		Salary = PayRate * HoursWorked;
		
		System.out.println("For this month, " + Name + " will earn a total of R" + Salary);
	}
}