import java.util.Scanner;

public class DispCharacters
{
	public static void main(String[] args)
	{
		Scanner kd  = new Scanner(System.in);
		
		
		int numChar;
		String Character;
		
		System.out.print("Enter a string containing at least 12 character: ");
		Character = kd.nextLine();
		if (Character > 12 || Character < 12)
		{
			System.out.print("The string must contain at least 12 characters - please re-enter: ");
			Character = kd.nextLine();
		}
		for (numChar = 0; numChar < 18; numChar++)
		{
			
			System.out.print("How many characters do you want to display? < pick any integer from 1 to 18>: ");
			numChar = kd.nextInt();
			
			
			if(numChar < 1 || numChar > 18)
			{
				System.out.print("How many characters do you want to display? < pick any integer from 1 to 18>: ");
				numChar = kd.nextInt();
			}
			
			System.out.print("Good number!");
			System.out.print("I will display the first " + numChar + "character(s) of: " + Character);
			System.out.print("Character [" + numChar + "] is\t\t\t" + numChar.charAt(numChar));
			
			
		}
	}
}
		 