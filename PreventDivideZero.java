 import java.util.Scanner; 
public class PreventDivideZero 
{ //start class 

 public static void main(String[] args) 
 { //start main method 
 
 
  Scanner keyboard = new Scanner(System.in); 
  
  
  double rNumerator, rDenominator, rQuotient; 
   
  System.out.print("Enter the numerator: "); 
  rNumerator = keyboard.nextDouble();   
  System.out.print("Enter the denominator: "); 
  rDenominator = keyboard.nextDouble(); 
   
  if (rDenominator == 0) 
  { 
   System.out.println("You cannot divide by zero!"); 
  }  
  else 
  { 
   rQuotient = rNumerator / rDenominator; 
   System.out.println("Quotient is: " + rQuotient); 
  } 
 } //end main method 
} //end class 