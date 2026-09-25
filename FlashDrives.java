import java.util.Scanner;

public class FalshDrives{
	public static void main(String[] args) {
		
		Scanner kd = new Scanner(System.in);
		
		
		final int USB_FlASH_DRIVES = 48;
		
		int NumberOfStudents,FlashDrivesPerStudent;
		
		
		System.out.print(" Enter the number of Students: ");
		NumberOfStudents = kd.nextInt();
		
		
		FlashDrivesPerStudent = USB_FlASH_DRIVES/ NumberOfStudents;
		
		System.out.println("Each student will have " + FlashDrivesPerStudent + " USB Flash Drives");
	}
}