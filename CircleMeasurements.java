import java.util.Scanner;

public class CircleMeasurements {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double Circumference,Area;
		int Radius,Diameter;
		
		System.out.print("Enter the diameter of the circle: ");
		Diameter = kb.nextInt();
		
		Radius = Diameter / 2; 
		Circumference = 2*(Math.PI * Radius);
		Area = (Math.PI* Math.pow(Radius, 2));
		
		System.out.println("The Area of the circle is: " + Area);
		System.out.println("The Circumference of the circle: " + Circumference);
	}
}