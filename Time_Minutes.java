import java.util.Scanner; //extracting Scanner class from java.util package

public class Time_Minutes 
{ //Start of the class
	
	public static void main(String[] args)
	
	{ //start of the main method
		
		//create an object from Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables 
		int iNumMinutes;
		int iDay;
		int iHours;
		int iRemainingMinutes;
		int iMinutes;
		
		//prompting the user the total number of minutes
		System.out.print("Enter the total number of minutes: ");
		iNumMinutes = keyboard.nextInt();
		
		//processing
		iDay = ((24 * 60) % iNumMinutes);
		iHours = ((24 % iDay) /24);
		iMinutes = iHours % 60;
		
		//output
		System.out.println("Enter the total number of minutes: " + iNumMinutes);
		System.out.println("Days: " + iDay);
		System.out.println("Hours: " + iHours);
		System.out.println("Minutes: " + iMinutes);
		
		
	} //end of the main method
	
} //end  the class