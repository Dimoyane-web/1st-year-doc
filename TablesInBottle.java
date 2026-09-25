import java.util.Scanner; //import scanner file from the java.util package 

public class TablesInBottle //class name
{ //start of the class
	public static void main(String[] ergs)  //main method 
	{ //start of the main method
		
		//create and object from scanner file
		Scanner keyboard = new Scanner(System.in);
		
		//declare constant variable
		final int BOTTLE_ONE = 250;
		final int BOTTLE_TWO = 15;
		
		//declare variable
		int iRemainingNumberOfTablets1;
		int iRemainingNumberOfTablets2;
		int iBottle1,iBottle2,iNumberOfTablets;
		
		
		//prompting the user to enter the number of tablets
		System.out.print("Please enter the number of tablets ");
		iNumberOfTablets = keyboard.nextInt();
		
		//perfoming calculations
		iBottle1 = iNumberOfTablets/ BOTTLE_ONE;
		iRemainingNumberOfTablets1 = iNumberOfTablets % BOTTLE_ONE;
		iBottle2 = iRemainingNumberOfTablets1/ BOTTLE_TWO;
		iRemainingNumberOfTablets2 = iRemainingNumberOfTablets1 % BOTTLE_TWO;
		
		//output
		System.out.println( iBottle1 + " bottles with 250 tabltes");
		System.out.println( iBottle2 + " bottles with 15 tables");
		System.out.println( iRemainingNumberOfTablets2 + " tablets remaining ");
	}
}