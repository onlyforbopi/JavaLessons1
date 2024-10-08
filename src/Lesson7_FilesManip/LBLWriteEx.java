package Lesson7_FilesManip;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LBLWriteEx {

	public static void LBLWriteExamples() {
		
		String dataString = "I will write this String to File in Java";
		int noOfLines = 10000;
		
		writeUsingOutputStream(dataString);
		// Uses OutputStreamInternally
		writeUsingFiles(dataString);
		// When we have great number of write operations - to reduce IO operations.
		writeUsingBufferedWriter(dataString, noOfLines);
		writeUsingFileWriter(dataString);
		
		
	}
	
	private static void writeUsingOutputStream(String data) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt"));
			os.write(data.getBytes(), 0, data.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void writeUsingFiles(String data) {
		try {
			Files.write(Paths.get("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	/**
     * Use FileWriter when number of write operations are less
     * @param data
     */
    private static void writeUsingFileWriter(String data) {
        File file = new File("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout10.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	
}
