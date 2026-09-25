public class CapeToCairo { //start class 
	 public static void main(String[] args) { //start main method 
		 int iTime = 588224;  // time in seconds, to drive from Cape Town to Cairo 
		 int iSeconds = iTime % 60; // iSeconds will be ______________seconds
		 
		 iTime = iTime / 60; // iTime will be    minutes
		 int iMinutes = iTime % 60; // iMinutes will be  
		 iTime / 60; 
		 int iHours = iTime % 60; 
		 int iDays = iTime / 24; 
		 
		 
		 System.out.println("Driving from Cape Town to Cairo would take " + iDays + "days " + iHours + "hours " +  iMinutes + "min and " + iSeconds + "sec."); 
	 }
}