import java.util.Scanner;
import java.util.Random;

public class GiftCardDistribution{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Random rd  = new Random();
		
		 // Declare variables         
        int DepartmentNumber, NumberOfEmployees, NumberOfGiftCards, GiftCardsPerEmployee, RemainingGiftCards;
        String ManagerName; 
 
        // Input 
        System.out.print("Please enter your department number: ");
        DepartmentNumber = kb.nextInt();
        System.out.print("Enter managers's name: "); 
        ManagerName = kb.next();
        System.out.print("Please enter the number of employees in the team: "); 
        NumberOfEmployees = kb.nextInt();
		
 
        // Initialize number of gift cards with a random value between 50 and 100 
		NumberOfGiftCards = rd.nextInt(100 - 50 + 1) + 50; 
 
        // Calculate the number of gift cards each employee will receive 
        GiftCardsPerEmployee = NumberOfGiftCards / NumberOfEmployees; 
        // Calculate the remaining gift cards after distribution 
        RemainingGiftCards = NumberOfGiftCards % NumberOfEmployees; 
 
         //Output 
        System.out.println("\t");
        System.out.println("Manager: " + ManagerName);  
        System.out.println("Department: " + DepartmentNumber); 
        System.out.println("Number of employees in team: " + NumberOfEmployees); 
        System.out.println("Total number of gift cards: " + NumberOfGiftCards);		
        System.out.println("Each employee will receive " + GiftCardsPerEmployee + " gift cards."); 
        System.out.println("There are " + RemainingGiftCards + " gift cards left after distribution.");
	}
}