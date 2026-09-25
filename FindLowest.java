import java.util.Scanner;

public class FindLowest
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		String name;
		String lowestName = "";
		int Marks;
		int lowest = Integer.MAX_VALUE;
		
		while (true)
		{
			System.out.print("Enter the learner's name: ");
			name = kd.nextLine();

			System.out.print("Enter the learner's percentage (enter a number larger than 100 to finish): ");
			Marks = kd.nextInt();
			kd.nextLine();

			if (Marks > 100)
			{
				break;
			}

			if (Marks < lowest)
			{
				lowest = Marks;
				lowestName = name;
			}
		}

		if (!lowestName.isEmpty())
		{
			System.out.println("The learner with the lowest percentage is " + lowestName + ": " + lowest + "%");
		}
		
		
		
	}
}