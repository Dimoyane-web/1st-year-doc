import java.util.Scanner;

public class Activity19c
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		String Answer = "2xy";
		String GivenAnswer;
		
		
		System.out.print("Please enter your math answer: ");
		GivenAnswer = kd.nextLine();
		
		if (Answer.equalsIgnoreCase(GivenAnswer))
		{
			System.out.println("Correct answer");
		}
		else 
		{
			System.out.println("Wrong answer");
		}
	}
}
