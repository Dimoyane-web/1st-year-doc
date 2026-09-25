import java.util.Random;

public class NumberFourDigit {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random 4-digit number (999–9999)
        int number = rand.nextInt(999 - 100) + 999;

   // Display the number directly
        System.out.println("Number randomized: " + number);

        // Display digits according to their places
        System.out.println("Thousands place: " + (number / 1000));
        System.out.println("Hundreds place: " + (number / 100 % 10));
        System.out.println("Tens place: " + (number / 10 % 10));
        System.out.println("Ones place: " + (number % 10));
    }
}
