import java.util.Scanner;

public class SchoolDistance{
	public static void main(String[] args){
		
		Scanner kd  = new Scanner(System.in);
		
		int KiloMeters, Meters,Centrimetre;
		
		System.out.print("How many Kilometers did you cover today? ");
		KiloMeters = kd.nextInt();
		
		Meters = KiloMeters * 1000;
		
		Centrimetre = KiloMeters * 1000000;
		
		System.out.println("Today you covered an equivalent of " + Meters + "m");
		System.out.println("This is also equivalent to " + Centrimetre + "cm");
	}
}