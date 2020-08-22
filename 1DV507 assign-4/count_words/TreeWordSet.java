package oi222ay_assign4.count_words;

import java.util.Iterator;

/**
 * 
 * @author Omer Irfan
 * inspiration for iterator: https://stackoverflow.com/questions/12850889/in-order-iterator-for-binary-tree
 *
 */
public class TreeWordSet implements WordSet{
	private Node root = null;
	private int sz;
	
	private class Node {
		Word value;
		Node left = null;
		Node right = null;
		Node parent;
		
		Node (Word val) {
			value = val;
		}
		
		void add(Word n) {
			Node node = new Node(n);
			if(n== null) {
				node = new Node(value);
				node.parent = parent;
			}
			if (n.compareTo(value) < 0) {
				if (left == null) {
					left = new Node(n);
					sz++;
				}
				else {
					left.add(n);
				}
			}
			else if (n.compareTo(value) > 0) {
				if (right == null) {
					right = new Node(n);
					sz++;
				}
				else {
					right.add(n);
				}
			}
		}
		
		boolean contains(Word n) {
			if (n.compareTo(value) < 0) {
				if (left == null) {
					return false;
				}
				else {
					return left.contains(n);
				}
			}
			else if (n.compareTo(value) > 0) {
				if (right == null) {
					return false;
				}
				else {
					return right.contains(n);
				}
			}
			return true;
		}
	}
	
	private static class BSIterator implements Iterator <Word>{
		private Node node;
		
		public  BSIterator(Node node) {
			if (node != null) {
				this.node = smallest(node);
			}
			else {
				this.node = node;
			}
		}
		
		private Node smallest (Node n) {
			if (n.left != null) {
                return smallest(n.left);
            } 
			else {
                return n;
            }
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return node != null;
		}

		@Override
		public Word next() {
			// TODO Auto-generated method stub
			if (node.right != null) {
				node = smallest(node.right);
			}
			else {
				while (node.parent != null && node.parent.left != node) {
					node = node.parent;
				}
				node = node.parent;
			}
			return node.value;
		}
		
	}

	@Override
	public Iterator<Word> iterator() {
		// TODO Auto-generated method stub
		return new BSIterator(root);
	}


	@Override
	public void add(Word word) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = new Node(word);
			sz++;
		}
		else {
			root.add(word);
		}
		
	}

	@Override
	public boolean contains(Word word) {
		// TODO Auto-generated method stub
		if (root == null) {
			return false;
		}
		return root.contains(word);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

}
