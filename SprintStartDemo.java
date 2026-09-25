public class SprintStartDemo{
	public static void main(String[] args){
		
		
		double  Race1,Race2,Race3,Fastest;
		
		
		//randomize the races
		Race1 = Math.random() * (10) + 10;
		Race2 = Math.random() * (10) + 10;
		Race3 = Math.random() * (10) + 10;
		
		//rounding of the raceses  to 3 decimals
		Race1 = Math.round(Race1 * 1000)/ 1000.0;
		Race2 = Math.round(Race2 * 1000)/1000.0;
		Race3 = Math.round(Race3 * 1000)/1000.0;
		
		Fastest = Math.min(Race1,Math.min(Race2,Race3));
		
		//output
		System.out.println("------ RACE REPORT ------\n");
		System.out.println("Race 1 Time: " + Race1 + " seconds");
		System.out.println("Race 2 Time: " + Race2 + " seconds");
		System.out.println("Race 3 Time: " + Race3 + " seconds\n");
		
		System.out.println("Fastest Time: " + Fastest + " seconds");
	}
}