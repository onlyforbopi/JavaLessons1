package Lesson2;

public class Lesson2Strings {
	
	public static void StringLength() {
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		
	}
	
	public static void StringUpperLower() {
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
	}
	
	
	public static void StringIndexOf() {
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
	}
	
	public static void StringConcat() {
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
	}
	
	public static void StringContains() {
		String myStr = "Hello";
		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false
	}
	
	public static void StringIsEmpty() {
		String myStr1 = "Hello";
		String myStr2 = "";
		System.out.println(myStr1.isEmpty());
		System.out.println(myStr2.isEmpty());

	}
	
	public static void StringReplace() {
		String myStr = "Hello";
		System.out.println(myStr.replace('l', 'p'));
	}
	
	public static void StringStartsWith() {
		String myStr = "Hello";
		System.out.println(myStr.startsWith("Hel"));   // true
		System.out.println(myStr.startsWith("llo"));   // false
		System.out.println(myStr.startsWith("o"));     // false


	}
}
