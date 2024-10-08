package Lesson3;

//Importing required classes
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.net.URL;

public class UserInputBufferedReader {

	public static void main(String[] args) throws IOException {
		
		// Base path
		File testfile = new File("");
		String currentPath = testfile.getAbsolutePath();
		System.out.println("Current path: " + currentPath);
		
		//URL url = UserInputBufferedReader.class.getClassLoader().getResource("file.txt");
		FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println("File read" + fr.toString());
		
		char c[] = new char[20];
		
		   // Illustrating markSupported() method
        if (br.markSupported()) {
  
            // Print statement
            System.out.println(
                "mark() method is supported");
  
            // Illustrating mark method
            br.mark(100);
            
            
            
        }
        
        // File Contents is as follows:
        // This is first line
        // this is second line
  
        // Skipping 8 characters
        br.skip(8);
  
        // Illustrating ready() method
        if (br.ready()) {
  
            // Illustrating readLine() method
            System.out.println(br.readLine());
  
            // Illustrating read(char c[],int off,int len)
            br.read(c);
  
            for (int i = 0; i < 20; i++) {
                System.out.print(c[i]);
            }
  
            System.out.println();
  
            // Illustrating reset() method
            br.reset();
            for (int i = 0; i < 8; i++) {
  
                // Illustrating read() method
                System.out.print((char)br.read());
            }
            
            br.close();
        }
        
      /////////////////////////////////////////  
      //URL url = UserInputBufferedReader.class.getClassLoader().getResource("file.txt");
        //TODO: COPY TO FILE FOLDER FOR RELATIVE PATHS
      		//FileReader fr1 = new FileReader("bin/Files/file.txt");
        	//FileReader fr1 = new FileReader("src/Files/file.txt");
      		FileReader fr1 = new FileReader("files/file.txt");
      		BufferedReader br1 = new BufferedReader(fr1);
      		System.out.println("File read" + fr1.toString());
      		
      		char c1[] = new char[20];
      		
      		   // Illustrating markSupported() method
              if (br1.markSupported()) {
        
                  // Print statement
                  System.out.println(
                      "mark() method is supported");
        
                  // Illustrating mark method
                  br1.mark(100);
                  
                  
                  
              }
              
              // File Contents is as follows:
              // This is first line
              // this is second line
        
              // Skipping 8 characters
              br1.skip(8);
        
              // Illustrating ready() method
              if (br1.ready()) {
        
                  // Illustrating readLine() method
                  System.out.println(br1.readLine());
        
                  // Illustrating read(char c[],int off,int len)
                  br1.read(c1);
        
                  for (int i = 0; i < 20; i++) {
                      System.out.print(c1[i]);
                  }
        
                  System.out.println();
        
                  // Illustrating reset() method
                  br1.reset();
                  for (int i = 0; i < 8; i++) {
        
                      // Illustrating read() method
                      System.out.print((char)br1.read());
                  }
              }
        
        br1.close();
	}

}
