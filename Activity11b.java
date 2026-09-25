import java.util.Scanner; //importing Scanner file from java.util package
import java.text.DecimalFormat; //importing DecimalFormat from java.text package

public class Activity11b
{ //start of the class
	 public static void main(String[] args)
	 { //start of the main method
		 
		 //instantiate Scanner
		 Scanner kd = new Scanner(System.in);
		 //instantiate DecimalFormat
		 DecimalFormat df = new DecimalFormat("R0.00");
		 
		 
		 //constant variable 
		 final int LIMITED_SPEED = 80;
		 final double FIRST_FINE = 250.00;
		 final double SECOND_FINE = 500.00;
		 
		 //declare variables
		 int Speed_Travelled,First_Speed,Second_Speed;
		 double First_Amount,Second_Amount,Final_Amount;
		 
		 
		 //prompting the user to enter the speed the car travelled
		 System.out.print("Please enter the speed the car travelled: ");
		 Speed_Travelled = kd.nextInt();
		 
		 //processing
		 First_Speed = Speed_Travelled - LIMITED_SPEED;
		 
		 
		 Second_Speed = ((Speed_Travelled - LIMITED_SPEED) - First_Speed);
		 
		First_Amount = First_Speed * FIRST_FINE;
		Second_Amount = Second_Speed * SECOND_FINE;
		
		Final_Amount = First_Amount + Second_Amount;
		
		 if (Speed_Travelled >80 &&  Speed_Travelled <120)
		 {
			 
			 System.out.println("For a speed of " + Speed_Travelled + "km per hour the fine will be " +  df.format(First_Amount) + " for the speed up to " + Second_Speed + "km per hour + " + df.format(Second_Amount) + " = " + df.format(Final_Amount));
		 }
		 else if (Speed_Travelled >120)
		 {
			 
			 System.out.println("The Speed has not being violated");
		 }
	 }
}
		 
		 
			 
		
		
		