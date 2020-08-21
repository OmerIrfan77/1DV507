package oi222ay_assign1.ex2;

import java.util.EmptyStackException;

public class Stack implements StringStack{
	private String stack [];
	private int count = 0;
	private int sizeSet;
	
	public Stack (int sizeSet) {
		this.sizeSet = sizeSet;
        stack = new String[sizeSet];
    }
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public void push(String element) {
		if(sizeSet == stack.length) {
			expandSize();
		}
		this.stack[count] = element;
		count++;
	}
	
	public String pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[--count];
	}

	public String peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[count];

	}
	
	private void expandSize() {
		int expandStackSize = 2* stack.length;
		String [] expandStack = new String [expandStackSize];
		for(int i = 0; i < stack.length; i++) {
			expandStack[i] = stack[i];
		}
		stack = expandStack;
	}

}
