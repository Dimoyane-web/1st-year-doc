import java.util.Scanner;
import java.text.DecimalFormat;

public class PayRoll
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		
		char Position;
		String Name;
		String  Answer = "Y";
		double RatePerHour = 0,GrossSalary = 0,Tax = 0,NetSalary = 0;
		int Hours,EmployeeCounter = 0;
		
		System.out.println("====================================="+ "\nABC Warehousing Ltd- Salary Management System"+ "\n======================================================");
		System.out.print("Process an employee? (Y - Yes): ");
		Answer = kd.nextLine();
		
		if (Answer.equalsIgnoreCase("Y"))
		{
			do{
				System.out.print("Enter the  fullname of the employee: ");
				Name = kd.nextLine();
				System.out.print("Enter employee code (P=Packer, S=Supervisor, O=Operations Manager): ");
				Position = Character.toUpperCase(kd.next().charAt(0));
				
				switch(Position)
				{
					case 'Packer (P)': RatePerHour = 45.50; break;
					case 'Supervisor (S)': RatePerHour = 180.00; break;
					case 'Operation Manager (O)': RatePerHour = 390.75; break;
					default: 
					System.out.print("Enter employee code (P=Packer, S=Supervisor, O=Operations Manager): ");
					Position = Character.toUpperCase(kd.next().charAt(0));	
				}
				
				System.out.print("Enter hours worked (1 -180): ");
				Hours = kd.nextInt();
				
				while (Hours > 180 || Hours < 1)
				{ 
					System.out.print("Invalid hours. Enter a vaule between 1 and 180" );
					Hours = kd.nextInt();
				}
				
				System.out.println("------------------Salary Breakdown --------------");
				GrossSalary = Hours * RatePerHour;
				Tax = GrossSalary * (0.12 * GrossSalary);
				NetSalary = GrossSalary - Tax;
				
				System.out.println("Full name\t\t\t\t "+ Name);
				System.out.println("Position\t\t\t\t: "+ Position);
				System.out.println("Hours Worked\t\t\t: "+ Hours);
				System.out.println("Gross Salary\t\t\t: "+ GrossSalary);
				System.out.println("Tax\t\t\t\t\t: "+ Tax);
				System.out.println("Net Salary\t\t\t\t\t: "+ NetSalary + "\n---------------------------------------");
				
				System.out.print("Enter another Employee? (Y-Yes): ");
				Answer = kd.nextLine();
			}while(Answer == "Y");
			System.out.println("Total employees processed: " + EmployeeCounter);
			
		}
		else
			System.out.println("Thank you for using ABC Warehousing Ltd Salary Management System.");
	}
}
		
		