import java.util.Scanner;


public class Session
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		double householdIncome;
		double average;
		boolean flag1 = true, flag2 = true , flag3 = false;
		String answer;
		 
		 
		 System.out.print("What is your house hold income every month?: " );
		 householdIncome = kd.nextDouble();
		 System.out.print("Enter your academic average: ");
		 average = kd.nextDouble();
		 
		 System.out.print("Are you a registered student (Y/N): ");
		 answer = kd.nextLine();
		 
		 
		 
		 if ((householdIncome <= 8000) && (average >= 65) && ( answer == "Y" ) )
		 {
			 flag1 = true;
		 }
		 else
		 {
			 System.out.println("You don\'t qualify for busary");
		 }
		 if (flag1)
		 {
			 System.out.println("You qualify for the busary");
		 }
		 else 
		 {
			 System.out.println("You don\'t qualify for busary");
		 }
	}
}
			 