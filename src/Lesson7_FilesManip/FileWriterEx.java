package Lesson7_FilesManip;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void FileWriterEx1() {
		// Character decimal
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt");
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.write(65);
			fileWriter.write(66);
			fileWriter.write(67);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void FileWriterEx2() {
		// Using try with context manager
		// Character decimal
		try(FileWriter fileWriter = new FileWriter("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt")) {
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.write(65);
			fileWriter.write(66);
			fileWriter.write(67);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void FileWriterEx3() {
		// Strings
		String data = "This is FileWriter Example.";
		try(FileWriter fileWriter = new FileWriter("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt")) {
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.write(data, 8, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void FileWriterEx4() {
		// Character array
		char[] data = "This is FileWriter Example.".toCharArray();
		try(FileWriter fileWriter = new FileWriter("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt")) {
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.write(data, 8, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}

