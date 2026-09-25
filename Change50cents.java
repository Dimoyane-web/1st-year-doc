import java.util.Scanner; //import the scanner class from the java.util package

public class Change50Cents { //the start of the class
	
	public static void main(String[] args) { //start of the main method 
		
		//create an object from the scanner class
		Scanner kd = new Scanner(System.in);
		
		//declaring constant vaiable
		final double ONE_COIN_IN_CENTS = 0.50;
		
		double Change;
		int Number;
		double ChangeReamaining;
		
		//prompting the user to the change 
		System.out.print("Enter change: ");
		Change = kd.nextDouble();
		
		//performing calculations
		
		Number =(int)(Change / ONE_COIN_IN_CENTS);
		ChangeReamaining = Change % ONE_COIN_IN_CENTS;
		
		System.out.println("Number 50c: " + Number);
		System.out.println("Change remaining: " + ChangeReamaining);
	}
}	