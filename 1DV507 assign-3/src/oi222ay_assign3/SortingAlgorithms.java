package oi222ay_assign3;

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
			
			System.out.println(Arrays.toString(sort));
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
			
			System.out.println(Arrays.toString(sort));
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
		

	}

}
