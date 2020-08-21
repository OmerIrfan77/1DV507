package oi222ay_assign4.time;

import java.util.Comparator;
import java.util.Random;

public class SortingAlgorithmTime {
	
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
	
	public static String rndStr() {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder rndStr = new StringBuilder();
		Random rnd = new Random();
		
		while(rndStr.length() < 11) {
			rndStr.append(alphabets.charAt(rnd.nextInt(alphabets.length())));
		}
		return rndStr.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrInt = new int [50];
		int intCount = 0;
		int intCountMerg = 0;
		String [] arrStr = new String [50];
		int strCount = 0;
		int strCountMerg = 0;
		Random rnd = new Random();
		
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = rnd.nextInt(99) + 1;
			
		}
		
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = rndStr();
		}
		
		long beforeInt = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeInt <= 1000) {
			insertionSort(arrInt);
			intCount++;
		}
		
		long beforeIntMerg = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeIntMerg <= 1000) {
			mergeSort(arrInt);
			intCountMerg++;
		}
		
		Comparator <String> c = new Comparator <String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
		
		long beforeStr = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeStr <= 1000) {
			insertionSort(arrStr, c);
			strCount++;
		}
		
		long beforeStrMerg = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeStrMerg <= 1000) {
			insertionSort(arrStr, c);
			strCountMerg++;
		}
		
		System.out.println("Amount of Int arrays sorted in 1 second: " + intCount
							+ "\n" + "Amount of String arrays sorted in 1 second: " + strCount);
		
		System.out.println("Amount of Int arrays sorted in 1 second for mergeSort: " + intCountMerg
				+ "\n" + "Amount of String arrays sorted in 1 second for mergeSort: " + strCountMerg);

	}

}
