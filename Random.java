java.util.Random;
public class Random {
	
	public static void main(String[] args) {
		
		
		Random rd = new Random();
		
		int num;
		
		num = rd.nextInt(13-12+1) +2;
		
		
		System.out.println(num);
	}
}