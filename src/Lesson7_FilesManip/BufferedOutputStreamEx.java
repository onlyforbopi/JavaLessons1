package Lesson7_FilesManip;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {
	
	// Used for performing a buffering, it internally uses buffer to store data, more efficient.
	// Needs flushing because it connects to FileOutputStream
	
	public static void BufferedOutputStreamEx1() {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Welcome to the world";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Success");	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
