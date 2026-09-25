import java.util.Scanner; //create a scanner file

public class Activity3 { //initiating a class

 
	public static void main(String[] args) { //start of the main method 
		
		Scanner keyboard = new Scanner(System.in); //create an object
		
		//declare constant variables
		final double PIE = 3.14;
		
		//declare variables
		double diameter, area;
		
		//promting the user to enter the diameter of the circle
		System.out.print("Enter the diameter of the circle: ");
		diameter = keyboard.nextDouble();
		
		//calculating the area
		area = diameter * PIE;
		
		//displaying the output
		System.out.println();
		System.out.println("Enter the diameter of the circle: " + diameter);
		System.out.println("The area of the circle: " + area);
	}
}