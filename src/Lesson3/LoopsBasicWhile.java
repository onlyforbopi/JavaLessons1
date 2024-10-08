package Lesson3;

public class LoopsBasicWhile {

	public static void WhileEx1() {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void WhileEx2() {
		int i = 10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}

	public static void WhileEx3() {
		while(true) {
			System.out.println("Infinite while");
		}
	}

	public static void WhileEx4() {
		int count = 1;
		do {
			System.out.println("Count is:" + count);
			count++;
		} while (count < 11);
	}
	
	
}
