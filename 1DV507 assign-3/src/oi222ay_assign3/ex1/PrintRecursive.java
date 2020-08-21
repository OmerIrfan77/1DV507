package oi222ay_assign3.ex1;

public class PrintRecursive {
	
	private static void print(String str, int pos) {
		char [] string = str.toCharArray();
		
		if(pos == str.length()) {
			;
		}
		else {
			System.out.print(string[pos]);
			print(str,pos+1);
		}
	}
	
	private static void printReverse(String str, int pos) {
char [] string = str.toCharArray();
		
		if(pos == str.length()) {
			;
		}
		else {
			printReverse(str,pos + 1);
			System.out.print(string[pos]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Everyone!";
		
		   print(str, 0);
		   System.out.println(); // Line break
		   printReverse(str, 0);

	}

}
