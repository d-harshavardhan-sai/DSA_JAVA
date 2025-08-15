package javaPractise;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

// File - A file is a named location used for storing data(Unit which stores(memory) information)

// absolute path(full path)

// relative path(current directory)

// separators / or \\ (\=\\ \ throws error in eclipse)

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		// absolute path(full path) - use ("D:/Files/resume.txt"); 
		
		// relative path(current directory) - use ("./resume.txt");
		
		File f = new File("C:\\Users\\harsh\\eclipse-workspace\\javaPractise\\src\\javaPractise\\evenOdd.java");  // instance of a file is created
		
//		System.out.println(f.createNewFile()); // file is created and output is boolean. true if file is not there before, false if file already exist
//		System.out.println(f.delete());  // file is deleted and output is boolean. true if file is there before, false if is not file already exist
//		System.out.println(f.exists());  // checks if file exist or not, returns boolean
		
		// create all together
//		if (f.exists()) {
//			f.delete();
//		}
//		System.out.println(f.createNewFile());
		
		
//		System.out.println(f.isHidden());  // checks file is hidden or not
//		System.out.println(f.canWrite());  // checks read only files - we cannot write in read only type of files. 
//		f.setWritable(false); // to change it to read only mode 
//		f.setWritable(true);  // to remove it from read only mode
		
		// files in current project itself
		
		// if path specified in files console is
		// ("C:/Resources/"); at last / is mandatory for folders
//		f.mkdir();// if I want to create single folder(last written folder only)
		
//		f.mkdirs();// if I want to create all the folders(all folders written, in folder which exist)
		
		// If I put path of any thing in console and to print paths 
		// (C:\Users\harsh\eclipse-workspace\javaPractise);
		//f.list();// I want to print full path in console
		
//		for (String fileName : f.list()) {
//			System.out.println(fileName);
//		}
		
//		System.out.println(Arrays.toString(f.list()));
//		System.out.println(Arrays.toString(f.listFiles())); // prints entire path
		
        // (C:\Users\harsh\eclipse-workspace\javaPractise/resume.txt);
		
//		System.out.println(f.getName()); // name of the file in directory
//		System.out.println(f.getAbsolutePath()); // absolute path of the file
//		System.out.println(f.getParent()); // parent of the file ie; upto javaPractise
		
		// If I want to create another file using other file and do operations like create and delete..
		
//		File f2 = new File(f.getParent() +"resume.docx");
//		f2.createNewFile();
		
//		System.out.println(new Date(f.lastModified())); // Sun Jun 09 11:54:57 IST 2024
		
		
		// (C:\Users\harsh\eclipse-workspace\javaPractise\src\javaPractise\evenOdd.java);
		
//		System.out.println(f.isFile());     // file
//		System.out.println(f.isDirectory()); // path
		
		
		
	}
	
}
