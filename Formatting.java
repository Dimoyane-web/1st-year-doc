
import java.text.DecimalFormat;
public class Formatting{
	public static void main(String[] args){
		
		double Number = 5486523;
		DecimalFormat df = new DecimalFormat("0120000000");
		System.out.println(df.format(Number));
	}
}