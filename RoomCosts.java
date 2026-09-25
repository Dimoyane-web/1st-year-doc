import java.util.Scanner;

public class RoomCosts {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		final double COST_PER_METER_SQUARE_R = 50.00;
		
		double rAmount, rTotalAmount;
		double rArea,rLength,rWidth;
		
		
		System.out.print("Enter the length of the room: ");
		rLength = keyboard.nextDouble();
		System.out.print("Enter the width of the room: ");
		rWidth = keyboard.nextDouble();
		
		rArea = rLength * rWidth;
		
		rAmount = rArea * COST_PER_METER_SQUARE_R;
		
		rTotalAmount = Math.round(rAmount*100)/100.0;
		
		
		System.out.println("The area of the room: " + rArea);
		System.out.println("total cost R: " + rTotalAmount);
	}
}