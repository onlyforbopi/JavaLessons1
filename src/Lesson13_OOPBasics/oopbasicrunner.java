package Lesson13_OOPBasics;

public class oopbasicrunner {

	public static void main(String[] args) {
		
		// Basic Initialization of object
		basicclass aBasicclass = new basicclass();
		System.out.println(aBasicclass.x);
		
		// Assigning variable / Overriding variable
		basicclass2 aBasicclass2 = new basicclass2();
		aBasicclass2.x = 40;
		aBasicclass2.y = 5;
		
		// Attempting to assign to a final variable
		basicclass3 aBasicclass3 = new basicclass3();
		try {
			//aBasicclass.o = 5;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Assigning into a new variable
		basicclass3 aBasicclass32 = new basicclass3();
		//aBasicclass32.p = 1;	// will not be allowed
		// Automated message on eclipse to create a new field.
		
		// Value persistence
		basicclass2 aBasicclass22 = new basicclass2();
		basicclass2 aBasicclass23 = new basicclass2();
		aBasicclass23.x = 7;
		System.out.println(aBasicclass22.x);
		System.out.println(aBasicclass23.x);
		
		// Multiple Attributes
		MultipleProperties test1 = new MultipleProperties();
		System.out.println("Name: " + test1.fnameString + " " + test1.lnameString);
		System.out.println("Age: " + test1.lnameString);
		
		// Class Methods
		
	}

}
