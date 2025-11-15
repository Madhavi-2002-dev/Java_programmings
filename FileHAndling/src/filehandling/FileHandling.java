package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f=new File("/home/Desktop/filestest.txt");
//		System.out.println(f.exists());
//		System.out.println(Arrays.toString(f.list()));
	
//		System.out.println(Arrays.toString(f.listFiles()));
		
//		System.out.println(f.getName());
		
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		System.out.println(f.isDirectory());
//		System.out.println(f.isFile());
		System.out.println(new Date(f.lastModified()));
	}

}
