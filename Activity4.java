import java.util.Scanner; //create scanner file

public class Activity4 { //start of the class
	
	public static void main(String[] args) { //start of the main method
		
		Scanner kb = new Scanner(System.in); //create an object file
		
		
		 
		//declare a variable 
		double celsius,fehrenheit;
		
		//prompt the user to their temperature in Celsius
		System.out.print("Enter the temperature in celsius: ");
		celsius = kb.nextDouble();
		
		//convecting
		fehrenheit = (celsius * 9/5) + 32;
		
		//displaying the output
		System.out.println("Enter the temperature in celsius: " + celsius);
		System.out.println("Fehrenheit: " + fehrenheit);
	}
}