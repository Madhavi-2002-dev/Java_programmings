package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateTheFile {
	public static void main(String[] args) {
		File file=new File("/home/next/Desktop/example.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("fileCreated "+file.getName());;
			}else {
				System.out.println("file is already exits");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
