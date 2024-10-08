package Lesson4;

public class CharConversions {
	
	public static void IntToChar() {
	       // Custom integer input
        int i = 97;
 
        // Type casting character to integer
        char ch = (char)i;
 
        // Print statement
        System.out.println(ch);
	}
	
	public static void CharToInt() {
		// Declaring and initializing a character
        char ch = '3';
 
        // Printing the character value
        System.out.println("char value: " + ch);
 
        // Converting the character to it's integer value
        // using valueOf() method
        int a = Integer.parseInt(String.valueOf(ch));
 
        // Printing the integral value
        // corresponding to its character value
        System.out.println("int value: " + a);
	}
	
}
