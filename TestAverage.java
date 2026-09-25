import java.util.Scanner; 
public class TestAverage  
{ 
    public static void main(String[] args)  
    {
		Scanner input = new Scanner(System.in); 


		//Declare variables 
		
		String SubjectName; 
		int test1Score, Test2Score, Test3Score; 
		double Average; 
        
		
		//Ask the user to enter marks for 3 tests 
		System.out.print("Enter the name of the subject: "); 
        SubjectName = input.nextLine();
		System.out.print("Enter the score for Test 1: "); 
        test1Score = input.nextInt(); 
        System.out.print("Enter the score for Test 2: "); 
        Test2Score = input.nextInt(); 
		System.out.print("Enter the score for Test 3: "); 
		Test3Score = input.nextInt();
       


		//Calculate average of 3 class tests 
        Average = (test1Score + Test2Score + Test3Score) / 3.0; 
		
		//Display the results 
		
		System.out.println("Class test average for " + SubjectName + " is " + Average + "%"); 
    } 
}