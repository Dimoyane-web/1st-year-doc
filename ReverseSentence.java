import java.util.Scanner;

public class ReverseSentence
{
	public static void main(String[] args)
	{
		
		Scanner kd = new Scanner(System.in);
		
		int Num;
		String Sentence, Under = "_";
		
		System.out.println("Enter a sentence and i will underline it: ");
		Sentence = kd.nextLine();
		
	
		for (Num = 0;Num < Sentence.length(); Num++)
		{
			System.out.print("_");
		}
	}
}