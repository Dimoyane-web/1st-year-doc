import java.util.Scanner;

public class Rialivhuma {
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		
		final int PIECES_IN_BOX = 8;
		
		int NumberOfPizzas,NumberOfPeople,PiciesPerPerson,PiciesLeftOver;
		
		System.out.print("NUmber of boxes of pizza ordered: ");
		NumberOfPizzas = kd.nextInt();
		System.out.print("Number of friends this Sunday: ");
		NumberOfPeople = kd.nextInt();
		
		PiciesPerPerson = (PIECES_IN_BOX * NumberOfPizzas) / NumberOfPeople;
		PiciesLeftOver = (PIECES_IN_BOX * NumberOfPizzas) % NumberOfPeople;
		
		System.out.println("Each person wii get " + PiciesPerPerson + " slices of pizza");
		System.out.println("There will be " + PiciesLeftOver + " slices of pizza left over");
	}
}	