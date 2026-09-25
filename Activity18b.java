import java.util.Scanner;

public class Activity18b
{
	public static void main(String []args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		String Name1, Name2, Name3;
		
		System.out.print("Enter the first name: ");
		Name1  = kd.next();
		System.out.print("Enter the second name: ");
		Name2 = kd.next();
		System.out.print("Enter the third name: ");
		Name3 = kd.next();
		
		
		if ((Name1.compareTo(Name3) == 0 ) && (Name1.compareTo(Name2) < 0))
		{
			System.out.println(" Coincidence");
		else 
		{
			System.out.println("Not lucky");
		}
	}
}
