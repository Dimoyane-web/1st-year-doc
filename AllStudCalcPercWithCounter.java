import java.util.Scanner;

public class AllStudCalcPercWithCounter
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		int marks = 0,total,counter = 0;
		double percentage;
		char answer;
		System.out.print("What is the total for the test?: ");
		total = kd.nextInt();
		
		System.out.print("Do you want to enter a mark for a test? <Y>/<N> (a mark is out 60)");
		answer = Character.toUpperCase(kd.next().charAt(0));
		
		while (answer == 'Y')
		{
			System.out.print("What is the score? ");
			marks = kd.nextInt();
			
			percentage = Math.round(((double)marks/total * 100)* 100/100.0);
			
			System.out.println("The precentage is : " + percentage + "%");
			
			System.out.print("Do you want to enter a mark for a test? <Y>/<N> (a mark is out 60)");
			answer = Character.toUpperCase(kd.next().charAt(0));
			
			counter++;
		}
		System.out.println("You are done calculating percentages.");
		System.out.println("You processed " + counter + " marks");
	}
}