package Lesson1;

public class Lesson1Vars {
	
	public static void SimpleVars() {
		
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
	}
	
	
	public static void VarAssign() {
		
		// Concatenate strings
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		// Add variables
		int x = 5;
		int y = 6;
		System.out.println(x + y);
	}

	public static void MultiDeclare() {
		
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z);
		
		// Equivalent
		int a = 5, b = 6, c = 50;
		System.out.println(a + b + c);
	}
	
	
}
