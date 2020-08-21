package oi222ay_assign2.ex4;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntQueue queue = new LinkedQueue();
        for (int i = 0; i < 10; i++){
            queue.enqueue(i);
        }
        for (int i : queue){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
        queue.dequeue();
        System.out.print(queue.first() + " " + queue.last());



	}

}
