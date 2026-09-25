import java .util.Scanner; 
public class Activity11e
{
	public static void main(String[] args)
	{
		Scanner kd = new Scanner(System.in);
		
		String Subject6,Subject1,Subject2,Subject3,Subject4,Subject5,Engineering;
		int Sub1,Sub2,Sub3,Sub4,Sub5,Sub6;
		double Average;
		boolean flag1,flag2,flag3;
		
		
		System.out.print("Please enter your Subject1 (excluding LO): ");
		Subject1 = kd.nextLine();
		System.out.print("Please enter your Subject2(excluding LO): ");
		Subject2 = kd.nextLine();
		System.out.print("Please enter your Subject3 (excluding LO): ");
		Subject3 = kd.nextLine();
		System.out.print("Please enter your Subject4 (excluding LO): ");
		Subject4 = kd.nextLine();
		System.out.print("Please enter your Subject5 (excluding LO): ");
		Subject5 = kd.nextLine();
		System.out.print("Please enter your Subject6 (excluding LO): ");
		Subject6 = kd.nextLine();
		
		
		System.out.print("Enter the percetage marks for your Subject1: ");
		Sub1 = kd.nextInt();
		System.out.print("Enter the percetage marks for your Subject2: ");
		Sub2 = kd.nextInt();
		System.out.print("Enter the percetage marks for your Subject3: ");
		Sub3 = kd.nextInt();
		System.out.print("Enter the percetage marks for your Subject4: ");
		Sub4 = kd.nextInt();
		System.out.print("Enter the percetage marks for your Subject5: ");
		Sub5 = kd.nextInt();
		System.out.print("Enter the percetage marks for your Subject6: ");
		Sub6 = kd.nextInt();
		
		
		
		flag1 = ((Subject.equalsIngoreCase("Mathematics") || Subject.equalsIngoreCase("PhysicalScience")) && ( 'Sub1' >= 70 || 'Sub2' >= 70))
	            ? true
		        : false;
		
		flag2 = (Subject1 >= 80 || Subject2 >= 80 || Subject3 >= 80 || Subject4 >= 80 || Subject5 >= 80 || Subject6 >= 80) 
		        ? true
		        : false;
		
		
		Average = (Sub1 + Sub2 + Sub3 + Sub4 + Sub5 + Sub6) / 6.0;
		
		flag3 = (Average >65) 
		       ? true
		       : false;
			   
		
		if  (flag1 && flag2 && flag3)
		{
			System.out.println("You qualify to study engineering");
		}
		else 
		{
			System.out.println("You dont qualify to study engineering");
		}
	}
}
		
		
		