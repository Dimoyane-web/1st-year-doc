import java.util.Scanner;

public class Adidas{
	public static void main(String[] args) {
		
		Scanner kd = new Scanner(System.in);
		
		System.out.print("Enter class group: ");
		String sClassGroup = kd.next();
		char cClassGroup = sClassGroup.charAt(3);
		
		System.out.println("class group: " + cClassGroup);
	}
}