package Lesson7_FilesManip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
	public static void BufferedInputStreamEx1() {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ( (i=bin.read()) != -1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
