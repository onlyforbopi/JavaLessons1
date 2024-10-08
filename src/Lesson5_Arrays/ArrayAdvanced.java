package Lesson5_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayAdvanced {
	
	 static void check(int[] arr, int toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
    }
	
	public static void Array_SearchElement() {
		// Get the array
        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
 
        // Get the value to be checked
        int toCheckValue = 7;
 
        // Print the array
        System.out.println("Array: "
                           + Arrays.toString(arr));
 
        // Check if this value is
        // present in the array or not
        check(arr, toCheckValue);
	}
	
	// Method to find maximum in arr[]
    static int largest(int arr[])
    {
        int i;
         
        // Initialize maximum element
        int max = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
	
	public static void Array_FindLargestElement() {
		int arr[] = {10, 324, 45, 90, 9808};
		
		System.out.println("Largest in given array is " + largest(arr));
    
	}
	
	public static void Array_Sort() {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
     // Custom input array
        // It contains 8 elements as follows
        int[] arr2 = { 13, 7, 6, 45, 21, 9, 2, 100 };
 
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr2, 1, 5);
 
        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr2));
	}
	
	public static void Array_SortDescending() {
		// Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };
 
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
 
        // Printing the elements
        System.out.println(Arrays.toString(array));
	}
	
	// Method 1
    // To print the array
    public static void printArray(int[] array)
    {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
 
    // Method 2
    // To sort an array
    public static void sortArray(int[] array)
    {
        int temporary = 0;
 
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
 
        // Displaying elements of array after sorting
        System.out.println(
            "Elements of array sorted in ascending order: ");
        printArray(array);
    }
 
	
	public static void Array_SortAscending() {
		// Initializing custom array elements
        // The array contains 6 elements.
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
        int length;
        // Initialize length
        length = array.length;
 
        // Displaying elements of original array
        System.out.print("Elements of original array: ");
 
        // Call printArray method
        printArray(array);
 
        // Call sortArray method
        sortArray(array);
	}
	
	// Function to remove duplicate elements This function
	// returns new size of modified array.
	static int removeDuplicates(int arr[], int n)
	{
	    // Return, if array is empty or contains a single
	    // element
	    if (n == 0 || n == 1)
	        return n;
	 
	    int temp[] = new int[n];
	 
	    // Start traversing elements
	    int j = 0;
	    // If current element is not equal to next element
	    // then store that current element
	    for (int i = 0; i < n - 1; i++)
	        if (arr[i] != arr[i + 1])
	            temp[j++] = arr[i];
	 
	    // Store the last element as whether it is unique or
	    // repeated, it hasn't stored previously
	    temp[j++] = arr[n - 1];
	 
	    // Modify original array
	    for (int i = 0; i < j; i++)
	        arr[i] = temp[i];
	 
	    return j;
	}
	
	public static void Array_RemoveDuplicates() {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
	    int n = arr.length / arr[0];
	 
	    // removeDuplicates() returns new size of array.
	    n = removeDuplicates(arr, n);
	 
	    // Print updated array
	    for (int i = 0; i < n; i++)
	        System.out.println(arr[i]);
	 
	}
	
	public static void Array_MergeTwo() {
		// first array
        int[] a = { 10, 20, 30, 40 };
  
        // second array
        int[] b = { 50, 60, 70, 80 };
  
        // determines length of firstArray
        int a1 = a.length;
        
        // determines length of secondArray
        int b1 = b.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] c = new int[c1];
  
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));
	}
	
	
	
	
}
