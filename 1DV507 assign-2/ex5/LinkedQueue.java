package oi222ay_assign2.ex5;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new IteratorQueue();
		/**
		 * @return an iterator class showcased below
		 */
	}
	
	private class IteratorQueue implements Iterator<T>{
		private Node<T> node = head;
		private int i = size;
		
		public T next() {
			T nodeN = node.getNode();
			node = node.getNextNode();
			i--;
			return nodeN;
		}
		public boolean hasNext() {
			return (i > 0);
		}
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}
	
	/**
	 *  enqueue, this adds an element to the end
	 *  of the queue
	 */

	public void enqueue(T element) {
		// TODO Auto-generated method stub
		Node<T> lastTail = tail;
		tail = new Node<T>();
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

	
	public T dequeue() {
		// TODO Auto-generated method stub
		T node = head.getNode();
		head = head.getNextNode();
		if(size() == 0) {
			tail = null;
		}
		size--;
		return node;
	}

	
	public T first() {
		// TODO Auto-generated method stub
		return head.getNode();
	}

	
	public T last() {
		// TODO Auto-generated method stub
		return tail.getNode();
	}

}
