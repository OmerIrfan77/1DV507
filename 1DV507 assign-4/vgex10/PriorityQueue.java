package oi222ay_assign4.vgex10;

public interface PriorityQueue {
	void insert(Task t);
	
	Task pullHighest();
	
	boolean contains(Task t);
	
	int size();
	
	boolean isEmpty();
	
	Task peekHighest();

}
