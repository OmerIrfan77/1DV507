package oi222ay_assign4.vgex10;

public interface Task extends Comparable<Task> {
	void setPriority(int p);
	
	int getPriority();
	
	void setDescription(String d);
	
	String getDescription();
	
	int compareTo(Task t);
	
	boolean equals(Task t);

}
