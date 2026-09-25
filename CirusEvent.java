import java.util.Scanner; 
public class CirusEvent  
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Constants
		final double PI = 3.14;         
		
		char cShape;
		double rSize = 0, rArea = 0;
		boolean bShapeValid = false;boolean bSizeValid = false;
		
		// Input: Shape 
		System.out.print("Enter shape (C for Circle, S for Square, T for Triangle): ");
		cShape = input.next().charAt(0);
		
		if (cShape == 'C' || cShape == 'S' || cShape == 'T')
			bShapeValid = true;
		
		// Input: Size
		
		System.out.print("Enter size (positive number): "); 
		rSize = input.nextDouble(); 
		
		
		//Insert code here: Assign bSizeValid if rSize is greater than 0 
		if  ( rSize > 0)
			bSizeValid = true;
		
		
		if (bShapeValid && bSizeValid)
		{
			//Insert code here: Use a switch statement to calculate rArea based on
			switch (cShape)
			{
				case 'C':
				rArea= PI * rSize * rSize;
				break;
				case 'S':
				rArea = rSize * rSize;
				break;
				case 'T':
				rArea = 0.5 * rSize * rSize;
				break;
				default: System.out.println("The area is: " + rArea);
				
				
				
			}
		}
		else
		{
			System.out.println("Invalid input: please check that the shape is correct and the size is a positive number.");
		}
	}
}