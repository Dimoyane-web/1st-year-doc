import java.util.Scanner;

public class Unit4
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in); 
		
		char cAnswer; 
		
		System.out.print("What is your answer <Y>es or <N>o?: ");
		cAnswer = Character.toUpperCase(keyboard.next().charAt(0));
		
		
		while (cAnswer != 'Y' && cAnswer != 'N')
		{
			System.out.print("You should only enter Y or N. \nPlease re-enter your choice: ");
			cAnswer = Character.toUpperCase(keyboard.next().charAt(0));
		} //end while
		
		if (cAnswer == 'Y')
			System.out.println("Your answer is Yes");
		else
			System.out.println("Your answer is No");
		
	} //end main method
		
} //end class