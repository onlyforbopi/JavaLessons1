package Lesson7_FilesManip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.WriteAbortedException;

public class BufferedWriterEx {
	
	// BufferedWriter(Writer out) : Create a buffered output stream that uses the default buffer size
	// BufferedWriter(Writer out, int sz) : Create a buffered output stream of the specified size.
	
	// Supported methods:
	// close()
	// flush()
	// newLine()
	// write(char[] cbuf, int off, int len)
	// write (int c)
	// write (String str)
	// write (String s, int off, int len)
	// append (char c) 
	// append (CharSequence csq, int start, int end

	

	
	
	
	public static void BufferedWriterEx1() {
		
		String data = "Data in output file:";
		
		try {
			
			FileWriter file = new FileWriter("flush.txt");
			BufferedWriter output = new BufferedWriter(file);
			
			output.write(data);
			
			output.close();
			file.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
	}
	
	public static void BufferedWriterEx1Reader() {
		// This will look in root/files/file.txt
		String fnameString = "flush2.txt";
		
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
	
	
	public static void BufferedWriterEx2Flush() {
		
		// .flush() method we can ensure that all data has been pushed to output
	    // It flashes the internal buffer to the destination file.
	
		String data = "Demoing the flush method xxx:";
		
		try {
			
			FileWriter file = new FileWriter("flush2.txt");
			BufferedWriter output = new BufferedWriter(file);
			
			output.write(data);
			output.flush();
			
			output.close();
			file.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
	}
	
	public static void BufferedWriterReaderCombinationEx1() {
		
		try {
			FileWriter fw = new FileWriter("flush3.txt");
			BufferedWriter WriteFileBuffer = new BufferedWriter(fw);
			
			WriteFileBuffer.write("First Line");
			WriteFileBuffer.newLine();
			WriteFileBuffer.write("Second Line");
			WriteFileBuffer.newLine();
			WriteFileBuffer.write("Third Line");
			WriteFileBuffer.newLine();
			
			WriteFileBuffer.close();
			fw.close();
			
			
			System.out.println("Here");
			//////////////////////////////////////////////
			FileReader fr = new FileReader("flush3.txt");
			BufferedReader readFileBufferedReader = new BufferedReader(fr);
			
			String currentline;
			
			while (( currentline = readFileBufferedReader.readLine()) != null) {
				System.out.println(currentline);
			}
			
			if (readFileBufferedReader != null) {
				readFileBufferedReader.close();
			}
			
			readFileBufferedReader.close();
			fr.close();
			
			//////////////////////////////////////////////
			FileReader fr1 = new FileReader("flush3.txt");
			BufferedReader readFileBuffered = new BufferedReader(fr1);
			
			System.out.println(readFileBuffered.readLine());
			System.out.println(readFileBuffered.readLine());
			System.out.println(readFileBuffered.readLine());
			
			fr1.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public static void BufferedWriterEx5(){
		
		// Example with context manager in try block (try-with-resources)
		// close method is called automatically when context managed.
		//		-- Its called manually because it implements the AutoCloseable interface.
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file5.txt"))){
			String mString = "This was written by context managed try";
			bufferedWriter.write(mString);
			bufferedWriter.flush();
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void BufferedWriterEx6() {
		
		// Example that shows alternate methods:
		//  	write(char[] array)
		//      write(String s, int off, int len)
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file6.txt"))){
			String mString = "This was written by context managed try";
			bufferedWriter.write(mString, 0, 11);
			bufferedWriter.flush();
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void BufferedWriterEx7() {
		
		// Example using: .newLine();
		// Explain reason for .newLine() (Not the same character in all systems)
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file7.txt"))){
			String mString = "This was written by context managed try";
			bufferedWriter.write(mString, 0, 11);
			bufferedWriter.newLine();
			bufferedWriter.write(mString, 15, 33);
			bufferedWriter.newLine();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	public static void BufferedWriterEx8() {
		
		// Example using: .append()
		// Explain reason why append is used (No line gap)
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file8.txt"))){
			String mString = "This was written by context managed try";
			bufferedWriter.append(mString, 0, 11);
			bufferedWriter.newLine();
			bufferedWriter.append(mString, 15, 33);
			bufferedWriter.newLine();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	
}
