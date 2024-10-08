package Lesson13_OOPBasics;

import java.io.OutputStream;

class HelperService {
	
	protected String formatNumber(int value) {
		return String.format("%d", value);
	}

	protected String formatNumber(double value) {
		return String.format("%.3f", value);
	}
	
	protected String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}
}

public class methodsEx {

	
	// <access modifier> <static/non static> <return Type> <name> (<parameter type> <parameter name>, <parameter type2> <parameter name2>...)
	// access modifer = public / private / 
	// static = doesnt need object creation
	// return Type = type of the return value
	
	// Playing with access controls
	static void MethodEx1() {
		// declaration visible within the package (package private)
		System.out.println("Method code");
		// logic
	}
	
	private static void MethodEx2() {
		// declaration visible within the class only
		System.out.println("Private Method code");
	}
	
	public static void MethodEx3() {
		// declaration are visible within the package or all subclasses
		System.out.println("Private Method code");
	}
	
	protected static void MethodEx31() {
		// declaration visible anywhere
		System.out.println("Private Method code");
	}
	
	// Playing with return types
	static int MethodEx4() {
		return 4;
	}
	
	static String MethodEx5() {
		return "panagiotis";
	}
	
	// Playing with static / non static
	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	public int SquareUp(int a) {
		return a* a;
	}
	
	//Overloading
	// Why: Suppose we want variable number of parameters
	// Why: Suppose we want a different functionality on the same function
	public static int DisplayResult(int a) {
		System.out.println("Squaring a up");
		return a * a;
	}
	
	public static int DisplayResult(int a, int b) {
		System.out.println("Squaring a up");
		return a * a + b * b;
	}
	
	public static boolean DisplayResult(int a, String b) {
		System.out.println("Cannot add integer to string");
		return false;
	}
	
	public static String DisplayResult(String a, String b) {
		String outputString = a + b;
		return outputString;
	}
	
	public static void main(String[] args) {
		MethodEx1();
		MethodEx2();
		MethodEx3();
		//addNumbers;
		methodsEx obj = new methodsEx();
		int num1 = 25, num2 = 15;
		int result = obj.addNumbers(num1, num2);
		System.out.println("Sum is: " + result);
		int squareresult = obj.SquareUp(num1);
		System.out.println("Square is: " + squareresult);
		
		// Overloading
		DisplayResult(squareresult);
		DisplayResult(num1, num2);
		DisplayResult(num1, "asdsa");
		DisplayResult("Panagiotis", "Doulgeridis");
		
		HelperService a = new HelperService();
		String outputString = "test";
		outputString = a.formatNumber(5);
		outputString = a.formatNumber(5.11);
		outputString = a.formatNumber("5.11");
		
	}

}
