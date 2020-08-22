package oi222ay_assign4.count_words;

public class Word implements Comparable<Word> {
	   private String word;

	   public Word(String str) {
		   this.word  = str.toLowerCase().replaceAll("[^a-z A-Z]", "");
		   
	   }
	   public String toString() { 
		   return word; 
		   }

	   /* Override Object methods */
	   public int hashCode() {
		   int hash = 0;
		   for (int i = 0; i < word.length(); i++) {
               hash = (i * word.charAt(i)) + hash;
           }
           
	       return hash;
	   }
	   
	   public boolean equals(Object other) { //... true if two words are equal 
		   if (this.toString().hashCode() == other.toString().hashCode()) {
			   return true;
		   }
		   return false;
	   }

	   /* Implement Comparable */
	   public int compareTo(Word w) { //... compares two words lexicographically 
		   return this.word.compareTo(w.word);
	   }
	}
