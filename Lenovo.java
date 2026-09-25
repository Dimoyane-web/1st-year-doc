
import java.util.Scanner; 
import java.text.DecimalFormat; 

public class Activity11b {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R0.00");

        // constants
        final int LIMITED_SPEED = 80;
        final double FIRST_FINE = 250.00;
        final double SECOND_FINE = 500.00;

        // variables
        int Speed_Travelled;
        double First_Amount = 0, Second_Amount = 0, Final_Amount = 0;

        // input
        System.out.print("Please enter the speed the car travelled: ");
        Speed_Travelled = kd.nextInt();

        // processing
        if (Speed_Travelled <= LIMITED_SPEED) {
            System.out.println("No fine. Speed limit not violated.");
        } 
        else if (Speed_Travelled > LIMITED_SPEED && Speed_Travelled <= 120) {
            int blocks = (Speed_Travelled - LIMITED_SPEED) / 10;
            First_Amount = blocks * FIRST_FINE;
            System.out.println("For a speed of " + Speed_Travelled + 
                               " km/h the fine will be " + df.format(First_Amount));
        } 
        else if (Speed_Travelled > 120) {
            int blocksUpTo120 = (120 - LIMITED_SPEED) / 10;
            First_Amount = blocksUpTo120 * FIRST_FINE;

            int blocksAbove120 = (Speed_Travelled - 120) / 10;
            Second_Amount = blocksAbove120 * SECOND_FINE;

            Final_Amount = First_Amount + Second_Amount;

            System.out.println("For a speed of " + Speed_Travelled + 
                               " km/h the fine will be " + df.format(First_Amount) + 
                               " for the speed up to 120 km/h + " + df.format(Second_Amount) + 
                               " = " + df.format(Final_Amount));
        }

        kd.close();
    }
}

  

