package oi222ay_assign1.ex4;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayIntList list = new ArrayIntList();
		for (int i = 0; i < 10; i++) {
            list.add(i);
        }
		System.out.println("Values in list: " + list);
		list.addAt(677,2);
		list.remove(4);
		System.out.println("Values in list: " + list);
		
		ArrayIntStack stack = new ArrayIntStack();
		for (int i=0; i<5; i++) {
			stack.push(i);
		}
		System.out.println("Values in stack: " + stack);
		stack.pop();
		System.out.println("Values in stack: " + stack);
		stack.push(7);
		System.out.println("Values in stack: " + stack);
		
		System.out.println("Last value in stack: " + stack.peek());
		
		

	}

}
