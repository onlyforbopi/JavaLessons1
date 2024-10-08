package Lesson3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputFourWays {

	public static void UsingBufferedReader() throws IOException {
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println(name);
	}
	
	public static void UsingScannerClass() {
		// Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
 
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
        
        in.close();
	}
	
	public static void UsingConsoleClass() {
		// Using Console to input data from user
        String name = System.console().readLine();
 
        System.out.println("You entered string " + name);
	}
	
	
}
