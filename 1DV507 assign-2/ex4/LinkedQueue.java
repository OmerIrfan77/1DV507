package oi222ay_assign2.ex4;

import java.util.Iterator;
/**
 * @author Omer_Irfan
 */

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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}
	
	/**
	 *  enqueue, this adds an element to the end
	 *  of the queue
	 */

	@Override
	public void enqueue(int element) {
		// TODO Auto-generated method stub
		Node lastTail = tail;
		tail = new Node();
		tail.setNode(element);
		tail.setNextNode(null);
		
		/**
		 *  below, this puts the element first and last if
		 *  queue is empty.
		 */
		if (size() == 0) {
			head = tail;
		}
		/**
		 *  @see else put it as tail.
		 */
		else {
			lastTail.setNextNode(tail);
		}
		
		size++;
	}
	/**
	 *   dequeue removes first and returns it.
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

	@Override
	public int first() {
		// TODO Auto-generated method stub
		return head.getNode();
	}

	@Override
	public int last() {
		// TODO Auto-generated method stub
		return tail.getNode();
	}

}
