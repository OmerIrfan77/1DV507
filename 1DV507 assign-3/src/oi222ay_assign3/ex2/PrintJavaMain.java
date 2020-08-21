package oi222ay_assign3.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintJavaMain {

	private static int depth = 1, count = 0, size = 0;

	private static void subDir (File directory ) throws FileNotFoundException {
		if ( directory.isDirectory ()) {
			printAllJavaFiles(directory);
			depth++;
			File [] subs = directory.listFiles();
			for (File f:subs) {
					subDir(f);
			}
			depth--;
		}
		else if (directory.isFile() && directory.getName().endsWith(".java")) {
			Scanner sc = new Scanner (directory);
			while(sc.hasNext()) {
				sc.nextLine();
				size++;
			}
			printAllJavaFiles(directory);
			size = 0;
			sc.close();
		}
	}

	private static void printAllJavaFiles (File directory) { 
		StringBuffer buf = new StringBuffer();
		for ( int i=0; i<depth; i++) {
				buf.append(" ");
		}
		System.out.println((++count) + buf.toString() + directory.getName()+ "    " + size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File directory = new File("/Users/user/eclipse-workspace/1DV507");
		subDir(directory);
		}
		catch(FileNotFoundException e){
			
		}

	}

}
