import java.util.Scanner;

public class Activity16a
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		String Director_Sur = "Jones";
		String Secretary_Sur = "Ali";
		String Judge_Sur = "Dlamini";
		String Surname;
		
		
		System.out.print("Enter your surname: ");
		Surname = kd.nextLine();
		
		if (Surname.equals(Director_Sur))
		{
			System.out.println("You are the director's son");
		}
		if (Surname.equals(Secretary_Sur))
		{
			System.out.println("You are the Secretary's son");
		}
		else if (Surname.equals(Judge_Sur))
		{
			System.out.println("You are the Judge\' son");
		}
		else 
		{
			System.out.println("Nice to meet you mr/ms " + Surname);
		}
	}
}