package Lesson7_FilesManip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.net.ssl.StandardConstants;

public class BasicFileOperationsEx {

	public static void main(String args[]) {
		System.out.println("Java Files api:");
		
		//FileOperationsCreate();
		//FileOperationsFileInputStream();
		//FileOperationsListDir();
		//FileOperationsCheckFileOrDir();
		//FileOperationsGetFileSize();
		//FileOperationsMKDIR();
		//FileOperationsMKDIRS();
		//FileOperationsDelete();
		//FileOperationsDeleteOnExit();
		//FileOperationsTempFile();
		//FileOperationsListing();
		//FileOperationsRenameTo();
		//FileOperationExists();
		//FileOperationNormalize();
		//FileOperationRelativize();
		//FileOperationAllBasicMove();
		//FileOperationAllBasicCopy();
		//FileOperationReadAllLines();
		//FileOperationReadAllLinesNoStream();
		//FileOperationReadAllLinesStream();
		//FileOperationLoggingTimes();
		FileOperationBasicFileAttributes();
		FileOperationDosAttributes();
		FileOperationSettingTimeStamp();
		FileOperationSettingPosixPermissions();
		FileOperationGettingPosixPermissions();
		FileOperationFileGroupOwner();
		FileOperationUserDefinedFileAttributes();
		FileOperationFileStoreAttributes();
		
		
	}
	
	
	
	
	private static void FileOperationGettingPosixPermissions() {
		// Getting POSIX permissions
		
		try {
			Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			PosixFileAttributes attr =
			    Files.readAttributes(file, PosixFileAttributes.class);
			System.out.format("%s %s %s%n",
			    attr.owner().getName(),
			    attr.group().getName(),
			    PosixFilePermissions.toString(attr.permissions()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private static void FileOperationFileStoreAttributes() {
		
		try {
			Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			FileStore store = Files.getFileStore(file);

			long total = store.getTotalSpace() / 1024;
			long used = (store.getTotalSpace() -
			             store.getUnallocatedSpace()) / 1024;
			long avail = store.getUsableSpace() / 1024;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private static void FileOperationUserDefinedFileAttributes() {

		//A file's MIME type can be stored as a user-defined attribute by using this code snippet:

		try {
			
			Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			UserDefinedFileAttributeView view = Files
			    .getFileAttributeView(file, UserDefinedFileAttributeView.class);
			view.write("user.mimetype",
			           Charset.defaultCharset().encode("text/html"));
			
			//To read the MIME type attribute, you would use this code snippet:
			Path file2 = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			UserDefinedFileAttributeView view2 = Files
			.getFileAttributeView(file,UserDefinedFileAttributeView.class);
			String name = "user.mimetype";
			ByteBuffer buf = ByteBuffer.allocate(view2.size(name));
			view.read(name, buf);
			buf.flip();
			String value = Charset.defaultCharset().decode(buf).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private static void FileOperationFileGroupOwner() {
		
		try {
			// Setting file
			Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			UserPrincipal owner = file.getFileSystem().getUserPrincipalLookupService()
			        .lookupPrincipalByName("sally");
			Files.setOwner(file, owner);
			
			
			
			// Setting group
			Path file2 = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			GroupPrincipal group =
			    file2.getFileSystem().getUserPrincipalLookupService()
			        .lookupPrincipalByGroupName("green");
			Files.getFileAttributeView(file2, PosixFileAttributeView.class)
			     .setGroup(group);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}




	private static void FileOperationSettingPosixPermissions() {
		// Create a file using the permissions of another
		try {
			Path sourceFile = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			Path newFile = Paths.get("C:\\Users\\Username\\Desktop\\pushkin2.txt");
			PosixFileAttributes attrs =
			    Files.readAttributes(sourceFile, PosixFileAttributes.class);
			FileAttribute<Set<PosixFilePermission>> attr =
			    PosixFilePermissions.asFileAttribute(attrs.permissions());
			Files.createFile(newFile, attr);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}




	private static void FileOperationSettingTimeStamp() {
		// Setting the time stamp
		
		try {
			Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
			BasicFileAttributes attr =
			    Files.readAttributes(file, BasicFileAttributes.class);
			long currentTime = System.currentTimeMillis();
			FileTime ft = FileTime.fromMillis(currentTime);
			Files.setLastModifiedTime(file, ft);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private static void FileOperationDosAttributes() {
		// Dos attributes
		Path file = Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt");
		try {
		    DosFileAttributes attr =
		        Files.readAttributes(file, DosFileAttributes.class);
		    System.out.println("isReadOnly is " + attr.isReadOnly());
		    System.out.println("isHidden is " + attr.isHidden());
		    System.out.println("isArchive is " + attr.isArchive());
		    System.out.println("isSystem is " + attr.isSystem());
		} catch (Exception x) {
		    System.err.println("DOS file" +
		        " attributes not supported:" + x);
		}
	}




	private static void FileOperationBasicFileAttributes() {
		
		
		try {
			Path file = Paths.get("/home/mkyong/file.txt");
			BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

			System.out.println("creationTime: " + attr.creationTime());
			System.out.println("lastAccessTime: " + attr.lastAccessTime());
			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

			System.out.println("isDirectory: " + attr.isDirectory());
			System.out.println("isOther: " + attr.isOther());
			System.out.println("isRegularFile: " + attr.isRegularFile());
			System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
			System.out.println("size: " + attr.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}




	private static void FileOperationLoggingTimes() {

		String fileName = "/home/mkyong/file.txt";

        try {

            Path file = Paths.get(fileName);
            BasicFileAttributes attr =
                Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private static void FileOperationReadAllLinesStream() {

		try {
			 Stream<String> stream = Files.lines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"));

		       List<String> result  = stream
		               .filter(line -> line.startsWith("As"))
		               .map(String::toUpperCase)
		               .collect(Collectors.toList());
		       result.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void FileOperationReadAllLinesNoStream() {
		
		try {
			Charset aCharset = Charset.forName("UTF-8");  
			List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"), aCharset);

		       List<String> result = new ArrayList<>();

		       for (String s: lines) {
		           if (s.startsWith("As")) {
		               String upper = s.toUpperCase();
		               result.add(upper);
		           }
		       }

		       for (String s: result) {
		           System.out.println(s);
		       }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void FileOperationReadAllLines() {

		Charset aCharset = Charset.forName("UTF-8");  
		
		try {
		    List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"), aCharset);

		       for (String s: lines) {
		           System.out.println(s);
		       }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void FileOperationAllBasicCopy() {

		try {
			CopyOption copyoption1 = StandardCopyOption.REPLACE_EXISTING;
			
			// Create a file
		    Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt"));
		    System.out.println("Was the file created successfully?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

		    // Create a directory
		    Path testDirectory2 = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2"));
		    System.out.println("Was the directory created successfully?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2")));

		    // Copy the file from the desktop to the testDirectory2 directory.
		    testFile1 = Files.copy(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt"), copyoption1);

		    System.out.println("Did our file remain on the desktop?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

		    System.out.println("Was our file copied to testDirectory?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt")));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	private static void FileOperationAllBasicMove() {

		try {
			CopyOption copyoption1 = StandardCopyOption.REPLACE_EXISTING;
			
			Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt"));
		    System.out.println("Was the file created successfully?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

		    // Create a directory
		    Path testDirectory = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory"));
		    System.out.println("Was the directory created successfully?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory")));

		    // Move the file from the desktop to the testDirectory directory. When you move a folder, you need to indicate its name in the folder!
		    testFile1 = Files.move(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt"), copyoption1);

		    System.out.println("Did our file remain on the desktop?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

		    System.out.println("Has our file been moved to testDirectory?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));

		    // Delete a file
		    Files.delete(testFile1);
		    System.out.println("Does the file still exist?");
		    System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void FileOperationRelativize() {
	
		Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
	    Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");

	    System.out.println(testFilePath1.relativize(testFilePath2));
	}

	private static void FileOperationNormalize() {

		// Path normalize(): "normalizes" the current path, removing unnecessary elements from it. You may know that in popular operating systems the symbols "." (current directory) and ".." (parent directory) are often used to designate paths. For example, "./Pictures/dog.jpg" means that the the current directory has a "Pictures" folder, which in turn contains a "dog.jpg" file.

		//Look here. If a path using "." or ".." appears in your program, the normalize() method will remove them and produce a path that does not contain them:
		Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");

	    System.out.println(path5.normalize());

	    Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
	    System.out.println(path6.normalize());
	}

	private static void FileOperationExists() {

		File directory_inFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\torename.txt");
		if (directory_inFile.exists()) {
			System.out.println("Directory detected");
		}
	}

	private static void FileOperationsRenameTo() {
		// Example: Rename To
		File directory_inFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\torename.txt");
		
		try {
			directory_inFile.renameTo(new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\torename2.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void FileOperationsTempFile() {
		// Example: Generate Test File
		File directory_inFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1");
		try {
			File.createTempFile("Oms", "sMo", directory_inFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void FileOperationsListing() {
		// Example: Listing Files
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1");
		
		String[] listoffileStrings = normalFile.list();
		for (String filename : listoffileStrings) {
			System.out.println(filename);
		}
		
		File[] listFiles = normalFile.listFiles();
		for (File file : listFiles) {
			System.out.println(file.getName());
		}
		
		
	}

	private static void FileOperationsDeleteOnExit() {
		// Example: File Delete On Exit
		
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\todelete.txt");

		try {
			normalFile.deleteOnExit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("File deleted!!");
		}
		
		
	}

	private static void FileOperationsDelete() {
		// Example: File Standard Delete
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\todelete.txt");

		try {
			normalFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("File deleted!!");
		}
		
		
	}

	private static void FileOperationsMKDIRS() {
		// Example: Create multiple directories
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\NewDirectory2\\1aa\\2aaa");
		normalFile.mkdirs();
		
		if (normalFile.isDirectory()) {
			System.out.println("Directory detected.");
		}
	}

	private static void FileOperationsMKDIR() {
		// Example: Create single directory
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\NewDirectory");
		normalFile.mkdir();
		if (normalFile.isDirectory()) {
			System.out.println("Directory detected.");
		}
	}

	private static void FileOperationsGetFileSize() {
		// Example: GetSize of File
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile.txt");
		long size = normalFile.length();
		System.out.println("File size: " + size);
	}
	
	

	private static void FileOperationsCheckFileOrDir() {
		// Example: Check if directory or file
		File folderFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\");
		if (folderFile.isDirectory()) {
			System.out.format("Folder: %s is a directory.\n", folderFile.getName());
		}
		
		File normalFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile.txt");
		if (normalFile.isFile()) {
			System.out.format("Folder: %s is a file.\n", normalFile.getName());
		}
		
	}

	private static void FileOperationsListDir() {
		
		File folderFile = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\");
		for (File file : folderFile.listFiles()) {
			System.out.println(file.getName() + " | " + file.getAbsolutePath());
		}
		
		
	}

	private static void FileOperationsFileInputStream()  {
		
		try {
			// Pass the file name directly if file already exists
			FileInputStream input = new FileInputStream("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile.txt");
			
			// or create the file, then pass it to FileInputstream
			File file = new File("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile2.txt");
			FileInputStream input2 = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	static void FileOperationsCreate() {
		
		try {
			//Files.createFile(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile.txt"));
			//Files.createDirectory(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\TestDirectory"));
			Files.createDirectory(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\TestDirectory\\1\\2\\3"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			//Files.createFile(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\flushnewfile.txt"));
			//Files.createDirectory(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\TestDirectory"));
			//Files.createDirectory(Path.of("C:\\Users\\p.doulgeridis\\eclipse-workspace\\Lesson1\\TestDirectory\\1\\2\\3"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			
		} catch (Exception e) {
			
		}
		

	}
	


}
