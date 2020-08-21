package oi222ay_assign4.time;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "a";
		String a80 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String strShort = "";
		String strLong = "";
		StringBuilder sbShort = new StringBuilder();
		StringBuilder sbLong = new StringBuilder();
		long shortCS = 0;
		long shortCSB = 0;
		long longCS = 0;
		long longCSB = 0;
		
		long beforeSCS = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeSCS <= 1000) {
			strShort = strShort + a;
			shortCS++;
		}
		
		long beforeSCSB = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeSCSB <= 1000) {
			sbShort.append(a);
			sbShort.toString();
			shortCSB++;
		}
		
		long beforeLCS = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeLCS <= 1000) {
			strLong = strLong + a80;
			longCS++;
		}
		
		long beforeLSCB = System.currentTimeMillis();
		while(System.currentTimeMillis() - beforeLSCB <= 1000) {
			sbLong.append(a80);
			sbLong.toString();
			longCSB++;
		}
		
		System.out.println( "Time taken is 1 second for these Concationations and Appends"
							+ "\n" + "Number of Short String Concationations: " + shortCS
							+ "\n" + "Length of String: " + strShort.length()
							+ "\n" + "Number of Short String Appends: " + shortCSB
							+ "\n" + "Length of String: " + sbShort.length()
							+ "\n" + "Number of Long String Concatinations: " + longCS
							+ "\n" + "Length of String: " + strLong.length()
							+ "\n" + "Number of Long String Appends: " + longCSB
							+ "\n" + "Length of String: " + sbLong.length());

	}

}
