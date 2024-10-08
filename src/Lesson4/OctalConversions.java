package Lesson4;

public class OctalConversions {
	
	public static void OctalToDecimal() {
		// octal value
        String onum = "157";
 
        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);
 
        System.out.println(
            "Decimal equivalent of Octal value 157 is: "
            + num);
	}

}
