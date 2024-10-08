package Lesson4;

public class StringConversions {

	public static void BooleanToString() {
		// boolean type value
        boolean value = false;
  
        // static toString() method of Boolean class
        String output = Boolean.toString(value);
  
        // printing the value
        System.out.println(output);
	}
	
	public static void StringToDouble() {
		// Create and initializing a string
        String str = "2033.12244";
 
        // Converting the above string into Double
        // using parseDouble() Method
        double str1 = Double.parseDouble(str);
 
        // Printing string as Double type
        System.out.println(str1);
	}
	
	public static void DoubleToString() {
		// Declaring and initializing number
        double number = 123.456;
 
        // Converting Double data to String data
        String output = Double.toString(number);
 
        // Printing above string on console
        System.out.println(output);
	}
	
	public static void StringToLong() {
		// Creating custom string
        String str = "999999999999";
 
        // Printing the above string
        System.out.println("String - " + str);
 
        // Converting into Long data type
        long varLong = Long.valueOf(str);
 
        // Printing String as Long
        System.out.println("Long - " + varLong);
	}
	
	public static void LongToString() {
		// create a Long
        Long varLong = 999999999999L;
 
        // convert into String
        String str = String.valueOf(varLong);
 
        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                           + str.getClass().getName());
 
        // print Long as String
        System.out.println(str);
	}
	
}
