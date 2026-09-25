public class Thursday{
	public static void main(String[] args){
	
		final double MICHAEL = 4/5;
		final double TANK = 2/3;
		final double SUPRISE = 1/2;
		
		double Fraction, RemainderOfMichael;
		int Capacity;
		
		RemainderOfMichael = MICHAEL % TANK;
		Fraction = RemainderOfMichael * SUPRISE;
		
		Capacity = (int) (Fraction / 500);
		
		
		System.out.println("Fraction : " + Fraction);
		System.out.println("Total Capacity: " + Capacity);
	}
}