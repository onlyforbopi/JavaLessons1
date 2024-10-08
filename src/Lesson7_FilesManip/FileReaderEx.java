package Lesson7_FilesManip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.jar.Attributes.Name;

public class FileReaderEx {
	public static void FileReaderEx1() {
		// Creates an array of character
	    char[] array = new char[100];

	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader("input.txt");

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file: ");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	}
	
	public static void FileReaderEx2() throws FileNotFoundException{
		String name = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt";
		FileReader input = new FileReader(name);
		File myfile = new File("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt");
		FileReader input2 = new FileReader(myfile);
		
		try {
			input.close();
			input2.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void FileReaderEx3() {
		String file = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt";
		try {
			FileReader input = new FileReader(file, Charset.forName("UTF8"));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void FileReaderEx4() {
		try {
		      // Creates a FileReader with default encoding
		      FileReader input1 = new FileReader("input.txt");

		      // Creates a FileReader specifying the encoding
		      FileReader input2 = new FileReader("input.txt", Charset.forName("UTF8"));

		      // Returns the character encoding of the file reader
		      System.out.println("Character encoding of input1: " + input1.getEncoding());
		      System.out.println("Character encoding of input2: " + input2.getEncoding());

		      // Closes the reader
		      input1.close();
		      input2.close();
		    }

		    catch(Exception e) {
		      e.getStackTrace();
		    }
	}

	public static void FileReaderEx5() throws IOException {
		//This should be used only for small text files.

		String fileName = "demo.txt";

		try(FileReader fileReader = new FileReader(fileName)) {
		  
		  char[] a = new char[2048];
		  fileReader.read(a);   

		  //verify content
		  //System.out.println(new String(a));
		}
	}

	public static void FileReaderEx6() throws IOException {
		// Reading a file a character at a time
		String fileName = "demo.txt";
		 
	    FileReader fileReader = new FileReader(fileName);
	 
	    try {
	         int i;
	           while((i = fileReader.read()) != -1) {
	            System.out.print((char)i);
	           }
	    } finally {
	      fileReader.close();
	    }
	  }
	
	public static void FileReaderEx7() throws IOException {
		// FileReader does not directly support reading a file line by line. For this, 
		//we need to wrap the FileReader inside a BufferedReader instance which provides the method readLine().
		String fileName = "demo.txt";
		 
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	 
	    try {
	        String line;
	        while ((line = br.readLine()) != null) {
	           System.out.println(line);
	        }
	    } finally {
	        br.close();
	    }
	}
	
}

