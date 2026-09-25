import java.util.Random;

public class StudentNumber{
	public static void main(String[] args){
		
		Random rd = new Random();
		
		
		int StudentNumber;
		int Max = 229999999;
		int Min = 220000000;
		
		StudentNumber = rd.nextInt(Max - Min + 1) + Min;
		
		
		System.out.println("The Student Number is " + StudentNumber);
	}
}