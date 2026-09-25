import java.util.Scanner;

public class Activity18a
{
	public static void main(String [] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		
		String Name1, Name2;
		int  NumChar1,NumChar2;
		
		System.out.print("Please enter your name: ");
		Name1 = kd.next();
		NumChar1 = Name1.length();
		
		System.out.print("Enter your friend's name: ");
		Name2 = kd.next();
		NumChar2 = Name2.length();
		
		if (Name1.compareTo(Name2) == 0)
		{
			System.out.println( Name1 + " Your name is the same as " + Name2);
		}
		if (Name1.compareTo(Name2) > 0 )
		{
			System.out.println(Name1 + "your name is bigger than " + Name2);
		}
		if (Name1.compareTo(Name2) < 0 )
		{
			System.out.println(Name2 + " \'s name is smaller than yours, "+ Name1);
		}
		
		System.out.println(Name2 + " Your length is: " + NumChar1 + " and for " + Name2 + " your length is: " + NumChar2);
	}
}
	