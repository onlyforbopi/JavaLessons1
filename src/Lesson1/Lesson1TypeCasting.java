package Lesson1;
import Lesson1.Lesson1Operators;
import Lesson1Exercises.*;




public class Lesson1TypeCasting {
	
	public static void Widening_TypeCasting_Examples() {
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	}
	
	public static void Narrowing_TypeCasting_Examples() {
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	}
	
	public static void TypeCastingEx1() {
		int x = 7;
		long y = x;
		float z = y;
		
		System.out.println("Int value: " + x);
		System.out.println("Long value: " + y);
		System.out.println("Float value: " + z);
	}

	public static void TypeCastingEx2() {
		double d = 166.66;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Int value: " + i);
		System.out.println("Long value: " + l);
		System.out.println("Float value: " + d);
	}
	
}
