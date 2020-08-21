package oi222ay_assign4.binheap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BinaryIntHeapTest {
	private static int count = 0;
	private BinaryIntHeap test = new BinaryIntHeap();

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Run test method: "+(++count));
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" --- done with test "+count);
	}

	@Test
	public void testSize() {
		test.insert(10);
		test.insert(3);
		test.insert(6);
		test.insert(19);
		assertEquals(4, test.size());
		
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(test.isEmpty());
	}
	
	@Test
	public void testInsert() {
		test.insert(4);
		assertEquals(1,test.size());
		assertEquals(4,test.pullHighest());
		
	}
	
	@Test
	public void testPullHighest() {
		test.insert(8);
		test.insert(33);
		test.insert(56);
		test.insert(7);
		assertEquals(56, test.pullHighest());
		assertEquals(3, test.size());
	}

}
