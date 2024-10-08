package Lesson3;

import java.util.Spliterator.OfPrimitive;

public class LoopsBasicFor {
	
	public static void LoopsEx1() {
		for (int i=1; i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void LoopsEx2() {
		for (int i=1;i<=3;i++) {
			for (int j=1; j<=3; j++) {
				System.out.println(i + ":" + j);
			}
		}
	}
	
	public static void LoopsEx3() {
		for (int i=1; i<=5; i++) {
			for (int j=1;j<=i;j++) {
				System.out.println("* ");
			}
		}
	}
	
	public static void LoopsEx4() {
		int term = 6;
		for (int i=1; i<=term; i++) {
			for (int j=term; j>=i; j--) {
				System.out.println("* ");
			}
		}
	}
	
	public static void LoopsEx5() {
		for (;;) {
			System.out.println("Infinite Loop");
		}
	}
	
	public static void LoopsEx6() {
		int[] numbers = {1,2,3,4,5};
		for (int item : numbers) {
			System.out.println(item);
		}
	}
	
	public static void LoopsEx7() {
		aa:
			for (int i=1;i<=3;i++) {
				bb:
					for(int j=1;j<=3;j++) {
						if (i==2 && j ==2) {
							break aa;	
						}
					}
			}
	}

	public static void LoopsEx8() {
		aa:
			for (int i=1;i<=3;i++) {
				bb:
					for(int j=1;j<=3;j++) {
						if (i==2 && j ==2) {
							break bb;	
						}
					}
			}
	}

}
