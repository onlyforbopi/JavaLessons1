package Lesson2;

public class Lesson2MathAdvanced {
	public static void AddComplex() {
		
	}
	
	public static void CheckEvenOdd() {
		// Declaring and initializing integer variable
        int num = 10;
 
        // Checking if number is even or odd number
        // via remainder
        if (num % 2 == 0) {
 
            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        }
 
        else {
 
            // If remainder is not zero then this number is
            // odd
            System.out.println("Entered Number is Odd");
        }
    }
	
    // Gcd of u and v using recursive method
    static int GCD(int u, int v)
    {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }
 
    // LCM of two numbers
    static int LCM(int u, int v)
    {
        return (u / GCD(u, v)) * v;
    }
	
	public static void LCM() {
		int u = 25, v = 15;
        System.out.println("LCM of " + u + " and " + v
                           + " is " + LCM(u, v));
	}
	
	public static void GCD() {
		int u = 25, v = 15;
		System.out.println("GCD: " + GCD(u, v));
	}
	
	static void prime_N(int N)
    {
        // Declaring the variables
        int x, y, flg;
 
        // Printing display message
        System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");
 
        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
	
	public static void Primes() {
		int N = 45;
        prime_N(N);
	}
	
	static int factorial(int n)
	 {
	  if (n == 0)
	  return 1;
	   
	  return n*factorial(n-1);
	 }
	
	public static void Factorial() {
		int num = 5;
		  System.out.println("Factorial of "+ num + " is " + factorial(5));
	}
	
	static int Fib_Even_Sum(int N)
	    {
	        if (N <= 0)
	            return 0;
	 
	        int fib[] = new int[2 * N + 1];
	        fib[0] = 0;
	        fib[1] = 1;
	 
	        // Initializing the sum
	        int s = 0;
	 
	        // Adding remaining numbers
	        for (int j = 2; j <= 2 * N; j++) {
	            fib[j] = fib[j - 1] + fib[j - 2];
	 
	            // Only considering even indexes
	            if (j % 2 == 0)
	                s += fib[j];
	        }
	 
	        return s;
	    }
	
	public static void FiboEvenSum() {
		int N = 11;
		 
        // Prints the sum of even-indexed numbers
        System.out.println(
            "Even sum of fibonacci series till number " + N
            + " is: " + +Fib_Even_Sum(N));
	}
	
	public static void InterestSimple() {
		// We can change values here for
        // different inputs
        float P = 1, R = 1, T = 1;
  
        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
	}
	
	public static void InterestCompound() {
		double principal = 10000, rate = 10.25, time = 5;
		  
        /* Calculate compound interest */
        double CI = principal *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
	}
}
