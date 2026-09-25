import java.util.Scanner; //creating a Scanner file from the java.util package

public class Test_Marks {//start of the class
	
	public static void main(String[] args) { //iniatialising the main method
		
		//create an object from Scanner file
		Scanner kb = new Scanner(System.in);
		
		//constant variable
		final double PERCENTAGE = 100;
		
		//declaring variables
		double score, total;
		
		//prompting the user to enter the score marks from the test
		System.out.print("What is your score? ");
		score = kb.nextDouble();
		System.out.print("What is the total for the test? ");
		total = kb.nextDouble();
		
		//processing
		double percentage = (score / total) * PERCENTAGE;
		
		//displaying the outputs
		System.out.println("What is your score " + score);
		System.out.println("What is the total for the test " + total);
		System.out.println("You have" + percentage + "%");
	}
}	