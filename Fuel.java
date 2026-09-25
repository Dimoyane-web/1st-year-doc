import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Fuel{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DeciamlFormat("R0.00");
		Random rd = new Random();
		
		
		final int FUEL_RATE = 15;
		final double CARBON_RATE = 2.35;
		
		String Name,CarName;
		int Distance,Litres,Score,Remaining,LitresUsed;
		double CarbonTax;
		
		
		System.out.println("Enter driver\s name:\t\t");
		Name = kd.next()
		System.out.println("Enter car model:\t\t\t");
		CarName = kd.nextLine();
		
		//processing
		Distance = kd.nextInt(800-300 + 1) + 300;
		Litres = Distance / FUEL_RATE;
		Remaining = Distance % FUEL_RATE;
		LitresUsed = Litres + 1;
		CarbonTax = CARBON_RATE * LitresUsed;
		Score = (Distance % Litres) + Math.pow(Liters, 2) - Math.min(Distance, (Litres * 10));
		
		System.out.println("\n\t\t--- FUEL EFFICIENCY REPORT ---");
		System.out.println("Driver:\t\t\t\t" + Name);
		System.out.println("Car Model:\t\t" + CarName);
		System.out.println("Distance:\t\t" + 
		