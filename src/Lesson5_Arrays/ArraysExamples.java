package Lesson5_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import javax.security.auth.x500.X500Principal;

public class ArraysExamples {


	public static void Array_CheckEquality() {
		// Note: This is useful for checking whether two arrays are equal.
		// It uses the .equals method, and essentially checks all elements.
		// Useful for int statements.
		
		// Initializing the first array
        int a[] = { 30, 25, 40 };
  
        // Initializing the second array
        int b[] = { 30, 25, 40 };
  
        // store the result
        // Arrays.equals(a, b) function is used to check
        // whether two arrays are equal or not
        boolean result = Arrays.equals(a, b);
  
        // condition to check whether the
        // result is true or false
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
	}
	
	 public static int[] removeElements(int[] arr, int key)
	    {
		 	// Removes one element, and moves all elements one slot to the left.
		    // Does not change original array but returns a copy
		    // Useful for filtering.
		 
	        // Move all other elements to beginning
	        int index = 0;
	        for (int i=0; i<arr.length; i++)
	            if (arr[i] != key)
	                arr[index++] = arr[i];
	 
	        // Create a copy of arr[]
	        return Arrays.copyOf(arr, index);
	    }
	
	public static void Array_RemoveAllOccurrencesOfElement() {
		// Runner for the above.
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
	}
	
	private static void FindCommonElemet(String[] arr1, String[] arr2)
	{
		
			// Explain what is a set
		    // Find common element between arrays.
			Set<String> set = new HashSet<>();
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {

						// add common elements
						set.add(arr1[i]);
						break;
					}
				}
			}
			for (String i : set) {
				System.out.print(i + " ");
			}
	}
	
	public static void Array_FindCommonElements() {
		// create Array 1
		// Runner for the above.
        String[] arr1
            = { "Article", "in", "Geeks", "for", "Geeks" };
 
        // create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };
 
        // print Array 1
        System.out.println("Array 1: "
                           + Arrays.toString(arr1));
 
        // print Array 2
        System.out.println("Array 2: "
                           + Arrays.toString(arr2));
 
        System.out.print("Common Elements: ");
 
        // Find the common elements
        FindCommonElemet(arr1, arr2);
	}
	
	public static void Array_CopyAllElements() {
		// Copy allelements iteratively
		// This is used to produce safety copies of arrays
		// Explain logic.
		
		int a[] = { 1, 8, 3 };
		  
        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];
  
        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
        b = a;
  
        // Change to b[] will also reflect in a[]
        // as 'a' and 'b' refer to same location.
        b[0]++;
  
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
  
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
	}
	
	
	/*Function to left rotate arr[] of size n by d*/
    public static void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
  
    public static void leftRotatebyOne(int arr[], int n) 
    {
    	// LeftRotate - useful if we want to add/remove elements
    	// we can use the left rotate to occupy the new slot.
    	// By iterating over leftRotateByOne we can rotate the entire array.
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
  
    /* utility function to print an array */
    public static void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
  
	
	public static void Array_Rotation() {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
	}
	
	public static void FilterByIndex() {
		int inputArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		// restrain elements > 5 index
		for (int i = 0; i<inputArray.length;i++) {
			if (i >=4) {
				System.out.println(inputArray[i]);
			}
			
		}
	}
	
public static void FilterEvenElements() {
		
		int inputArray[] = new int[] { 100, 200, 300, 400, 500, 600, 700 };
		ArraysBasic.PrintArrayAdv(inputArray);
		
		for (int i = 0; i<inputArray.length;i++) {
			if (i % 2 !=0) {
				System.out.println(inputArray[i]);
			}
			
		}
		
	}
	
	public static void FilterOddElements() {
		int inputArray[] = new int[] { 100, 200, 300, 400, 500, 600, 700 };
		ArraysBasic.PrintArrayAdv(inputArray);
		
		for (int i = 0; i<inputArray.length;i++) {
			if (i % 2 ==0) {
				System.out.println(inputArray[i]);
			}
			
		}
	}
	
	public static void SeparateEvenOddElements() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8};
		int arraysize = array.length;
		
		int evenSize = 0;
		int oddSize = 0;
		
		for (int i = 0; i < arraysize; i++) {
			if (array[i] % 2 == 0) {
				evenSize++;
			} else {
				oddSize++;
			}
		}
		
		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];
		
		int j =0, k =0;
		
		for (int i =0; i < arraysize; i++) {
			if (array[i] % 2 == 0) {
				even[j++] = array[i];	
			} else {
				odd[k++] = array[i];
			}
			
		} 
		
		System.out.println("Even array: ");
		ArraysBasic.PrintArrayAdv(even);
		System.out.println("Odd array: ");
		ArraysBasic.PrintArrayAdv(odd);
		
	}
	
	public static void ExtendingArrays() {
		// Arrays are immutable - cant change anything
		// we need to create a new array and copy the values of the old
		String[] wordStrings = new String[] { "AB", "NC", "GE"};
		String[] extendWordStrings = new String[5];
		
		extendWordStrings[3] = "IO";
		extendWordStrings[4] = "IO2";
		
		System.arraycopy(wordStrings,  0, extendWordStrings, 0, wordStrings.length);
		
		ArraysBasic.PrintArrayAdvStr(extendWordStrings);
		
		
	}
	
	public static void AddSingleElementToArray() {
		
		int i;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int x = 50;
		
		int newarr[] = new int[n+1];
		ArraysBasic.PrintArrayAdv(arr);
		
		for (i = 0; i< n ; i++) {
			newarr[i] = arr[i];
		}
		
		ArraysBasic.PrintArrayAdv(newarr);
		
	}
	
	public static void SearchMethodComparison() {
		
		int arr[] = {5, 1, 3, 4, 7, 2, 9};
		int checkvalue = 7;
		
		
		ArrayLinearSearch(arr, checkvalue);
		ArrayBinarySearch(arr, checkvalue);
		ArrayContains(arr, checkvalue);
		ArrayStreamAnymatch(arr, checkvalue);
	}
	
	public static void ArrayLinearSearch(int[] arr, int toCheckValue) {
		
		boolean test = false;
		
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}
		System.out.println("Element = " + toCheckValue);
		System.out.println("Present in the array: " + test);
	}
	
	public static void ArrayBinarySearch(int[] arr, int toCheckValue) {
		
		Arrays.sort(arr);
		
		int res =  Arrays.binarySearch(arr, toCheckValue);
		boolean test = res >= 0 ? true : false;
		
		System.out.println("Element = " + toCheckValue);
		System.out.println("Present in the array: " + test);
	}
	
	public static void ArrayContains(int[] arr, int toCheckValue) {
		
		boolean test;
		test = Arrays.asList(arr).contains(toCheckValue);
		System.out.println("Element = " + toCheckValue);
		System.out.println("Present in the array: " + test);
		
		
	}
	
	public static void ArrayStreamAnymatch(int[] arr, int toCheckValue) {
		
		boolean test = IntStream.of(arr).anyMatch(x -> x ==toCheckValue);
		System.out.println("Element = " + toCheckValue);
		System.out.println("Present in the array: " + test);
		
	}
	
	
}
