package Lesson4;

public class DecimalConversions {
	
	static int binaryToDecimal(long binary)
    {
        // variable to store the decimal number
        int decimalNumber = 0, i = 0;
 
        // loop to extract the digits of the
        // binary number
        while (binary > 0) {
 
            // multiplying each digit of binary
            // with increasing powers of 2 towards
            // left
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
 
            // dividing the binary by 10
            // to remove the last digit
            binary /= 10;
        }
 
        // returning the converted decimal number
        return decimalNumber;
    }
	
	static int decimalToOctal(long binary)
    {
 
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int decimalNumber = binaryToDecimal(binary);
 
        // using the toOctalString() to convert
        // Integer to String of Octal Number
        String octalString
            = Integer.toOctalString(decimalNumber);
 
        // converting the String of octal number
        // to an Integer
        int octalNumber = Integer.parseInt(octalString);
 
        // returning the octal number
        return octalNumber;
    }
	
	
	public static void DecimalToOctalRunner() {
		System.out.println("octal number:"+ decimalToOctal(100100));
	}
	
	static void decTohex(int n)
    {
        // Creating an array to store octal number
        int[] hexNum = new int[100];
 
        // counter for hexadecimal number array
        int i = 0;
        while (n != 0) {
 
            // Storing remainder in hexadecimal array
            hexNum[i] = n % 16;
            n = n / 16;
            i++;
        }
 
        // Printing hexadecimal number array
        // in the reverse order
        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9)
                System.out.print((char)(55 + hexNum[j]));
            else
                System.out.print(hexNum[j]);
        }
    }
	
	public static void DecimalToHexadecimal() {
		// Custom input decimal number
        // to be converted into hexadecimal number
        int n = 2545;
 
        // Calling the above Method1 over number 'n'
        // to convert this decimal into hexadecimal number
        decTohex(n);
	}
	
	static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
   
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
   
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
	
	public static void DecimalToBinary() {
		int n = 17;
        System.out.println("Decimal - " + n);
      System.out.print("Binary - ");
        decToBinary(n);
	}
	
}
