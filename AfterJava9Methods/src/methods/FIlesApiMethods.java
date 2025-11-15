package methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIlesApiMethods {
	public static void main(String[] args) throws IOException {
		Path path=Paths.get("./Resources/sample.txt");
		String fileContent=Files.readString(path);
		System.out.println(fileContent);
		
		  String newFileContent=fileContent.replace("line","lines");
		  
		  Path newFilePath=Paths.get("./Resources/sample-new.txt");
		  Files.writeString(newFilePath, newFileContent);
		 
		
		
	}

}
