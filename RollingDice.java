import java.util.Random;

public class RollingDice {
	
	public static void main(String[] args) {
		
		Random kd = new Random();
		
		int iTotal;
		int iDice1 = 4;
		int iDice2 = 6;
		
		iTotal = kd.nextInt( iDice2 - iDice1 + 1) + iDice1;
		
		
		
		System.out.println("Dice 1: " + iDice1);
		System.out.println("Dice 2: " + iDice2);
		System.out.println("Total: " + iTotal);
	}
}