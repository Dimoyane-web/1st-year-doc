import java.util.Scanner;
public class Activity12c
{
	public static void main (String args[])
	{
		String sMytext = "jOsEpH";
		
		
		char cFirstChar = sMytext.charAt(0); 
		
		char cSecChar = sMytext.charAt(1);
		
		System.out.println(Character.toUpperCase(cFirstChar)== 74);
		
		System.out.println(Character.toLowerCase(cSecChar)>= 111);
		
		System.out.println(Character.toLowerCase(cFirstChar)> 106); 
		
		System.out.println(Character.toUpperCase(cFirstChar));
		
		System.out.println(Character.toLowerCase(cSecChar));
		
		System.out.println(sMytext);
		
	}
}
