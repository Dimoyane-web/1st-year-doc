import java.util.Scanner; //importing a Scanner class from the java.util package

public class SchedulingApp{ //Start of the class
	public static void main(String[] args){ //start of the main method
		
		//create an object from the Scanner class 
		Scanner kd = new Scanner(System.in);
		
		//declare constant variable
		
		final int ONE_DAY_IN_MINUTES = 1440;
		final int MINUTES = 60;
		
		//declare variables
		int Days,Hours,Minutes;
		
		//prompt the user to enter the total number of minutes
		System.out.print("Enter the total number of minutes: ");
		Minutes = kd.nextInt();
		
		//processing
		
		Days = Minutes / 1440;
		Hours = (Minutes % ONE_DAY_IN_MINUTES) / MINUTES;
		Minutes = (Minutes % MINUTES);
		
		
		System.out.println("Days: " + Days);
		System.out.println("Hours: "+Hours);
		System.out.println("Minutes: "+Minutes);
	}
}