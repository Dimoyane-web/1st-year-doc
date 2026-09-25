import java.util.Scanner; (5)

public class Thuli{
	public static void main(String[] args){
		
		Scanner kd = new Scanner(System.in);
		
		String Name;
		int Mark1,Mark2,Mark3;
		double Average;
		
		
		System.out.print("Enter your name: ");
		Name = kd.next();
		
		
		System.out.print("Enter the marks of the 1st test: ");
		Mark1 = kd.nextInt();
		System.out.print("Enter the marks of the 2nd test: ");
		Mark2 = kd.nextInt();
		System.out.print("Enter the marks of the 3rd test: ");
		Mark3  = kd.nextInt();
		
		//Processing
		Average = Math.round((Mark1+ Mark2 + Mark3 / 3.0) * 100) /100.0;
		
		System.out.println( Name + " you have an average of " + Average);
	}
}