package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondFIle {
	public static void main(String[] args) {
		String path="/home/next/Desktop/Data.txt";
		File file=new File(path);
//		try {
//			file.createNewFile();
			
				
//				 FileWriter fw=new FileWriter(file,true);
//				  fw.write("Hello java\nWelcome to file handling\nPractice makes perfect");
//				  fw.close(); System.out.println("wrote successfully");
				  
//				 if(file.exists())
//				 {
//					 System.out.println("it already exits");
//				 }else {
//					 
//				 }
				  
				 
							
			
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		int lineCount=0;
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			try {
				while(br.readLine()!=null)
				{
					lineCount++;
				}
				System.out.println("Number of lines in file "+lineCount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
