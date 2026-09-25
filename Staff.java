import  java.util.Random;

public class Staff
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		
		int num1,num2,counter = 0;
		
		do{
			num1 = rd.nextInt(6) + 1;
			num2 = rd.nextInt(6) + 1;
			counter++;
			System.out.println("I threw " + num1 + " and " + num2);
		}
		while (num1 != num2);
		
		
		System.out.println("I had to roll the dice " + counter + " times to get a double.");
	}
}
			