import java.util.Scanner; 
import java.text.DecimalFormat; 
public class MenuPizzaTop 
{ //start class
	public static void main(String[] args)
	{
		//start main method
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat ("R,##0.00");
		
		double rTotal = 0;  //The total amount the customer should pay.
		int iOption,MushRoomCounter = 0,HamCounter = 0,ChesseCounter = 0;   //The menu option the user chooses.
		final double MUSHROOM = 8.50;
		final double HAM = 16.00;
		final double CHEESE = 6.50;
		
		System.out.println("\nChoose an option. \n1. Mushroom\t\t\t"+ formatter.format(MUSHROOM) + "\n2. Ham \t\t\t\t" + formatter.format(HAM) + "\n3. Cheese \t\t\t" + formatter.format(CHEESE) + "\n0. STOP ");
		iOption = keyboard.nextInt();
		
		while (iOption != 0)
		{
			switch (iOption)
			{
				
				case 1: rTotal= rTotal + MUSHROOM;MushRoomCounter++; break;
				case 2: rTotal= rTotal + HAM;HamCounter++; break;
				case 3: rTotal= rTotal + CHEESE;ChesseCounter++;
			} //end switch
			
			System.out.println("Your total so far is: " + formatter.format(rTotal));
			System.out.println("\nChoose an option. \n1. Mushroom \n2. Ham \n3. Cheese \n0. STOP");
			iOption = keyboard.nextInt();
		} //end while 
		System.out.println("You ordered " + MushRoomCounter + " mushroom topping(s)");
		System.out.println("You ordered " + HamCounter + " ham topping(s)");
		System.out.println("You ordered " + ChesseCounter + " chesse topping(s)");
		System.out.println("You should pay " + formatter.format(rTotal));
	} //end main method
}