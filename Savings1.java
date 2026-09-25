import java.util.Scanner;
import java.text.DecimalFormat;

public class Savings1 {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R0.00");

        double InvestAmount, TargetAmount, InterestRate;
        int CounterYears = 0;

        // Validate initial amount
        do {
            System.out.print("Initial amount to invest (a value > 0): ");
            InvestAmount = kd.nextDouble();
        } while (InvestAmount <= 0);

        // Validate target amount
        do {
            System.out.print("Target you want to achieve (must be more than " + InvestAmount + "): ");
            TargetAmount = kd.nextDouble();
        } while (TargetAmount <= InvestAmount);

        // Validate interest rate
        do {
            System.out.print("Interest rate (value greater than 0): ");
            InterestRate = kd.nextInt();
        } while (InterestRate <= 0);

        double Amount = InvestAmount;

        // Loop until target is reached
        while (Amount <= TargetAmount) {
            CounterYears++;
            Amount += Amount * (InterestRate / 100.0);
            System.out.println("After year " + CounterYears + " you will have " + df.format(Amount));
        }

        System.out.println("After " + CounterYears + " years you will have more than " + df.format(TargetAmount));

        kd.close();
    }
}
