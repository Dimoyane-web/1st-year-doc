import java.util.Scanner;
import java.util.Random;

public class DoubleLockerApplication {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
		int PrimaryLoceker,BackupLocker;
		int Max = 100;
		int Min = 10;
		String StudentNumber;
		
		System.out.print("Enter Student number: ");
		StudentNumber = kb.nextLine();
		
		PrimaryLoceker = rd.nextInt(Max - Min + 1) + Min;
		BackupLocker = rd.nextInt(Max - Min + 1) + Min;
		
		System.out.println("--- Locker Allocation ---");
		System.out.println("Student Number: " + StudentNumber);
		System.out.println("Primary Locker Number: " + PrimaryLoceker);
		System.out.println("Backup Locker Number: " + BackupLocker);
	}
}