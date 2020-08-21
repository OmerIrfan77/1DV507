package oi222ay_assign4.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentifyWordsMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		StringBuilder text = new StringBuilder ();
		try {
			File file = new File("/Users/user/Downloads/HistoryOfProgramming.txt");
			Scanner sc = new Scanner(file);
			String str = "";
			String result = "";
			while(sc.hasNext()) {
				str = sc.nextLine();
				result = str.replaceAll("[^a-z A-Z]", "");
				text.append(result + "\n");
	        } 
			sc.close();
		
		} 
		catch (IOException e) { 
			e.printStackTrace ();
		}
		try {
		File outFile = new File("/Users/user/Desktop/output.txt");
		PrintWriter printer = new PrintWriter(outFile);
		printer.print(text); // Save text in file
		printer.close();
		} 
		catch (IOException e) { 
			e.printStackTrace (); 
		}

	}

}
