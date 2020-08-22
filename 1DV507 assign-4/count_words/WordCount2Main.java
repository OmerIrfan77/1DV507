package oi222ay_assign4.count_words;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashWordSet hash = new HashWordSet();
		TreeWordSet tree = new TreeWordSet();
		
		try {
			File file = new File("/Users/user/Desktop/HistoryOfProgramming.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				Word word = new Word (sc.next());
				hash.add(word);
				tree.add(word);
	        } 
			sc.close();
		} 
		catch (IOException e) { 
			e.printStackTrace ();
		}
		System.out.println(tree.size());
		
	//	for (Word s : tree) {
     //       System.out.print(s + " ");
    //    }

	}

}
