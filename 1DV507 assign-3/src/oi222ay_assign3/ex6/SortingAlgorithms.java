package oi222ay_assign3.ex6;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {
	
	public static int[] insertionSort(int[] in) {
		int [] sort = new int [in.length];
		int temp;
		for(int t = 0; t< in.length; t++) {
			sort[t] = in[t];
		}
		for(int i = 1; i <sort.length; i++) {
			temp = sort[i];
			int j = i-1;
			
			while(j>=0 && sort[j] > temp) {
				sort[j+1] = sort[j];
				j--;
			}
			sort[j+1] = temp;
		}
		return sort;
	}
	
	public static String[] insertionSort(String[] inn, Comparator<String> c) {
		String [] sort = new String [inn.length];
		String temp;
		for(int t = 0; t< inn.length; t++) {
			sort[t] = inn[t];
		}
		for(int i = 1; i <sort.length; i++) {
			temp = sort[i];
			int j = i-1;
			
			while(j>=0 && c.compare(sort[j], temp)> 0) {
				sort[j+1] = sort[j];
				j--;
			}
			sort[j+1] = temp;
		}
		return sort;
	}
	
	/**
	 * 
	 * merge sort inspiration : http://web.cs.iastate.edu/~smkautz/cs227f16/examples/week11/MergeSort.java
	 */
	
	public static int[] mergeSort(int[] in) {
		int sort[] = in;
		if (sort.length <= 1) {
			return sort;
		}
		
		int half = sort.length/2;
		int arr[] = new int [half];
		int arr2[] = new int [sort.length - arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sort[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sort[half++];
		}
		
		arr = mergeSort(arr);
		arr2 = mergeSort(arr2);
		
		int arrT = 0;
		int arr2T = 0;
		int j = 0;
		
		while (arrT < arr.length && arr2T < arr2.length) {
			
			if (arr[arrT] < arr2[arr2T]) {
				sort[j] = arr[arrT];
				arrT++;
			}
			else {
				sort[j] = arr2[arr2T];
				arr2T++;
			}
			j++;
		}
		while (arrT < arr.length) {
			sort[j] = arr[arrT];
			arrT++;
			j++;
		}
		
		while (arr2T < arr2.length) {
			sort[j] = arr2[arr2T];
			arr2T++;
			j++;
		}
		return sort;
	}
	
	public static String[] mergeSort(String[] inn, Comparator<String> c) {
		String sort[] = inn;
		
		if(sort.length <= 1) {
			return sort;
		}
		String[] s1 = new String [sort.length / 2];
		String[] s2 = new String [sort.length - s1.length];
		
		for (int i = 0; i < s1.length; i++) {
			s1[i] = sort[i];
		}
		
		for (int i = 0; i < s2.length; i++) {
			s2[i] = sort[s1.length + i];
		}
		
		s1 = mergeSort(s1,c);
		s2 = mergeSort(s2,c);
		
		int str1 = 0;
		int str2 = 0;
		int j = 0;
		
		while (str1 < s1.length && str2 < s2.length) {
			
			if (c.compare(s1[str1], s2[str2]) > 0) {
				sort[j] = s1[str1];
				str1++;
			}
			else {
				sort[j] = s2[str2];
				str2++;
			}
			j++;
		}
		while (str1 < s1.length) {
			sort[j] = s1[str1];
			str1++;
			j++;
		}
		
		while (str2 < s2.length) {
			sort[j] = s2[str2];
			str2++;
			j++;
		}
		
		return sort;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] in = {3,7,2,8,9,2,6,4,7};
		String [] inn = {"Hello", "This", "Is", "An", "Example" };
		
		System.out.println(Arrays.toString(insertionSort(in)));
		System.out.println(Arrays.deepToString(insertionSort(inn, (s1,s2) ->{
			return s1.length() - s2.length();
		})));
		System.out.println(Arrays.toString(mergeSort(in)));
		System.out.println(Arrays.deepToString(mergeSort(inn, (m1,m2) ->{
			return m2.length() - m1.length();
		})));

	}

}
