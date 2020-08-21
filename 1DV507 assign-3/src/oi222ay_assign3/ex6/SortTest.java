package oi222ay_assign3.ex6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SortTest {
	private static int count = 0;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Run test method: "+(++count));
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" --- done with test "+count);
	}

	@Test
	public void testInsertionSort() {
		int [] actual = {3,4,2,1};
		actual = SortingAlgorithms.insertionSort(actual);
		int [] expected = {1,2,3,4};
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
		
	}
	@Test
	public void testInsertionSortComparator() {
		String [] actual = {"hello", "hi", "a", "noo"};
		actual = SortingAlgorithms.insertionSort (actual, (s1,s2) ->{
			return s1.length() - s2.length();
		});
		String [] expected = {"a", "hi", "noo", "hello"};
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
		
	}

}
