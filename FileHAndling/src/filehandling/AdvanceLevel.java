package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvanceLevel {
	public static void currentWordFrequency(String path) {
		File file=new File(path);
		if(!file.exists())
		{
			System.out.println("file not fount:"+path);
			return;
		}
		Map<String,Integer> wordCount=new HashMap<>();
		try {
			Scanner reader=new Scanner(file);
			while(reader.hasNext())
			{
				String word=reader.next().toLowerCase().replaceAll("[^a-zA-Z]","");
				if(!word.isEmpty())
				{
					wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("error reading file;"+e.getMessage());
		}
		System.out.println("word Frequency");
		for(Map.Entry<String,Integer> entry:wordCount.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	public static void replaceWord(String path,String oldWord,String newWord)
	{
		File file=new File(path);
		StringBuilder content=new StringBuilder();
		try {
			String line;
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((line=br.readLine())!=null)
			{
               line=line.replaceAll("\\b"+oldWord+"\\b", newWord);
               content.append(line).append(System.lineSeparator());
               
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write(content.toString());
			System.out.println("replace done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteSpecificLine(String path,int lineNo)
	{
		File file=new File(path);
		StringBuilder content=new StringBuilder();
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			int lineNumber=1;
			String line;
			while((line=br.readLine())!=null)
			{
				if(lineNumber!=lineNo)
				{
					content.append(line).append(System.lineSeparator());
				}
				lineNumber++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write(content.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		String path="/home/next/Desktop/example.txt";
		currentWordFrequency(path);
		System.out.println("***************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the replace word");
		String old=sc.next();
		System.out.println("enter the new Word");
		String newWord=sc.next();
		System.out.println("*********************");
		System.out.println("enter the delete line number");
		int lineno=sc.nextInt();
		deleteSpecificLine(path, lineno);
		
	}

}
