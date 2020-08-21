package oi222ay_assign2.ex4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedTest {
	private static int test_count = 0;
	IntQueue test = new LinkedQueue();

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
	}
	
	@Test
	public void testLast() {
		test.enqueue(2);
		test.enqueue(5);
		test.enqueue(8);
		assertEquals(8,test.last());
		
		test.dequeue();
		assertEquals(8,test.last());
	}
	
	@Test
	public void testDequeue() {
		test.enqueue(4);
		test.enqueue(6);
		
		test.dequeue();
		assertEquals(1,test.size());
		
	}
	
	@Test
	public void testIsEmpty() {
		test.enqueue(4);
		assertFalse(test.isEmpty());
		
	}
	
	@Test
	public void testEnqueue() {
		for (int i = 0; i < 10; i++)
			test.enqueue(i);
		assertEquals(test.size(), 10);
		assertEquals(test.isEmpty(), false);
	}
}
