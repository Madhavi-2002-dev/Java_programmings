package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WrittingFile {
	public static void main(String[] args) {
		String path="/home/next/Desktop/example.txt";
		/*
		 * try { FileWriter fw=new FileWriter(path);
		 * fw.write("this is my first file in java"); fw.close();
		 * System.out.println("Successfully wrote to the file"); } catch (IOException e)
		 * { // TODO Auto-generated catch block System.out.println("error accupaid");
		 * e.printStackTrace(); }
		 */
		
//		File file=new File(path);
//		try {
//			Scanner reade=new Scanner(file);
//			while(reade.hasNextLine())
//			{
//				String data=reade.nextLine();
//				System.out.println(data);
//			}
//			reade.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("file not found");
//			e.printStackTrace();
//		}
		try {
			FileWriter fw=new FileWriter(path,true);
			fw.write("\nthis line was added later!");
			fw.close();
			System.out.println("Text append successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
