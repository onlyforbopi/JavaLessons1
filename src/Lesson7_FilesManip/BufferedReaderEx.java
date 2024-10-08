package Lesson7_FilesManip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;

public class BufferedReaderEx {

	// Two constructors:
	// 	a. BufferedReader(Reader in) - Default buffered
	// 	b. BufferedReader(Reader in, int sz) - Specified int buffer
	// Standard methods:
	// 	a. close()				: Closes the stream
	//	b. mark(int readahread) : Mark the position in the stream
	//  c. markSupported()      : T/F if stream marking is supported
	//  d. int read() 			: Read the buffer
	//  e. int read(char[] cbuf, int off, int len) : Read the buffer
	//  f. String readline()    : Next Line
	//  g. Boolean ready()      : Is the stream ready to read?
	//  h. reset()              : resets the stream
	//  i. skip(long n)         : skip characters
	
	
	
	
	public static void BufferedReaderEx1() throws FileNotFoundException, IOException{
		
		// BufferedReader inherits from the abstract class Reader
		// In order to create a BufferedReader we need to import:
		// import java.io.BufferedReader
		// In order to use a BufferedReader we need to pass it a FileReader object.
		// FileReader -> 
		//	FileReader object -> BufferedReader 
		//							-> BufferedReader Object.
		
		System.out.println("Initiate readers:...");
		String fnameString = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout4.txt";
		FileReader file = new FileReader(fnameString);
		BufferedReader buffer = new BufferedReader(file);
		
		System.out.println(file);
		System.out.println(buffer);
		
		buffer.close();
		file.close();
		
		
		
	}
	
	public static void BufferedReaderEx2() throws FileNotFoundException{
		
		// Using BufferedReader with specified internal sized buffer.
		// Default size: 8192
		
		String fnameString = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout4.txt";
		FileReader file = new FileReader(fnameString);
		BufferedReader buffer = new BufferedReader(file, 6100);
		
		System.out.println(file);
		System.out.println(buffer);
		
		try {
			file.close();
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void BufferedReaderEx3() {
		
		// Alternatively - if we do not want to use throw <Exception>
		// we have to handle the error with a try/catch block
		
		FileReader file = null;
		BufferedReader buffer = null;
		String fnameString = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout4.txt";
		
		try {
			file = new FileReader(fnameString);
			buffer = new BufferedReader(file);
			
			System.out.println(file);
			System.out.println(buffer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
				buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void BufferedReaderEx4Read() {
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		String fnameString = "C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout4.txt";
		
		char[] array = new char[100];
		
		try {
			FileReader file = new FileReader(fnameString);
			BufferedReader input = new BufferedReader(file);
			
			// Read characters into array
			input.read(array);
			System.out.println("Data in file: ");
			System.out.println(array);
			input.close();
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
	}
	
	public static void BufferedReaderEx5Read() {
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		
		// This will look in root/files/file.txt
		String fnameString = "files/file.txt";
		
		// Alternatively:
		//String fnameString2 = "file.txt";
		//String fnameString2 = ""bin/Files/file.txt"";
		//String fnameString2 = ""src/Files/file.txt"";
		// Alternate for "file.txt" :
		//String fnameString2 =  UserInputBufferedReader.class.getClassLoader().getResource("file.txt");

		char[] array = new char[100];
		
		try {
			FileReader file = new FileReader(fnameString);
			BufferedReader input = new BufferedReader(file);
			
			// Read characters into array
			input.read(array);
			System.out.println("Data in file: ");
			System.out.println(array);
			input.close();
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
	}
	
	
	public static void BufferedReaderEx6Read() {
		
		// Other useful methods:
		//  ready() --> Checks if a file is ready to be read
		//  mark()  --> mark the position in reader up to which data has been read
		//  reset() --> returns control to the point in reader where mark was set.
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		
		// This will look in root/files/file.txt
		String fnameString = "files/file.txt";
		
		// Alternatively:
		//String fnameString2 = "file.txt";
		//String fnameString2 = ""bin/Files/file.txt"";
		//String fnameString2 = ""src/Files/file.txt"";
		// Alternate for "file.txt" :
		//String fnameString2 =  UserInputBufferedReader.class.getClassLoader().getResource("file.txt");

		char[] array = new char[100];
		
		try {
			FileReader file = new FileReader(fnameString);
			BufferedReader input = new BufferedReader(file);
			
			// Skip X characters
			input.skip(5);
			
			// Read characters into array
			input.read(array);
			System.out.println("Data in file after skipping 5 characters: ");
			System.out.println(array);
			input.close();
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
	}
	
	
	public static void BufferedReaderEx6ReadLineByLine() throws IOException {
		
		// Other useful methods:
		//  ready() --> Checks if a file is ready to be read
		//  mark()  --> mark the position in reader up to which data has been read
		//  reset() --> returns control to the point in reader where mark was set.
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		
		// This will look in root/files/file.txt
		String fnameString = "files/file2.txt";
		
		// Alternatively:
		//String fnameString2 = "file.txt";
		//String fnameString2 = ""bin/Files/file.txt"";
		//String fnameString2 = ""src/Files/file.txt"";
		// Alternate for "file.txt" :
		//String fnameString2 =  UserInputBufferedReader.class.getClassLoader().getResource("file.txt");
		FileReader file = null;
		BufferedReader objReader = null;
		
		try {
			file = new FileReader(fnameString);
			objReader = new BufferedReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String currentline;
		
		while (( currentline = objReader.readLine()) != null) {
			System.out.println(currentline);
		}
		
		if (objReader != null) {
			objReader.close();
		}
		
		file.close();
		
		
		
//		try {
//			FileReader file = new FileReader(fnameString);
//			BufferedReader input = new BufferedReader(file);
//			
//			// Skip X characters
//			input.skip(5);
//			
//			// Read characters into array
//			input.read(array);
//			System.out.println("Data in file after skipping 5 characters: ");
//			System.out.println(array);
//			input.close();
//			file.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			e.getStackTrace();
//		}
	}
	

	public static void BufferedReaderEx6ReadLineByLineTryBlock()  {
		
		// Other useful methods:
		//  ready() --> Checks if a file is ready to be read
		//  mark()  --> mark the position in reader up to which data has been read
		//  reset() --> returns control to the point in reader where mark was set.
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		
		// This will look in root/files/file.txt
		String fnameString = "files/file2.txt";
		
		// Alternatively:
		//String fnameString2 = "file.txt";
		//String fnameString2 = ""bin/Files/file.txt"";
		//String fnameString2 = ""src/Files/file.txt"";
		// Alternate for "file.txt" :
		//String fnameString2 =  UserInputBufferedReader.class.getClassLoader().getResource("file.txt");
		FileReader file = null;
		BufferedReader objReader = null;
		
		try {
			file = new FileReader(fnameString);
			objReader = new BufferedReader(file);
			
			
			String currentline;
			
			while (( currentline = objReader.readLine()) != null) {
				System.out.println(currentline);
			}
			
			if (objReader != null) {
				objReader.close();
			}
			
			file.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void BufferedReaderEx6ReadLineByLineTryBlockImplicit()  {
		
		// Other useful methods:
		//  ready() --> Checks if a file is ready to be read
		//  mark()  --> mark the position in reader up to which data has been read
		//  reset() --> returns control to the point in reader where mark was set.
		
		// read() by default reads a single character for the internal buffer
		// read(char[] array) reads the characters from the reader and stores in specified array.
		// read(char[] array, int start, int length) - reads the number of characters equal to length from the
		//     reader and stores in the specified array starting from the position start.
		// readLine() reads an entire line - up to new line.
		
		
		// This will look in root/files/file.txt
		String fnameString = "files/file2.txt";
		
		// Alternatively:
		//String fnameString2 = "file.txt";
		//String fnameString2 = ""bin/Files/file.txt"";
		//String fnameString2 = ""src/Files/file.txt"";
		// Alternate for "file.txt" :
		//String fnameString2 =  UserInputBufferedReader.class.getClassLoader().getResource("file.txt");
		FileReader file = null;
		BufferedReader objReader = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fnameString))){ 
		
			String currentline;
			
			while (( currentline = br.readLine()) != null) {
				System.out.println(currentline);
			}
			
			if (br != null) {
				br.close();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void BufferedReaderBufferedWriterEx5() {
		try {
			File file = new File("flush3.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
