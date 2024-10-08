package Lesson8_DirectoryManip;

import java.io.File;

public class directoryRunner {

	
	private static void getTotalSpaceOfDisk () {
		File directory_inFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\torename.txt");
		System.out.println(directory_inFile.getTotalSpace());
		System.out.println(directory_inFile.getFreeSpace());
	}
	
	private static void getFreeSpaceOfDisk () {
		File directory_inFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\torename.txt");
		System.out.println(directory_inFile.getFreeSpace());
			
	}
	
	public static void main(String[] args) {
		getTotalSpaceOfDisk();
		getFreeSpaceOfDisk();
	}

}
