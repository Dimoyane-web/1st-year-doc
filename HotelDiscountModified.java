import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelDiscountModified
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		/*final double ZIP_LINING = 0.1;
		final double HORSE_RIDING = 0.125;
		final double SITE_SEEING = 0;
		final double SPEEDBOAT = 0.1;/*/
		
		int Activities,NumberOfActivities,options,Counter = 0;
		double Bill,Discount = 0,total_Discount = 0,After_Discount = 0,DiscountCounter = 0;
		
		System.out.print("How much is your orginial hotel bill: ");
		Bill = kd.nextDouble();
		System.out.print("How many activities did you do?: ");
		NumberOfActivities = kd.nextInt();
		
		if (NumberOfActivities < 0 || NumberOfActivities > 4)
		{
			System.out.print("Please re-enter the number of activities you did: ");
			NumberOfActivities = kd.nextInt();
		}
		
		
			System.out.println("Activities\t\tDiscount");
			System.out.println("\n1. Zip-lining\t10%\n2. Horse riding\t\t12.5%\n3. Site seeing\t\t0%\n4. SpeedBoat\t\t10%");
			
			
		//while loop condition
		while (Counter < NumberOfActivities)
		{
			Counter++;
			System.out.print("Pick your activity No " + Counter + "< options 1 to 4>:");
			options = kd.nextInt();
			
			
			System.out.print("Please re-enter the number of activities you did: ");
			NumberOfActivities = kd.nextInt();
			
			
			
			
			switch(options)
			{
				case 1: Discount = 10/100 * Bill;;break;
				case 2: Discount = 12.5/100 * Bill; break;
				case 3: Discount = 0/100 * Bill;break;
				case 4: Discount = 10/100 * Bill;break;
				default: Discount  = 0; System.out.println("Invalid choice!"); break;
				
				
				
			}
			total_Discount += Discount;
			System.out.println("So far, your discount is: " + df.format(total_Discount));
		}
			System.out.println("Your total discount is: " + df.format(total_Discount));
			After_Discount = Bill - total_Discount;
			System.out.println("After discount, your bill will be " + df.format(After_Discount));
	}
}
