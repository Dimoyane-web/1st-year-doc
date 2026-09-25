import java.util.Random;

public class RandomFourDigit {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random 4-digit number (1000–9999)
        int number = rand.nextInt(9000) + 1000;

        // Break into digits
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // Display output
        System.out.println("Number randomized: " + number);
        System.out.println("Thousands place: " + thousands);
        System.out.println("Hundreds place: " + hundreds);
        System.out.println("Tens place: " + tens);
        System.out.println("Ones place: " + ones);
    }
}
