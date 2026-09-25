import java.util.Scanner;

public class Activity13c
{
	public static void main(String [] args)
	{
		
		
		Scanner kd = new Scanner(System.in);
		
		double packetWeight;
		
		System.out.print("What is the packet weight?: ");
		packetWeight = kd.nextInt();
		
		if (packetWeight >= 1.5 && packetWeight <5)
		{
			System.out.println("He can buy the packet");
		}
		else
		{
			System.out.println("He can\'t buy the packet");
		}
	}
}

	
	