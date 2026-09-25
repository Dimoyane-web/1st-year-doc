import java.util.Scanner; //importing Scanner file from they java.util package
import java.text.DecimalFormat; //importing DecimalFormat files from the java.text package


public class Activity7a  //classname
{ //start of the class
	public static void main(String[] args){ //start of the main class
		
		//calling in the Scanner method to utilise inside the objects
		Scanner kd = new Scanner(System.in);
		//calling in the DecimalFormat method to perfom patterns on the amounts
		DecimalFormat df = new DecimalFormat();
		
		//constant variables
		final double STORE = 0.05;
		final double DEPARTMENT = (1+ 7/100);
		
		//declare variables
		String item;
		int department;
		double priceOfItem,newPrice,increaseAmt;
		
		
		//prompting the user to enter the name of the item
		System.out.print("Enter the item you want to purchse: ");
		item = kd.next();
		
		//prompting the user the to enter the price of the item
		System.out.print("Enter the price of an item: ");
		priceOfItem = kd.nextInt();
		
		
		//prompting the user to enter department of where the  items belong
		System.out.print("Enter the department number: ");
		department = kd.nextInt();
		
		
		if (department == 3 ) 
		{ //start of an if statement 
		 newPrice = priceOfItem *(1 + DEPARTMENT);  //the older price is going to get an increase of the 7%
		
		} //end of the if statement
		
		newPrice = priceOfItem * (1 + STORE );  //if the item doesnt belong to any department is going to get an increase of 5%
		
		
		//output
		System.out.println("Your new amount of the: " + item + " is " + df.format(newPrice)); //displaying the output to the user
	} //end of the main class
} //end of the class
	
	