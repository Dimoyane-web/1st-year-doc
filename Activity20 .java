import java.util.Scanner;

public class Activity20 
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		String Sub1,Sub2,Sub3,Sub4,Subject;
		int SubMark1,SubMark2,SubMark3,SubMark4,SubMark5,SubMark6;
		double Average;
		boolean = flag1,flag2,flag3;
		
		
		System.out.print("Did you do Mathematics and Physcial Science in grade 12 <Yes> or <No>: ");
		Subject = kd.nextLne();
		
		flag1 = if (Subject == 'Yes' || Subject == 'yes')
		{
			System.out.println(" Enter the percentage marks you got for Mathematics: ");
			SubMark1 = kd.nextInt();
			
			System.out.println("Enter the percentage marks you got for Physcial Science: ");
			SubMark2 = kd.nextInt();
		}
		else 
		{
			System.out.println("You need to have both Physcial Science and Mathematics to processed with the application");
		}
		
		System.out.print("Enter the percentage marks you got for Subject1: ");
		SubMark3 = kd.nextInt();
		System.out.print("Enter the percentage marks you got for Subject 2: ");
		SubMark4 = kd.nextInt();
		System.out.print("Enter the percentage marks you got for Subject 3: ");
		SubMark5 = kd.nextInt();
		System.out.print("Enter the percentage marks you for Subject 4: ");
		SubMark6 = kd.nextInt();
		
		flag3 = if ((SubMark3 || SubMark4 || SubMark5 || SubMark5 || SubMark6) <59 )
		{
			 true
		}
		else 
		{
			System.out.println("No Subject needs to be under 60% ");
		}
		Average = double (SubMark1 + SubMark2 + SubMark3 + SubMark4 + SubMark5 + SubMark6) / 6.0;
		
		flag2 = if (Average >= 65) ? true : false;
		
		
		
			