package Lesson2;

public class Lesson2ControlBlocks {
	
	public static void ControlBlockEx1() {
		int a = 4;
		boolean b = a == 4;
		if (b) {
			System.out.println("Its true");
		}
		
		if (a == 4) {
			System.out.println("Its a 4");
		}
	}
	
	public static void ControlBlockEx2() {
		boolean isMoving = true;
		if (isMoving) {
			System.out.println("Object is moving");
		}
	}
	
	public static void ControlBlockEx3() {
		boolean isMoving = true;
		if (isMoving) {
			System.out.println("Object is moving");
		} else {
			System.out.println("Object is not moving");
		}
	}
	
	public static void ControlBlockEx4() {
		int testscore = 76;
		char grade;
		
		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >=80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
	
	public static void ControlBlockEx5() {
		int x = 10;
		int y = 12;
		if (x+y < 10) {
			System.out.println("Sum is less than 10");
		} else if (x+y>=10 && x+y <20){
			System.out.println("Sum is less than 20");
		} else {
			System.out.println("Sum is greater than 20");
		}
	}
	
	public static void ControlBlockEx6() {
		String a1 = "panos";
		if (a1 != null && !a1.isEmpty()) {
			System.out.println("String is populated");
		}
	}
	
	public static void ControlBlockEx7() {
		String a1 = "";
		if (a1 == null || a1.isEmpty()) {
			System.out.println("Empty string");
		} else {
			System.out.println("Non empty string");
		}
	}

}
