import java.util.Scanner;
import java.text.DecimalFormat;


public class PizzaShop
{
	public static void main(String[] args) 
	{
		
		Scanner kd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		
		final double PIZZA_BASE = 40.00;
		
		char Answer;
		double ToppingCost = 0,TotalCost = 0;
		int NumberOfTopping = 0;
		
		
		System.out.print("Do you want a topping <Y>es or <N>o? ");
		Answer = Character.toUpperCase(kd.next().charAt(0));
		
		while (Answer == 'Y' && NumberOfTopping < 3)
		{
			NumberOfTopping++;
			
			System.out.print("Cost of the topping the customer wants: ");
			ToppingCost = kd.nextDouble();
			
			TotalCost += ToppingCost;
			
			System.out.print("Do you want a topping <Y>es or <N>o? ");
			Answer = Character.toUpperCase(kd.next().charAt(0));
		}
		
		if(Answer == 'Y' && NumberOfTopping == 3)
			System.out.println("Remind the customer that the maximum number of toppings 3");
		System.out.println("Total cost is " + df.format(TotalCost));
	}
}
