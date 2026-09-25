import java.util.Random;
public class Randoms {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		
		//random 3 digits number
		
		
		int RandNum = rd.nextInt(999 - 100 +1) + 100;
		int iFirst = RandNum/100;
		int iSecond = (RandNum / 10) % 10;
		int iThird = RandNum % 10;
		
		System.out.println("The first digits: " + iFirst);
		System.out.println("The Second Digits: " + iSecond);
		System.out.println("The third digit: " + iThird);
	}
}