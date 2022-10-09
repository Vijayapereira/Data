package readerText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExist {
	static String path = "Data\\Directory.txt";

	public static void main(String[] args) throws IOException {
		
		doesfileExist(path);

	}
	public static String doesfileExist(String path) throws IOException {

		File f = new File(path);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while ((line = br.readLine()) != null) { //read each line one-by-one
		    String[] words = line.split("-|\\,"); //split at whitespace, the argument is a regular expression
		    for( String word : words ) {
		       //skip any empty string, see explanation below
		       if( word.isEmpty() ) {
		         continue;
		       }
		       System.out.println(word);
		    }
		    System.out.println();
	
		
	}
		return line;

}
	}	
