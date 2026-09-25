import java.util.Scanner;

public class Activity5c {
	public static void main(String[] args){
		
		
		
		Scanner kd = new Scanner(System.in);
		
		int value1, value2,first,second;
		
		System.out.print("Enter first value: ");
		value1 = kd.nextInt();
		
		System.out.print("Enter second value: ");
		value2 = kd.nextInt();
		
		if (value1 > value2)
		{
		first = value1;
		second =value2;
		}
		else 
		{
		first = value2;
		second = value1;
		}
		
		System.out.println("Largest value is" + first + "and smallest is" + second);
	}
}