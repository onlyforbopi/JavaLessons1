package Lesson7_FilesManip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamEx {
	// Used to read files in sequence
	
	public static void SequenceInputStreamEx1() {
		try {
			FileInputStream input1 = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout.txt");
			FileInputStream input2 = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout2.txt");
			SequenceInputStream inst = new SequenceInputStream(input1, input2);
			int j;
			while ((j=inst.read())!= -1) {
				System.out.println((char)j);
			}
			inst.close();
			input1.close();
			input2.close();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	
	public static void SequenceInputStreamEx2() {
		try {
			FileInputStream fin1 = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout.txt");
			FileInputStream fin2 = new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout2.txt");
			SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
			FileOutputStream fout = new FileOutputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout_combo.txt");
			
			 int i;    
			   while((i=sis.read())!=-1)    
			   {    
			     fout.write(i);        
			   }    
			   sis.close();    
			   fout.close();      
			   fin1.close();      
			   fin2.close();       
			   System.out.println("Success..");  	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void SequenceInputEnumerationEx() {
		try {
			//creating the FileInputStream objects for all the files    
			FileInputStream fin=new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout.txt");    
			FileInputStream fin2=new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout2.txt");    
			FileInputStream fin3=new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout3.txt");    
			FileInputStream fin4=new FileInputStream("C:\\Users\\p.doulgeridis\\OneDrive - Public Power Corporation S.A\\Desktop\\FLASKTESTS\\testout4.txt");    
			//creating Vector object to all the stream    
			Vector v=new Vector();    
			v.add(fin);    
			v.add(fin2);    
			v.add(fin3);    
			v.add(fin4);              
			//creating enumeration object by calling the elements method    
			Enumeration e=v.elements();      
			//passing the enumeration object in the constructor    
			SequenceInputStream bin=new SequenceInputStream(e);    
			int i=0;      
			while((i=bin.read())!=-1){    
			System.out.print((char)i);    
			}     
			bin.close();    
			fin.close();    
			fin2.close();    
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	}
