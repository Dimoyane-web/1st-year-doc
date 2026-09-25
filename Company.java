import java.util.Scanner;

public class Company {
	
	public static void main(String[] args) {
		
		
		Scanner kd = new Scanner(System.in);
		
		final int ONE_BOX_OF_TILES_PER_METER_SQUARE = 2;
		
		
		double Length,Width,Area;
		int Boxes;
		
		System.out.print("Enter the length of the office: ");
		Length = kd.nextDouble();
		System.out.print("Enter the width of the office: ");
		Width = kd.nextDouble();
		
		
		Area = Length * Width;
		
		Boxes = (int)(Math.ceil(Area / ONE_BOX_OF_TILES_PER_METER_SQUARE));
		
		System.out.println("Area of office: " + Area);
		System.out.println("Boxes of tiles needed: " + Boxes);
	}
}	