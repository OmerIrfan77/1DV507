package oi222ay_assign3.ex5;

import java.util.Scanner;

public class EuclideanMain {
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		int gcd = a%b;
		
		if (gcd == 0) {
			return b;
		}
		else {
			return gcd(b,gcd);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int a = sc.nextInt();
		
		System.out.print("B: ");
		int b = sc.nextInt();
		
		System.out.println("GCD: " + gcd(a,b));
		
		sc.close();

	}

}
