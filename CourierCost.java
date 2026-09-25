import java.util.Scanner; 
import java.text.DecimalFormat;  
public class CourierCost {
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R,##0.00");
		
		final int VAT = 15, INSURE_PERC = 11;
		final double PERKG = 5.5, ROAD = 0.8, TRAIN = 0.5, AIR = 1.5;
		double rMass, rKM, rTotal, rTransp;
		char cTransp, cInsure;
		
		
		//input
		System.out.print("Number of kg to transport: \t\t\t");
		rMass = keyboard.nextDouble();
		System.out.print("Number of km : \t\t\t\t\t");
		rKM = keyboard.nextDouble();
		System.out.print("Is transport by <R>oad, <T>rain or <A>ir \t");
		cTransp = Character.toUpperCase(keyboard.next().charAt(0));
		
		while (cTransp != 'R'||cTransp != 'T'||cTransp !='A')
		{
			System.out.println("Incorrect letter entered,try again");
			
			System.out.print("Is transport by <R>oad, <T>rain or <A>ir \t");
			cTransp = Character.toUpperCase(keyboard.next().charAt(0));
			break;
		}

		System.out.print("Insurance <Y>es or <N>o \t\t\t");
		cInsure = Character.toUpperCase(keyboard.next().charAt(0));
		
		while(cInsure != 'Y'||cInsure != 'N')
		{
			
			System.out.println("Incorrect letter entered,try again");
			
			System.out.print("Insurance <Y>es or <N>o \t\t\t");
			cInsure = Character.toUpperCase(keyboard.next().charAt(0));
			break;
		}
		
		
		//set the transport cost based on the mode of travel
		switch (cTransp)
		{
			case 'R': rTransp = ROAD; break;
			case 'T': rTransp = TRAIN; break;
			case 'A': rTransp = AIR; break;
			default: rTransp = 0;
		}
		
		//calculate the cost based on the mass and the distance
		rTotal = rMass * PERKG + rTransp * rKM;
		
		//add insurance cost if chosen
		if (cInsure == 'Y')
		{
			rTotal = rTotal + INSURE_PERC/100.0 * rTotal;
			System.out.println("Adding insurance");
		}
		
		//Add VAT to the total
		rTotal = rTotal + VAT/100 * rTotal;
		
		//output
		System.out.println("You need to pay: \t\t\t\t" + formatter.format(rTotal));
	}    
}