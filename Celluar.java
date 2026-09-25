import java.text.DecimalFormat;
import java.util.Scanner;

public class Celluar{
	public static void main(String[] args){
		
		
		int kwh = 447, units = 18;
		
		int y;
		
		y = (int) ((kwh % units) + Math.pow(units,2) - Math.min(kwh,(units * 10)));
		

		System.out.print(y);
	}
}
		