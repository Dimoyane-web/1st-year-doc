import java.util.Scanner;

public class VoteArtist
{
	public static void main(String[] args)
	{
		Scanner kd  = new Scanner(System.in);
		
		int NumViewers = 0,NumVoters,Viewer;
		char Code;
		
		System.out.print("How many viewers voted?: ");
		NumVoters = kd.nextInt();
		
		for(Viewer = 1; Viewer < NumViewers; Viewer++);
		{
			System.out.print("Viewer " + Viewer + ": A or B? ");
			Code = kd.next().charAt(0);
			
		
			
			if ((Code != 'A' || Code != 'a') || (Code != 'A' || Code != 'a'))
			{
				System.out.print("Illegal code.], the vote will not be counted.");
				
				System.out.print("Viewer " + Viewer + ": A or B? ");
				Code = kd.next().charAt(0);
				NumVoters++;
				
				System.out.print("Viewer " + Viewer + ": A or B? ");
				Code = kd.next().charAt(0);
			
			}
		}
		if (Code == 'a' || Code == 'A')
		{
			System.out.println("Artist A has " + NumVoters + " votes.");
		}
		else if (Code == 'b' || Code == 'B')
		{
			System.out.println("Artist B has " + NumVoters + " votes.");
		}
	}
}
			
				
				