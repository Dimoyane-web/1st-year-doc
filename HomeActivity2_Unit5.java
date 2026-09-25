import java.util.Scanner;

public class HomeActivity2_Unit5
{
	public static void main(String[] args)
	{
		Scanner kd  = new Scanner(System.in);
		
		
		int num1,num2,num3,num4,num5,Total;
		
		
		System.out.print("Enter number 1: ");
		num1 = kd.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = kd.nextInt();
		
		System.out.print("Enter number 3: ");
		num3 = kd.nextInt();
		
		System.out.print("Enter number 4: ");
		num4 = kd.nextInt();
		
		System.out.print("Enter number 5: ");
		num5 = kd.nextInt();
		
		while( num1 && num2 || num3 || num4 || num5 == 5)
		{
			
			Total = num1 + num2 + num3 + num4 + num5;
			System.out.println("Total of all numbers is  = " + Total);
		}
	}
}