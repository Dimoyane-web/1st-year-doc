import java.util.Scanner;

public class Activity19b
{
	public static void main(String [] args)
	{
		Scanner kd = new Scanner(System.in);
		
		
		String City1 = "Paris";
		String City2 = "Berlin";
		
		String ChoosenCity;
		
		System.out.println("Enter your favourite city between <Paris> or  <Berlin>: ");
		ChoosenCity = kd.nextLine();
		
		
		
		
		if ((ChoosenCity.equalsIgnoreCase(City1)) || (ChoosenCity.equalsIgnoreCase(City2) ) )
		{
			System.out.println("Your favourite city is: " + ChoosenCity);
		}
		else
		{
			System.out.println("Error message.");
		}
	}
}