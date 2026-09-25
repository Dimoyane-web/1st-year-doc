import java.util.Scanner;

public class CourseFacultyFinder
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		final double POUNDS = 2.20462;
		
		double kg,answers;
		
		for (kg = 6; kg >= 0.5; kg -= 0.5)
		{
			answers = Math.round((kg * POUNDS)*100)/100.0;
			System.out.println(kg + "\t\t\t kg = \t\t" + answers + "\t pounds");
		}
	}
}