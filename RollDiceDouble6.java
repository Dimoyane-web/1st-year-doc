import java.util.Scanner;

public class RollDiceDouble6
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		int rectangle,length,width,counter = 0;
		double totalArea = 0;
		System.out.print("How many rectangle surfaces does the object have?: ");
		rectangle = kd.nextInt();
		
		while(rectangle <= 5)
		{
			counter++;
			System.out.print("Enter length of rectangle " + counter + ":");
			length = kd.nextInt();
			System.out.print("Enter width of a rectangle " + counter + ":");
			width = kd.nextInt();
			
			totalArea = Math.round((double)(length * width) * 100)/100.0;
			double surface_area = totalArea + counter;
			
			
			System.out.println("Total surface area is: " + surface_area);
			counter++;
		}
		
	}
}






			