package oi222ay_assign4.binheap;

import java.util.ArrayList;

/*
 * Inspired by the Y. Danile Lang intro to java book, 10th edtition.
 */

public class BinaryIntHeap {
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	
	public BinaryIntHeap() {
		// Constructs an empty heap
		elements.add(null);
	}
	
	private int parent(int i) {
		return elements.get(i/ 2);
	}
	
	private int left(int i) {
		return elements.get(i*2);
	}
	
	private int right(int i) {
		return elements.get(i*2+1);
	}
	
	private int parentPos(int i) {
		return i/2;
	}
	
	private int leftPos(int i) {
		return i*2;
	}
	
	private int rightPos(int i) {
		return i*2+1;
	}
	
	public void insert(int n) {
		// Add n to heap
		elements.add(null);
		int i = elements.size() - 1;
		while(i > 1 && parent(i) < n) {
			elements.set(i, parent(i));
			i = parentPos(i);
		}
		elements.set(i, n);
	}
	
	private void swap() {
		int root = elements.get(1);
		int prevPos = elements.size() - 1;
		int i = 1;
		boolean nodeGreater = true;
		
		while (nodeGreater) {
			int nodePos = leftPos(i);
			 if(nodePos <= prevPos) {
				 int node = left(i);
				 
				 if (rightPos(i) <= prevPos && right(i) > node) {
					 nodePos = rightPos(i);
					 node = right(i);
				 }
				 if (node > root) {
					 elements.set(i, node);
					 i = nodePos;
				 }
				 
				 else {
					 nodeGreater = false;
				 }
			 }
			 else {
				 nodeGreater = false;
			 }	 
		}
		elements.set(i, root);
	}
	
	public int pullHighest() {
		// Return and remove element with highest priority
		int h = elements.get(1);
		int prevPos = elements.size() - 1;
		int prev = elements.remove(prevPos);
		
		if (prevPos > 1) {
			elements.set(1, prev);
			swap();
		}
		
		return h;
	}
	public int size() {
		return elements.size() - 1;        // Current heap size
		
	}
	public boolean isEmpty() {
		// True if heap is empty
		if(elements.size() == 1) {
			return true;
		}
		
		return false;
	}
}
