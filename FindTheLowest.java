import java.util.Scanner;

public class FindTheLowest
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		
		double Percntage, Lowest = 0;
		
		System.out.print("Enter the student mark. (Enter a number that is larger than 100 to indicate all marks have been entered): ");
		Percntage = kd.nextDouble();
		
		while (Percntage <= 100)
		{
			if (Percntage < Lowest)
				Lowest = Percntage;
			
			System.out.print("Enter the student mark. (Enter a number that is more than 100 to indicate all marks have been entered): ");
			Percntage = kd.nextDouble();
			
		}
		System.out.println("The Lowest percentage is: " + Lowest);
	}
}