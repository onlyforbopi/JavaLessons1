package Lesson1Exercises;

public class SwapTwoEx {

	public static void SwapEx() {
		swapValuesUsingThirdVariable(1, 2);
	}
	
	static void swapValuesUsingThirdVariable(int m, int n)
    {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }
	
}
