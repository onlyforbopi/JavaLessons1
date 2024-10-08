package Lesson3;



public class LoopsAdvanged {

	
	public static void ContinueEx1() {
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
	}
	
	public static void ContinueEx2() {
		String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
	
	public static void ContinueEx3() {
		int i = 0;
		while (i < 10) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	
	public static void ContinueEx4() {
		for (int i = 0; i<10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void BreakEx1() {
		int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
	}

	public static void BreakEx2() {
		int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        int searchfor = 12;

	        int i;
	        int j = 0;
	        boolean foundIt = false;

	    search:
	        for (i = 0; i < arrayOfInts.length; i++) {
	            for (j = 0; j < arrayOfInts[i].length;
	                 j++) {
	                if (arrayOfInts[i][j] == searchfor) {
	                    foundIt = true;
	                    break search;
	                }
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at " + i + ", " + j);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	    }

	
	public static void BreakEx3() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			if (i==4) {
				break;
			}
		}
	}

	public static void BreakEx4() {
		for (int i =0 ; i < 10; i++) {
			if (i==4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
