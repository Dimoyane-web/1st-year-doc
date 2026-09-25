import java.util.Scanner; 
import java.text.DecimalFormat; (4)
 
public class PriceBattle
{ 
    public static void main(String[] args) 
    { 
        //Declare 
        Scanner scan = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("#.00"); 
        double UserPrice, CompPrice, Max;
 
        //Input 
        System.out.print("Enter your price: "); 
        UserPrice = scan.nextDouble(); 
         
        //Randomize price 
        CompPrice = 1 + Math.random() *(5000);
         
        //Get the maximum 
        Max = Math.max(UserPrice, CompPrice); 
 
        System.out.println("Higher price is R " + df.format(Max)); 
    } 
}