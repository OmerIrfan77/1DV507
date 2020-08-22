package oi222ay_assign4.count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet {
	
	private Node[] buckets = new Node[8];
	private int sz;
	
	private class Node {
		Word value;
		Node next = null;
		
		public Node (Word str) {
			value = str;
		}
		
		public String toString() {
			return value.toString();
		}
	}
	

	@Override
	public Iterator<Word> iterator() {
		// TODO Auto-generated method stub
		Iterator <Word> iterate = new Iterator <Word>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				for (int i = 0; i < buckets.length; i++){
					
					Node ret = buckets[i];
					
					if (ret != null) {
						return true;
					}
				}
				return false;
			}

			@Override
			public Word next() {
				// TODO Auto-generated method stub
				while (index < buckets.length) {
					Node ret = buckets[index++];
					if (ret!= null) {
						return (Word) ret.value;
					}
				}
				return null;
			}
		};
		return iterate;
	}

	@Override
	public void add(Word word) {
		// TODO Auto-generated method stub
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		
		while (node != null) {
			if (node.value.equals(word)) {
				return;
			}
			else {
				node = node.next;
			}
		}
		
		node = new Node(word);
		node.next = buckets[pos];
		buckets[pos] = node;
		sz++;
		if (sz == buckets.length) {
			rehash(); // Separate method
		}
		
	}
	
	private int getBucketNumber(Word word) {
		int hc = word.hashCode();
		if (hc < 0) {
			hc = -hc;
		}
		return hc % buckets.length;
	}
	
	private void rehash() {
		Node [] temp = buckets;
		buckets = new Node[2 * temp.length];
		sz = 0;
		for (Node n : temp) {
			if (n == null) {
				continue;
			}
			while (n != null) {
				add(n.value);
				n = n.next;
			}
		}
	}

	@Override
	public boolean contains(Word word) {
		// TODO Auto-generated method stub
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		while (node != null) {
			if (node.value.equals(word)) {
				return true;
			}
			else {
				node = node.next;
			}
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

}
