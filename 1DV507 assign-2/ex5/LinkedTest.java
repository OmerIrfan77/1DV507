package oi222ay_assign2.ex5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedTest<T> {

	private static int test_count = 0;
	Queue<Integer> test = new LinkedQueue<Integer>();
	Queue<String> test2 = new LinkedQueue<String>();

	@BeforeEach
	public void setUp() {
		test_count++;
		System.out.println("Test " + test_count);
	}

	@AfterEach
	public void tearDown() {
	}
	
	@Test
	public void testSize() {
		assertEquals(0,test.size());
		
	}
	
	@Test
	public void testFirst() {		
		test.enqueue(6);
		assertEquals(6,test.first());
		
		test.enqueue(9);
		assertEquals(6, test.first());
		
		test.dequeue();
		assertEquals(9,test.first());
		
		test2.enqueue("Hello");
		assertEquals("Hello", test2.first());
		
		test2.enqueue("Hi");
		assertEquals("Hello", test2.first());
		
		test2.dequeue();
		assertEquals("Hi", test2.first());
	}
	
	@Test
	public void testLast() {
		test.enqueue(2);
		test.enqueue(5);
		test.enqueue(8);
		assertEquals(8,test.last());
		
		test.dequeue();
		assertEquals(8,test.last());
		
		test2.enqueue("Sup");
		test2.enqueue("Hows");
		test2.enqueue("U");
		assertEquals("U", test2.last());
		
	}
	
	@Test
	public void testDequeue() {
		test.enqueue(4);
		test.enqueue(6);
		
		test.dequeue();
		assertEquals(1,test.size());
		
		test2.enqueue("My");
		test2.enqueue("Name");
		
		test2.dequeue();
		assertEquals(1,test2.size());
		
	}
	
	@Test
	public void testIsEmpty() {
		test.enqueue(4);
		assertFalse(test.isEmpty());
		
		test2.enqueue("Jeff");
		assertFalse(test2.isEmpty());
		
	}
	
	@Test
	public void testEnqueue() {
		for (int i = 0; i < 10; i++) {
			test.enqueue(i);
		}
		assertEquals(test.size(), 10);
		assertEquals(test.isEmpty(), false);
		
		test2.enqueue("This");
		test2.enqueue("is");
		test2.enqueue("a");
		test2.enqueue("test");
		assertEquals(test2.size(), 4);
		assertEquals(test2.isEmpty(), false);
	}
}
