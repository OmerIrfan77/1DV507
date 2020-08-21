package oi222ay_assign3.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {
	
	private static int[] pascalRow(int n) {
		
		if (n == 1) {
			int [] temp = new int [1];
			temp[0] = 1;
			return temp;
		}
		else {
			int [] last = pascalRow(n-1);
			int [] first = next(last);
			return first;
		}
		
	}
	
	public static int[] next(int[] pre) {
		
	    int [] p = new int [pre.length + 1];
	    p[0] = 1;
	    p[pre.length] = 1;
	    
	    for(int t = 1; t < pre.length; t++) {
	    	p[t] = pre[t - 1] + pre[t];
	    }
	    return p;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("What row you want? ");
		int n = sc.nextInt();
		System.out.println(Arrays.toString(pascalRow(n)));
		sc.close();

	}

}
