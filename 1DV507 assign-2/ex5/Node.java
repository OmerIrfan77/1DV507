package oi222ay_assign2.ex5;



public class Node<T> {
	private T node;
	private Node<T> nextNode = null;
	
	public T getNode() {
		return node;
	}
	
	public void setNode(T node) {
		this.node = node;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return "Node: " + node + " , " + nextNode + " .";
	}
}
