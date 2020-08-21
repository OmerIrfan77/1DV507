/**
 * LinkedQueue.java
 * @author Omer_Irfan
 */
package oi222ay_assign1.ex5;

import java.util.Iterator;


public class LinkedQueue implements IntQueue{
	private Node head;
	private Node tail;
	private int size = 0;

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new IteratorQueue();
		/**
		 * @return an iterator class showcased below
		 */
	}
	
	private class IteratorQueue implements Iterator<Integer>{
		private Node node = head;
		private int i = size;
		
		public Integer next() {
			int nodeN = node.getNode();
			node = node.getNextNode();
			i--;
			return nodeN;
		}
		public boolean hasNext() {
			return (i > 0);
		}
	}
	/**
	 * @return the size of the queue.
	 */

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	/**
	 * @return true if queue is empty.
	 */

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}
	
	/**
	 *  Add element to the end of the queue.
	 *  @param element gets attached to end of queue.
	 */

	@Override
	public void enqueue(int element) {
		// TODO Auto-generated method stub
		Node lastTail = tail;
		tail = new Node();
		tail.setNode(element);
		tail.setNextNode(null);
		
		if (size() == 0) {
			head = tail;
		}
		
		else {
			lastTail.setNextNode(tail);
		}
		
		size++;
	}
	/**
	 *   Removes element in the start of the queue.
	 *   @return new first element in queue.
	 */

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		int node = head.getNode();
		head = head.getNextNode();
		if(size() == 0) {
			tail = null;
		}
		size--;
		return node;
	}
	/**
	 * @throws NullPointerException if queue is empty.
	 * @return first element in queue.
	 */

	@Override
	public int first() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NullPointerException();
		}
		return head.getNode();
	}
	/**
	 * @throws NullPointerException if queue is empty.
	 * @return last element in queue.
	 */

	@Override
	public int last() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NullPointerException();
		}
		return tail.getNode();
	}

}
