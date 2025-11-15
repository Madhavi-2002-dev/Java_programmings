package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readding {
	public static void main(String[] args) throws IOException {
		File f=new File("sample.txt");
		FileInputStream fis=new FileInputStream(f);
		int asciivalues;
		while((asciivalues=fis.read())!=-1)
		{
			System.out.print((char)asciivalues);
		}
	}

}
