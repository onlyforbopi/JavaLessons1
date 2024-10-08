package Lesson3;
import java.util.Scanner;

public class UserInputScanner {
	
	public static void ScannerExString() {
		
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Name: " + name);
		sc.close();
		
	}
	
	public static void ScannerExChar() {
		
		System.out.println("Enter a char:");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		System.out.println("Gender: " + gender);
		sc.close();
		
	}
	
	public static void ScannerExInt() {
		
		System.out.println("Enter an integer:");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		System.out.println("Age: " + gender);
		sc.close();
	}
	
	public static void ScannerExLong() {
		System.out.println("Enter a long integer:");
		Scanner sc = new Scanner(System.in);
		long mobileNo = sc.nextLong();
		System.out.println("Mobile:: " + mobileNo);
		sc.close();
	}
	
	public static void ScannerExDouble() {
		System.out.println("Enter a double integer:");
		Scanner sc = new Scanner(System.in);
		double gpa = sc.nextDouble();
		System.out.println("GPA: " + gpa);
		sc.close();
	}

}
