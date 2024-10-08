package Lesson1Exercises;


class AddComplexNumbers {
	 
    // variables to hold real and imaginary part of complex
    // number
    int real, image;
 
    // Constructor which will be used while creating complex
    // number
    public AddComplexNumbers(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
 
    // function to print real number
    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }
 
    // function for addition
    public static AddComplexNumbers add(AddComplexNumbers n1,
    		AddComplexNumbers n2)
    {
 
        // creating blank complex number
        // to store result
    	AddComplexNumbers res = new AddComplexNumbers(0, 0);
 
        // adding real parts of both complex numbers
        res.real = n1.real + n2.real;
 
        // adding imaginary parts
        res.image = n1.image + n2.image;
 
        // returning result
        return res;
    }
    
    
	public static void main(String arg[])
    {
 
        // creating two complex numbers
		AddComplexNumbers c1 = new AddComplexNumbers(4, 5);
		AddComplexNumbers c2 = new AddComplexNumbers(10, 5);
 
        // printing complex numbers
          System.out.print("first Complex number: ");
        c1.showC();
         
        System.out.print("\nSecond Complex number: ");
        c2.showC();
 
        // calling add() to perform addition
        AddComplexNumbers res = add(c1, c2);
 
        // displaying addition
        System.out.println("\nAddition is :");
        res.showC();
    }
}


