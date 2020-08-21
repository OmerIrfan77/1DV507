package oi222ay_assign1.ex2;

import java.util.EmptyStackException;

public class StackMain {

	public static void main(String[] args) {
		Stack s = new Stack (0);
		try {
			s.push("Hi");
			s.push("Hello");
			s.push("Sup");
			System.out.println("Stack size is: " + s.size());
			System.out.println("Popping the stack: " + s.pop() + " " + s.pop());
			System.out.println("Peeking the stack: " + s.peek());
			System.out.println("Size of stack after popping: " + s.size());
			System.out.println(s.isEmpty());
			s.pop();
			s.pop();
		}
		catch (EmptyStackException e){
			System.out.println("Error: Empty Stack.");
			
		}
		

	}

}
