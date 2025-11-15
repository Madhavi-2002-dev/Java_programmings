package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountEachWord {
	
	public static String findLongestLine(String path)
	{
		File file=new File(path);
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String lineLength=" ";
			while(br.readLine()!=null)
			{
				String s1=br.readLine();
				if(br.readLine().length()>lineLength.length())
				{
					lineLength=s1;
				}
			}
			return lineLength;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void copyFile(String path)
	{
		File file=new File("/home/next/Desktop/copy1.txt");
		try {
			if(file.createNewFile())
			{
				FileInputStream fis=new FileInputStream(path);
				FileOutputStream fos=new FileOutputStream(file);
				byte[] buffer=new byte[1024];
				int bytesRead;
				while((bytesRead=fis.read(buffer))!=-1)
				{
					fos.write(buffer, 0, bytesRead);
				}
				System.out.println("file copied successfully");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void searchWord(String word,String path)
	{
		File file=new File(path);
		try {
			Scanner reader=new Scanner(file);
			boolean found=false;
			while(reader.hasNext())
			{
				if(word.equalsIgnoreCase(reader.next()))
				{  
					System.out.println("word found");
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("word not found");
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		String path="/home/next/Desktop/Data.txt";
		File file=new File(path);
		String s1="";
		int wordcount=0;
			Scanner reader=new Scanner(file);
			while(reader.hasNext())
			{
		          if(reader.next()!=null)
		          {
		        	  wordcount++;
		          }
//				String line=reader.next();
//				wordcount=line.trim().split("\\s+").length;
				
			}
			System.out.println("word count "+wordcount);
			
			System.out.println("************************");
			
			System.out.println("longetsLine:"+findLongestLine(path));
			System.out.println("************************");
			copyFile(path);
			System.out.println("***************************");
			System.out.println("enter the word");
			String word=sc.next();
			searchWord(word, path);
	}

}
