import java.util.Scanner;

public class Activity19d
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		
		String CarName;
		String Answer1 = "Audi";
		boolean Flag1;
		
		
		System.out.print("What is your favourite car: <Audi>, <VW>, <BMW>: ");
		CarName = kd.nextLine();
		
		Flag1 = CarName.equalsIgnoreCase(Answer1);
		 
		System.out.println("Is your favourite car the same as the chosen car? :  " + Flag1);
	}
}

		
		