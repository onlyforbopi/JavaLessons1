package Lesson3;
import java.io.*;
import java.util.Scanner;

public class UserInputLesson3Basic {

	public static void main(String[] args) throws IOException {
		System.out.println("User input examples");
		
		
		///////////////////////////////////////////
		// Example 1
		// Using Buffered reader
		System.out.println("Enter a string: ");
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		String str = bfn.readLine();
		System.out.println("Enter an integer: ");
		int it = Integer.parseInt(bfn.readLine());
		
		// Printing String
        System.out.println("Entered String : " + str);
 
        // Printing Integer
        System.out.println("Entered Integer : " + it);
        
        
        //////////////////////////////////////////////
        // Example 2
        Scanner scn = new Scanner(System.in);
        
        // input is a string ( one word )
        // read by next() function
        System.out.println("Scanner: Enter a string: ");
        String str1 = scn.next();
        
        // print String
        System.out.println("Scanner:Entered String str1 : " + str1);
 
        // input is a String ( complete Sentence )
        // read by nextLine()function
        System.out.println("Scanner:Enter a sentence: ");
        String str2 = scn.next();
 
        // print string
        System.out.println("Scanner:Entered String str2 : " + str2);
 
        // input is an Integer
        // read by nextInt() function
        System.out.println("Scanner:Enter an integer: ");
        int x = scn.nextInt();
 
        // print integer
        System.out.println("Scanner:Entered Integer : " + x);
 
        // input is a floatingValue
        // read by nextFloat() function
        System.out.println("Scanner:Enter a float: ");
        float f = scn.nextFloat();
 
        // print floating value
        System.out.println("Scanner:Entered FloatValue : " + f);
        
        scn.close();
        
        
        /////////
        UserInputScanner.ScannerExString();
        UserInputScanner.ScannerExChar();
        UserInputScanner.ScannerExInt();
        UserInputScanner.ScannerExDouble();
        UserInputScanner.ScannerExLong();
        
        /////////
        UserInputFourWays.UsingBufferedReader();
        UserInputFourWays.UsingScannerClass();
        UserInputFourWays.UsingConsoleClass();

	}

}
