package Lesson7_FilesManip;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
	
	public static void FileOutputStreamEx1() {
		
		// Writes specified character using byte numeral
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout.txt");

			// Writes specified byte to output stream 
			// A = 65
			fout.write(65);

			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void FileOutputStreamEx2String() {
		
		// Converts string to byte array to print it in file
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout2.txt");
			String s = "Welcome friends";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
