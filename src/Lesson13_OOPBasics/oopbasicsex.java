package Lesson13_OOPBasics;



// Simple class
class basicclass {
	
	int x = 5;
	
}

class basicclass2{
	
	int x = 5;
	int y;
}

class basicclass3{
	
	final int o = 5;
	int q = 3;
}

class MultipleProperties{
	
	String fnameString;
	String lnameString = "Doe";
	int age = 24;
	
}


class OnlyMethods {
	
	void DoSomething1() {
		System.out.println("Do somethin");
	}
	
	void DoSomething2(String something) {
		System.out.println("Do " + something);
	}
	
	void DoSomething3(int x, String something) {
		System.out.println("Do something " + x + " times");
	}
}

class PrivatePublicMethods {
	
	public void DoSomething1() {
		
	}
	
	private void DoSomething2() {
		
	}
	
	protected void DoSomething3() {
		
	}
	
}

class MethodReturnTypes {
	
}

class PropertiesAndMethods {
	
}

class PropMethConstructor {
	
}

class PropMethConstrValidation {
	
}

class FullExampleConstructors {
	
	String nameString;
	String lnameString;
	int age;
	boolean isadult;
	int[] grades;
	
	public FullExampleConstructors() {
		
		nameString = "panagiotis";
		lnameString = "doulgeridis";
		age = 15;
		isadult = false;
		grades = new int[] { 10, 11, 13 };
	}
	
}

class FullExampleConstructorsParameter{
	
	String nameString;
	String lnameString;
	int age;
	boolean isadult;
	int[] grades;
	
	public FullExampleConstructorsParameter(String name, String lastname, int ageno, boolean adult, int[] vathmoi) {
		
		//nameString = "panagiotis";
		//lnameString = "doulgeridis";
		//age = 15;
		//isadult = false;
		//grades = new int[] { 10, 11, 13 };
		
		nameString = name;
		lnameString = lastname;
		age = ageno;
		isadult = adult;
		grades = vathmoi;
	}
	
	
}


class FullExampleConstructorsParameterThis{
	
	String nameString;
	String lnameString;
	int age;
	boolean isadult;
	int[] grades;
	
	public FullExampleConstructorsParameterThis(String name, String lastname, int ageno, boolean adult, int[] vathmoi) {
		
		//nameString = "panagiotis";
		//lnameString = "doulgeridis";
		//age = 15;
		//isadult = false;
		//grades = new int[] { 10, 11, 13 };
		
		this.nameString = name;
		this.lnameString = lastname;
		this.age = ageno;
		this.isadult = adult;
		this.grades = vathmoi;
	}
	
	
}


class FullExampleConstructorsParameterValidation{
	
	String nameString;
	String lnameString;
	int age;
	boolean isadult;
	int[] grades;
	
	public FullExampleConstructorsParameterValidation(String name, String lastname, int ageno, boolean adult, int[] vathmoi) {
		
		//nameString = "panagiotis";
		//lnameString = "doulgeridis";
		//age = 15;
		//isadult = false;
		//grades = new int[] { 10, 11, 13 };
		
		if (name.isBlank()) {
			System.out.println("Cannot provide blank name");
		} else {
			this.nameString = name;
		}
		
		if (lastname.isBlank()) {
			System.out.println("Cannot provide blank name");
		} else {
			this.lnameString = name;
		}
		
		
		
		this.lnameString = lastname;
		this.age = ageno;
		this.isadult = adult;
		this.grades = vathmoi;
	}
	
	
}

public class oopbasicsex {


	
}
