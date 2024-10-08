package Lesson2;

public class Lesson2Boolean {

	public static void BooleanExample1() {
		boolean isreal = true;
		boolean isbad = false;
		System.out.println(isreal);
		System.out.println(isbad);
	}
	
	public static void BooleanExpressions() {
		int x = 10;
		int y = 9;
		System.out.println(x > y);
		System.out.println(10>9);
		System.out.println(8>10);
		System.out.println(x == 10);
	}
	
	public static void BooleanExpressionRealWorld() {
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
	}
	
	public static void BooleanExpressionRealWorldIf() {
		int myAge = 17;
		int votingAge = 40;
		if (myAge > votingAge) {
			System.out.println("Can vote");
		} else {
			System.out.println("Cant vote");
		}
	}
	
	public static void AllBooleanOperators() {
		int a = 4;
		int b = 5;
		boolean result;
		result = a < b; // true
		System.out.println(result);
		result = a > b; // false
		System.out.println(result);
		result = a <= 4; // a smaller or equal to 4 - true
		System.out.println(result);
		result = b >= 6; // b bigger or equal to 6 - false
		System.out.println(result);
		result = a == b; // a equal to b - false
		System.out.println(result);
		result = a != b; // a is not equal to b - true
		System.out.println(result);
		result = a > b || a < b; // Logical or - true
		System.out.println(result);
		result = 3 < a && a < 6; // Logical and - true
		System.out.println(result);
		result = !result; // Logical not - false
		System.out.println(result);
	}
}
