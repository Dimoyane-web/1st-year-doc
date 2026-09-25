import java.util.Scanner;

public class DropBall
{
	public static void main(String[] agrs)
	{
		
		Scanner kd = new Scanner(System.in);
		
		
		
		double Height;
		int counter = 0;
		
		System.out.print("Initial height of the ball meters: ");
		Height = kd.nextDouble();
		
		do
		{
			
			Height = Height/2;
			counter++;
			System.out.println("After bounce number " + counter +" the height is  " + Height);
			
		}while(Height >= 0.05 );
		
		System.out.println("After " + counter + " bounce the height will be less than 5cm");
	}
}
		
		
		
		