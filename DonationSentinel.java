import java.util.Scanner; 
public class DonationSentinel 
{//start class
	public static void main(String[] args) 
{//start main method

	Scanner keyboard = new Scanner(System.in);
	
	double rTotal = 0; //The total amount of money that was collected
	double rDonate;
	
	//The amount of money one person donates
	int iCounter = 0 ; //Count the number of donations received
	
	System.out.print("Enter the donation amount. Enter 0 to stop: ");
	rDonate= keyboard.nextDouble();
	
	while (rDonate != 0)
	{
		//begin while
		iCounter++;
		rTotal= rTotal + rDonate;
		System.out.print("Enter the donation amount. Enter 0 to stop: ");
		rDonate= keyboard.nextDouble();
	} //end while
	System.out.println("You collected R" + rTotal);
	System.out.println("There were "+ iCounter + " donations");
	} //end main method 
} //end class