package oi222ay_assign1.ex5;
/**
 * @author Omer_Irfan
 */
/**
 * Node class stores an element and also
 * the next node after it.
 */
public class Node {
	private Integer node;
	private Node nextNode = null;
	
	public Integer getNode() {
		return node;
	}
	
	public void setNode(Integer node) {
		this.node = node;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return "Node: " + node + " , " + nextNode + " .";
	}
	

}
