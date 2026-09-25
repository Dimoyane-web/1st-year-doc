import java.util.Scanner;

public class Task1{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		
		int Radius;
		double Area;
		
		System.out.print("Enter the radius of the circle: ");
		Radius = kb.nextInt();
		
		Area = Math.round(Math.PI *(Math.pow(Radius, 2))* 100)/100.0;
		
		System.out.println("The area of the circle: "+ Area);
	}
}