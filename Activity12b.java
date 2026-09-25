import java.util.Scanner;
public class  Activity12b
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		final double INCREASE_PERC = 0.05;
		final double DECREASE_PERC = 0.125;
		
		
		int Value1,Value2,Value3;
		double Quotient,Increase_Quotient = 0,Decreased_Quotient = 0;
		
		
		System.out.print("Please enter the first integer digit: ");
		Value1 = kd.nextInt();
		System.out.print("Please enter the second integer digit: ");
		Value2 = kd.nextInt();
		System.out.print("Plaese enter the third integer digit: ");
		Value3 = kd.nextInt();
		
		Quotient = Value1 / Value2;
		if ((Value1 > Value2 && Value1 < Value3) || (Value2 == Value3))
		{
			Increase_Quotient += (1 + INCREASE_PERC);
			System.out.println("The result: " + Increase_Quotient);			
		}
		else
		{
			Decreased_Quotient -= (1 + DECREASE_PERC);
			System.out.println("The result: " + Decreased_Quotient);
		}
	}
}