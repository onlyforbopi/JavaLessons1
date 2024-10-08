package Lesson7_FilesManip;

import java.io.IOException;

public class Lesson7FilesRunner {

	public static void main(String[] args) throws IOException {

		FileOutputStreamEx.FileOutputStreamEx1();
		FileOutputStreamEx.FileOutputStreamEx2String();
		
		FileInputStreamEx.FileInputStreamEx1();
		FileInputStreamEx.FileInputStreamEx2();
		
		BufferedOutputStreamEx.BufferedOutputStreamEx1();
		BufferedInputStreamEx.BufferedInputStreamEx1();
		
		SequenceInputStreamEx.SequenceInputStreamEx1();
		SequenceInputStreamEx.SequenceInputStreamEx2();
		SequenceInputStreamEx.SequenceInputEnumerationEx();
		
		LBLReadEx.LBLBufferedReaderEx();
		LBLReadEx.LBLScannerEx();
		LBLReadEx.LBLFilesEx();
		LBLReadEx.LBLRandomAccessFilEx();
		
		LBLWriteEx.LBLWriteExamples();
		
		FileWriterEx.FileWriterEx1();
		FileWriterEx.FileWriterEx2();
		FileWriterEx.FileWriterEx3();
		FileWriterEx.FileWriterEx4();
		
		FileReaderEx.FileReaderEx1();
		FileReaderEx.FileReaderEx2();
		FileReaderEx.FileReaderEx3();
		FileReaderEx.FileReaderEx4();
		FileReaderEx.FileReaderEx5();
		FileReaderEx.FileReaderEx6();
		FileReaderEx.FileReaderEx7();
	}

}
