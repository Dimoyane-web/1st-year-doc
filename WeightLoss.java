import java.util.Scanner;
import java.util.Random;

public class WeightLoss
{
	public static void main(String[] args)
	{
		Scanner kd  = new Scanner(System.in);
		Random rd = new Random();
		
		String Name;
		String Stopper = "zzz";
		
		int StartWeight,EndWeight = 0,counterGained = 0,counterLost = 0,counterSame = 0;
		double difference,gained;
		
		System.out.print("Enter name (zzz to stop): ");
		Name = kd.nextLine();
		
		while(!Name.equalsIgnoreCase(Stopper))
		{
			System.out.print("\nStart weight for " + Name + ":" );
			StartWeight = kd.nextInt();
			kd.nextLine();
			System.out.print("End weight for " + Name + ":");
			EndWeight = kd.nextInt();
			kd.nextLine();
			
			if (StartWeight > EndWeight)
			{
				difference = (double)Math.abs(StartWeight - EndWeight);
				System.out.println(Name + ", you lost " + difference + " kg.");
				counterLost++;
			}
			else if(StartWeight < EndWeight)
			{
				gained = (double)Math.abs(EndWeight - StartWeight);
				System.out.println(Name + ", you gained " + gained + " kg.");
				counterGained++;
			}
			else
			{
				System.out.println(Name + ", you lost no weight.");
				counterSame++;
			}
			System.out.print("\nEnter name (zzz to stop): ");
			Name = kd.nextLine();
		}
		System.out.println(counterLost + " lost weight.");
		System.out.println(counterGained + " gained weight.");
		System.out.println(counterSame + " stayed weight.");
	}
}
	
		