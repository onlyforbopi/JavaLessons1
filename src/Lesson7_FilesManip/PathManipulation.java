package Lesson7_FilesManip;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathManipulation {

	
	static void pathmethods() {
		Path p1 = Paths.get("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1");
		
		// Various path methods 
		// toString
		System.out.format("toString: %s%n", p1.toString());
		// getFilename
		System.out.format("getFilename: %s%n",p1.getFileName());
		// getName(0)
		System.out.format("getName(0): %s%n", p1.getName(0));
		System.out.format("getName(0): %s%n", p1.getName(1));
		// getNameCount
		System.out.format("getNameCount: %s%n", p1.getNameCount());
		// subpath(0,2)
		System.out.format("subpath(0,2): %s%n", p1.subpath(0,2));
		// getParent
		System.out.format("getParent(): %s%n", p1.getParent());
		// getRoot
		System.out.format("getRoot(): %s%n", p1.getRoot());
		// getFileSystem
		System.out.format("getFileSystem(): %s%n", p1.getFileSystem());
		// isAbsolute
		System.out.format("isAbsolute(): %s%n", p1.isAbsolute());
		// toAbsolutePath
		System.out.format("toAbsolutePath(): %s%n", p1.toAbsolutePath());
		// normalize
		System.out.format("normalize(): %s%n", p1.normalize());
		// resolve
		System.out.format("resolve(): %s%n", p1.resolve(p1));
		// relativize
		System.out.format("relativize(): %s%n", p1.relativize(p1));
		// startsWith
		System.out.format("startsWith(): %s%n", p1.startsWith(p1));
		// endsWith
		System.out.format("endsWith(): %s%n", p1.endsWith(p1));
		// getNameCount
		System.out.format("getNameCount(): %s%n", p1.getNameCount());
		// subPath
		System.out.format("subpath(): %s%n", p1.subpath(1, 3));
		// toFile
		System.out.format("toFile(): %s%n", p1.toFile());
		// toUri
		System.out.format("toUri(): %s%n", p1.toUri());
		
		
	}
	
	public static void main(String args[]) {
		System.out.println("Java Paths api:");
		
		Path p1 = Paths.get("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1");
		//Path p2 = Paths.get(args[0]);
		Path p3 = FileSystems.getDefault().getPath("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1");
		Path p4 = Paths.get(System.getProperty("user.home"));
		Path p5 = Paths.get(System.getProperty("user.home"), "logs");
		Path p6 = Paths.get(System.getProperty("user.home"), "logs", "foo.log");
		Path p7 = Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flush3.txt");
		
		System.out.println(p1);
		//System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		
		pathmethods();
		
	}
	
}
