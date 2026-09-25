import java.util.Scanner;
public class Capilot {
	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the side of x: ");
		x = keyboard.nextDouble();
		
		System.out.print("PLease enter the side of y: ");
		y = keyboard.nextDouble();
		
		z = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
		
		System.out.println(z);
	}
}