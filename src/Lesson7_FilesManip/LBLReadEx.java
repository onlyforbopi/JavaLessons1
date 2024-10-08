package Lesson7_FilesManip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LBLReadEx {
	public static void LBLBufferedReaderEx() {
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void LBLScannerEx() {
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt"));

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void LBLFilesEx() {
		try {
			List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt"));

			for (String line : allLines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void LBLRandomAccessFilEx() {
		try {
			RandomAccessFile file = new RandomAccessFile("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt", "r");
			String str;

			while ((str = file.readLine()) != null) {
				System.out.println(str);
			}

			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
