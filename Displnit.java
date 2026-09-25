import java.util.Scanner;

public class Displnit {
	
	public static void main(String[] args) {
		
		Scanner kd = new Scanner(System.in);
		
		String sName,sSurname,sGroup;
		char cNameInitials,cSurnameInitial;
		
		//prompting the useer to enter their details
		System.out.print("Enter first name: ");
		sName = kd.next();
		cNameInitials = sName.charAt(0);
		System.out.print("Enter surname: ");
		sSurname = kd.next();
		cSurnameInitial = sSurname.charAt(0);
		System.out.print("Enter class group: ");
		sGroup = kd.next();
		char cGroup = sGroup.charAt(0);
		
		System.out.println(" Your initials are: " + cNameInitials + "." + cSurnameInitial + ".");
		System.out.println("You are in group " + cGroup);
		
	}
}