import java.util.Scanner; //importing the scanner file from the java.util package

public class Cylinder{ //Start of the class
	
	public static void main(String[] args){ //start of the main method
	
		//create an object from scanner file
		Scanner kd = new Scanner(System.in);
		
		//declare variables
		double Volume,SurfaceArea,Radius,Height;
		
		//promp the user to enter the values that are required
		System.out.print("Enter the radius of the cylinder: ");
		Radius = kd.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		Height = kd.nextDouble();
		
		//procesing
		Volume = Math.round(Math.PI*(Math.pow(Radius, 2)* Height)*100)/100.0;
		SurfaceArea = Math.round((2* (Math.PI * Radius * Height))*100)/100.0;
		
		System.out.println("The volume of the cylinder is: " + Volume);
		System.out.println("The SurfaceArea of the cylinder is: " + SurfaceArea);
	}
}	