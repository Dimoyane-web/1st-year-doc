import java.util.Scanner;
public class Activity21
{
	public static void main(String[] args)
	{
		
		Scanner sc = new  Scanner(System.in);
		
		int per, numSubPass;
		
		System.out.print("Please the number of the subjects you passed: ");
		numSubPass = sc.nextInt();
		
		System.out.print("Provide the percentage you got: ");
		per = sc.nextInt();
		
		if (per >= 75 )
		{
			if (numSubPass >=4)
			{
				System.out.println("Student, you qualify for an Award!");
			}
			else
			{
				System.out.println("Sorry, you dont qualify");
				
			}
		}
		else
		{
			System.out.println("Sorry, you dont qualify" );
		}
	}
}