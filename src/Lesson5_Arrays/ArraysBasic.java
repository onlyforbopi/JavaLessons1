package Lesson5_Arrays;

import java.util.Spliterator.OfPrimitive;


public class ArraysBasic {
	public static void ArrayDeclare() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 50;
		a[4] = 60;
	}
	
	public static void arrayasparam(int arr[]) {
		for (int i: arr) {
			System.out.println(i);
		}
	}
	
	public static void ArrayDeclareAssignVar() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 50;
		a[4] = 60;
		arrayasparam(a);
	}
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int[] returnArray() {
		return new int[] {1,2,3,4};
	}
	
	public static void AnonymousArray() {
		printArray(new int[] {10,22,33});
		int arr[] = returnArray();
	}
	
	public static void ArrayCopy() {
		String[] copyFrom = { "aaa", "bbb", "ccc", "dddd", "eeeee"};
		String[] copyTo = new String[5];
		System.arraycopy(copyFrom, 2, copyTo, 0, 3);
		
		for (String coffeeString : copyTo) {
			System.out.println(coffeeString);
		}
		
	}
	
	public static void ArrayCopyOfRange() {
		String[] copyFrom = { "aaa", "bbb", "ccc", "dddd", "eeeee"};
		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 4);
		
		for (String coffeeString : copyTo) {
			System.out.println(coffeeString);
		}
	}
	
	public static void IterateOverArray() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 50;
		a[4] = 60;
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for (int i: a) {
			System.out.println(i);
		}
	}
	
	public static void PrintArraySimple(int array[]) {
		System.out.println("-----------------");
		for (int x : array) {
			System.out.println(x);
		}
	}
	
	public static void PrintArrayAdv(int array[]) {
		System.out.println("----------------------");
		System.out.println("[");
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i]);
			if (i == array.length - 1) {
				continue;
			} else {
				System.out.print(" ,");
				
			}
			System.out.println("]");
		}
	}
	
	public static void PrintArrayAdvStr(String array[]) {
		System.out.println("----------------------");
		System.out.println("[");
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i]);
			if (i == array.length - 1) {
				continue;
			} else {
				System.out.print(" ,");
				
			}
			System.out.println("]");
		}
	}
}
