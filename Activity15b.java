import java.util.Scanner;

public class Activity15b
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		int num1,num2,num3,num4;
		boolean flag = true;
		
		System.out.println("Enter first number: ");
		num1 = kd.nextInt();
		System.out.println("Enter second number: ");
		num2 = kd.nextInt();
		System.out.println("Enter third number: ");
		num3 = kd.nextInt();
		System.out.println("Enter forth number: ");
		num4 = kd.nextInt();
		
		
		if ( (num1 % 2 == 0) || (num2 % 2 == 0) || (num3 % 2 == 0) || (num4 % 2 == 0))
		{
			flag;
			System.out.println(" Only even numbers  entered.");
		}
		else
		{
			System.out.println("Odd number found.");
		}
	}
}