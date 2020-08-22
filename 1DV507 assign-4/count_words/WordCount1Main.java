package oi222ay_assign4.count_words;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Word> hash = new HashSet<Word>();
		TreeSet<Word> tree = new TreeSet<Word>();

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
		System.out.print(tree.size());

	}

}
