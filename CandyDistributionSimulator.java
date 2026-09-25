import java.util.Scanner;
import java.util.Random;


public class CandyDistributionSimulator{
	public static void main(String[] args){
		
		
		Scanner kd = new Scanner(System.in);
		//Declare variables
		int NumberOfStudents,NumberOfCandies,CandiesPerSudent,RemaningCandies;
		
		//input the number of Students
		System.out.print("Please enter thr number of students present: ");
		NumberOfStudents = kd.nextInt();
		
		
		//Calculate the number of candies with a random value between 160 and 180
		NumberOfCandies = kd.nextInt(180 - 160 + 1) + 160;
		
		//Calculate the number of candies each student will recieve
		CandiesPerSudent = NumberOfCandies / NumberOfStudents;
		//Calculate the remaning candies after distribution
		RemaningCandies = NumberOfCandies % NumberOfStudents;
		
		//output
		System.out.println("Number of Students present: " + NumberOfStudents);
		System.out.println("Total number of candies: " + NumberOfCandies);
		System.out.println("Each student will recieve: " + CandiesPerSudent + " candies");
		System.out.println("There are " + RemaningCandies + " candies left after distribution.");
	}
}