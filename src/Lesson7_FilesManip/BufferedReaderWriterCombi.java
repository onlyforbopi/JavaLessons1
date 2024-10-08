package Lesson7_FilesManip;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;

import Lesson3.LoopsBasicWhile;

public class BufferedReaderWriterCombi {

	public static void ReadWriteEx1() {
		
		// Module call: Please document how to do this!!!
		//LoopsBasicWhile.WhileEx1();
		
		try {
			File file = new File("flush3.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void ReadWriteEx2() {
		
		String[] list = { "one", "two", "three", "four" };
		
		try {
			File file = new File("flush3.txt");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for (String s : list) {
				bufferedWriter.write(s + "\n");
			}
			
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void ReadWriteEx3() {
		try {
			
			File file = new File("fileoutput1.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			FileWriter fileReader = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
			
			String lineString;
			while(!(lineString = bufferedReader.readLine()).equals("exit")) {
				bufferedWriter.write(lineString);
			}
			
			bufferedReader.close();
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ReadWriteEx4() {
		
		// Reads two digit chars as two bytes
		
		try {
			while (true) {
				int x = System.in.read();
				System.out.println(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ReadWriteEx5() {
		
		// Reads two digit characters as one numeric literal
		
		try {
			InputStreamReader reader = new InputStreamReader(System.in); 
			while (true) {
				int x = reader.read();
				System.out.println(x);
			}
			
			// Check that it prints the actual 1049
			//char x = 1049;
			//System.out.println(x);
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		}	
	
	
	public static void ReadWriteEx6() throws IOException {
		
		// BufferedReader/Writer are there to optimize performance
		// BufferedReader + InputStreamReader(System.in) = Input from keyboard
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		System.out.println("The user entered the following text");
		System.out.println(s);
		reader.close();
		
	}
	
	public static void ReadWriteEx7() throws IOException {
		
		
		// BufferedReader/Writer are there to optimize performance
		// BufferedReader + InputStreamReader(url.openStream()): Read directly from URL
		URL oracle = new URL("https:/www.oracle.com/index.html");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		in.close();
	}
	
	public static void ReadWriteEx8() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("flush3.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		String str;
		
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		reader.close();
		
	}
	
	// Replacing System.out (Override lesson)
	// System class has two static fields (System.in/System.out)
	// 		-- They are both stream objects
	//			-- System.in  = InputStream
	//			-- System.out = PrintStream (Both are orinary static variables of the System class)
	//			* Both are marked with the final modifier.
	public static void OverrideStdout() throws IOException{
		
		// We need a new PrintStream object to repace the old one.
		// The new PrintStream object needs to point at the file.
		// We need to assign a new value to the System.out, we cant use assignment because it is 'final'
		// System.out provides a method 'setOut' to do that. (Getter/Setter)
		PrintStream filPrintStream = new PrintStream("flush4.txt");
		
		// Save console output to a separate variable so that we can switch later.
		PrintStream console = System.out;
		
		// Assign the new value to system out
		System.setOut(filPrintStream);
		System.out.println("This line will go into the file");
		
		// Restore console output
		System.setOut(console);
		System.out.println("This will be output to the console!");
		
		
		
	}
	
	
	
	// Example with usage of executor/driver function to do all the work.
	// Example 1: Using StringReader/StringWriter
	// Note: Object parameters
	// Note: Usage of StringReader/StringWriter
	// StringReader/StringWriter read and write characters from a String type
	// whereas ByteArrayInputStream/ByteArrayOutputStream read from a byte Array.
	
	static void executor(Reader reader, Writer writer) throws Exception{
		
		// Driver function that 
		BufferedReader br = new BufferedReader(reader);
		String line;
		
		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder(line);
			String newLineString = sb.reverse().toString();
			writer.write(newLineString);
			
		}
	}
	
	public static void DriverExample() throws Exception{
		
		String teString = "Hi \n My name is Richarrd\n I m a coder";
		StringReader reader = new StringReader(teString);
		StringWriter writer = new StringWriter();
		
		
		executor(reader, writer);
		
		String resultString = writer.toString();
		System.out.println("Result: " + resultString);
		
		
	}
	
	
	
	// Same examples but using Input/OutputStream and bytearrays.
	
	static void executor_byte(InputStream inputStream, OutputStream outputStream) throws Exception{
		
		BufferedInputStream bis = new BufferedInputStream(inputStream);
		while (bis.available() > 0) {
			int data = bis.read();
			outputStream.write(data);
		}
		 
	}
	
	public static void DriverExampleByte() throws Exception{
		
		
		//Replaced String w/ ByteArray
		//Replaced Reader w/ InputStream
		//Replaced Writer w/ OutputStream
		
		String teString = "Hi new text \n More text \n More text";
		InputStream inputStream = new ByteArrayInputStream(teString.getBytes());
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		executor_byte(inputStream, outputStream);
		
		String resultString = new String(outputStream.toByteArray());
		System.out.println("Result:" + resultString);
	}
	
	public static void ConvertStringByteArray() throws Exception{
		
		String teString = "Hi!\n My name is Richard \n I m a photographer\n";
		byte[] array = teString.getBytes();
		
		String resultString = new String(array);
		System.out.println("Result:" + resultString);
		
		String nameString = "panos";
		int age = 25;
		System.out.format("My name is %s. My age is %d", nameString, age);
	}
	
}
	
	

