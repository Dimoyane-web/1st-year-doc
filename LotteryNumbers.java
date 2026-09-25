import java.util.Random;

public class LotteryNumbers {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int iLotteryNumbers;
		int iFirst,iSecond,iThird,iFourth,iFirth,iSixth;
		
		iLotteryNumbers = rd.nextInt(49 - 6 + 1) + 1;
		iSecond = rd.nextInt(49 - 1) + 1;
		iThird = rd.nextInt(49 - 1) + 1;
		iFourth = rd.nextInt(49 - 1) + 1;
		iFirth = rd.nextInt(49 - 1) + 1;
		iSixth = rd.nextInt(49 - 1 ) + 1;
		
		System.out.println("Lottery Numbers: " + iLotteryNumbers + ", " + iSecond + ", " + iThird + ", " + iFourth + ", " + iFirth + ", " + iSixth + ", " );
	}
}