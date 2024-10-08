package Lesson2;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson2StringsAdv {
	
	public static char getCharFromString(String str, int index)
	{
	        return str.charAt(index);
	}
	
	public static void GetSpecificCharFromString() {
		// Get the String
        String str = "GeeksForGeeks";
  
        // Get the index
        int index = 5;
  
        // Get the specific character
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
	}
	
	public static void ReplaceCharAtIndex() {

        // Get the String
        String str = "Geeks Gor Geeks";
 
        // Get the index
        int index = 6;
 
        // Get the character
        char ch = 'F';
 
        // Print the original string
        System.out.println("Original String = " + str);
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
 
        // Print the modified string
        System.out.println("Modified String = " + str);
	}
	
	public static void ReverseString() {
		String str= "Geeks", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    
	}
	
	
	public static String ReverseString(String str)
    {
        char[] reverseString = new char[str.length()];
        // Declare a stack of type Character
        Stack<Character> stack = new Stack<Character>();
  
        // Traverse the String and push the character one by
        // one into the Stack
        for (int i = 0; i < str.length(); i++) {
            // push the character into the Stack
            stack.push(str.charAt(i));
        }
  
        // Now Pop the Characters from the stack until it
        // becomes empty
  
        int i = 0;
        while (!stack.isEmpty()) { // popping element until
                                   // stack become empty
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        // return string object
        return new String(reverseString);
    }
	
	
	public static void ReverseUsingStack() {
		String str1 = "GeeksForGeeks";
        
        // call the function
        System.out.println(str1 + " <- Reverse -> "
                           + ReverseString(str1));
        
        String str2 = "Hello World";
        
        // call the function
        System.out.println(str2 + " <- Reverse -> "
                           + ReverseString(str2));
	}
	
	public static void SortString() {
		// Custom string input
        String str = "geeksforgeeks";
       
        // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
 
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
	}
	
	
	public static String swapPair(String str)
    {
  
        // Checking if string is null
        // or empty then return str
        if (str == null || str.isEmpty())
            return str;
  
        // Converting the given string
        // into a character array
        char[] ch = str.toCharArray();
  
        // Traverse the character array
        for (int i = 0; i < ch.length - 1; i += 2) {
  
            // Swapping the characters
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
  
        // Converting the result into a
        // string and return
        return new String(ch);
    }
	
	public static void CharacterSwap() {
		// Given String str
        String str = "GeeksForGeeks";
  
        // Print the result
        System.out.println(swapPair(str));
	}
	

	public static void PrintFirstLetterEachWord() {
		String s1 = "Geeks for Geeks";
        String s2 = "A Computer Science Portal for Geeks";
          
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
          
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
          
        System.out.println("First letter of each word from string \"" + s1 + "\" : ");
        while (m1.find())
            System.out.print(m1.group());
          
        System.out.println();
          
        System.out.println("First letter of each word from string \"" + s2 + "\" : ");
          
        while (m2.find()) 
            System.out.print(m2.group());
	}
	
	public static void DetermineUnicodePoint() {
	       // Considering random string for input
        String str = "GEEKS";
 
        // Unicode at index 0
        // Input is a small string
        int result_1 = str.codePointAt(0);
        int result_2 = str.codePointAt(1);
        int result_3 = str.codePointAt(2);
        int result_4 = str.codePointAt(3);
        int result_5 = str.codePointAt(4);
 
        // Printing the input string
        System.out.println("Original String : " + str);
 
        // Prints unicode character at index 0 to 4
        // in above input string
        // to show usage of codePointAt()
        System.out.println("unicode point at 0 = "
                           + result_1);
        System.out.println("unicode point at 1 = "
                           + result_2);
        System.out.println("unicode point at 2 = "
                           + result_3);
        System.out.println("unicode point at 3 = "
                           + result_4);
        System.out.println("unicode point at 4 = "
                           + result_5);
    
	}
	
	
	// to Remove leading zeros in a string
    public static String removeZero(String str)
    {
 
        // Count leading zeros
    	StringBuffer sb = new StringBuffer(str);
        // Initially setting loop counter to 0
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        // Converting string into StringBuffer object
        // as strings are immutable
        
 
        // The StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace('0', i, "");
 
        // Returning string after removing zeros
        return sb.toString();
    }
    
    
	
	public static void RemoveLeadingZeroes() {
		// Sample string input
        String str = "00000123569";
 
        // Calling method 1 to count leading zeroes
        // in above string
        str = removeZero(str);
 
        // Printing leading zeros inside string
        System.out.println(str);
	}
	
	public static int stringCompare(String str1, String str2)
    {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        // Edge case for strings like
        // String 1="Geeks" and String 2="Geeksforgeeks"
        if (l1 != l2) {
            return l1 - l2;
        }
  
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
	
	public static void CompareStrings() {
		String string1 = new String("Geeksforgeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");
  
        // Comparing for String 1 < String 2
        System.out.println("Comparing " + string1 + " and " + string2
                           + " : " + stringCompare(string1, string2));
  
        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4
                           + " : " + stringCompare(string3, string4));
  
        // Comparing for String 1 > String 4
        System.out.println("Comparing " + string1 + " and " + string4
                           + " : " + stringCompare(string1, string4));
	}
	
	
	public static void printWords(String s)
	 {
	 
	  // Splits Str into all possible tokens
	  for (String word : s.split(" "))
	 
	   // if length is even
	   if (word.length() % 2 == 0)
	 
	    // Print the word
	    System.out.println(word);
	 }
	
	public static void PrintEvenLengthWords() {
		String s = "i am Geeks for Geeks and a Geek";
		  printWords(s);
	}
	
	public static String insertString(
	        String originalString,
	        String stringToBeInserted,
	        int index)
	    {
	  
	        // Create a new string
	        String newString = new String();
	  
	        for (int i = 0; i < originalString.length(); i++) {
	  
	            // Insert the original string character
	            // into the new string
	            newString += originalString.charAt(i);
	  
	            if (i == index) {
	  
	                // Insert the string to be inserted
	                // into the new string
	                newString += stringToBeInserted;
	            }
	        }
	  
	        // return the modified String
	        return newString;
	    }
	  
	
	public static void InsertString() {
		// Get the Strings
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
  
        System.out.println("Original String: "
                           + originalString);
        System.out.println("String to be inserted: "
                           + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                           + index);
  
        // Insert the String
        System.out.println("Modified String: "
                           + insertString(originalString,
                                          stringToBeInserted,
                                          index));
	}
	
	
	public static ArrayList<String>splitSubstrings(String s)
    {
  
        // variables to traverse through the
        // string
        int i, j;
  
        // to store the length of the
        // string
        int stringLength = s.length();
  
        // List object to store the list of
        // all substrings of the string s
        ArrayList<String> subStringList
            = new ArrayList<String>();
  
        // first for loop
        for (i = 0; i < stringLength; i++) {
  
            for (j = i + 1; j <= stringLength; j++) {
  
                subStringList.add(s.substring(i, j));
            }
  
        } // end of first for loop
  
        // returning the list (object
        // of ArrayList) of substrings
        // of string s
        return subStringList;
    }
	
	public static void StringSubstring() {
		// here "The Cat" is our input string
        String stringInput = new String("The Cat");
  
        ArrayList<String> subStringList
            = splitSubstrings(
                stringInput);
  
        System.out.println(
            "\nSubstring list printed as an ArrayList : ");
        System.out.println(subStringList);
  
        System.out.println(
            "\n\nAll substrings printed 1 per line : ");
        int count = 1;
  
        // each substring would be printed
        // within double quotes
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it
                               + "\"");
            count++;
        }
	}
	
}
