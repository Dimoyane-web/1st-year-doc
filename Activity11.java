import java.util.Scanner; //importing scanner file from the java.util package
import java.text.DecimalFormat; //importiing DecimalFormat file from the java.text package

public class Activity11
{ //start of the class
	public static void main(String[] args)
	{ //start  the main method
	
		//inistantiate Scanner
		Scanner kd = new Scanner(System.in);
		//inistantiate DecimalFormat
		DecimalFormat df = new DecimalFormat("R0.00");
		
		//Constant variables
		final double STUDENT_TICKET = 80.00; //student ticket price
		final double LECTURER_TICKET  = 60.00; //lecture's ticket price
		
		//declare variables
		int NumStudTick, NumLectTick; //number of student and lecture's tickets
		double TotalSales,Payment;
		
		//input
		//prompting the user to enter the number of tickets of students and the lecture they sold
		
		System.out.print("Enter the number of student\s tickets sold: ");
		NumStudTick = kd.nextInt();
		System.out.print("Enter the number of Lecture\s tickets sold: ");
		NumLectTick = kd.nextInt();
		
		//processing
		
		//calculating the total sales made from the sold tickets 
		TotalSales = (NumStudTick * STUDENT_TICKET) + (NumLectTick * LECTURER_TICKET);
		
		//if statement
		if (NumStudTick > 20 && NumLectTick > 10) //if statement condition with Boolean oparators
		{ //start of if-statement
			Payment = TotalSales * 0.12;
		} //end of if-Statement
		else
		{ //start of else statement
			Payment = TotalSales * 0.1;
		} //end of else statement

			//output
		System.out.println("The total ticket sales: "  + df.format(TotalSales) + " and the payments the student will recieve: " + df.format(Payment));
		
	} //end of main method
} //end of class
			
			






		


		
		