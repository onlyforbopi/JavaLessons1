package Lesson7_FilesManip;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void FileInputStreamEx1() {
		// Read single character
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout.txt");
			int i = fin.read();
			System.out.print((char)i);
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	public static void FileInputStreamEx2() {
		// Read all characters
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout2.txt");
			int i = 0;
			while ((i=fin.read())!= -1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	
}
