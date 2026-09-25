import java.util.Scanner;

public class CalcAverage{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		
		int Counter = 0,NumberOfLearners;
		double Percentage,totalPer = 0, Average = 0;
		
		System.out.print("Howe many learners? ");
		NumberOfLearners = kd.nextInt();
		
		while(Counter != NumberOfLearners)
		{
			Counter++;
			System.out.print("Enter percentage for learners " + Counter + ": ");
			Percentage = kd.nextDouble();
			
			totalPer = totalPer + Percentage;
			
			Average = (int)Math.round((totalPer/Counter)*10/10.0);
			
		}
		System.out.println("Average is " + Average);
	}
}