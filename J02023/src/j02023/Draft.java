package j02023;

import java.math.BigInteger;

public class Draft {
	public static void main(String[] args) {
		/*
		int n = 123;
		String string = String.valueOf(n);
		System.out.println(string + " " + string.getClass().getName());
		String string2 = String.format("%d", n);
		System.out.println(string2 + " " + string2.getClass().getName());
		String string3 = n+"";
		System.out.println(string3 + " " + string3.getClass().getName());
		String string4 = Integer.toString(n);
		System.out.println(string4 + " " + string4.getClass().getName());
		*/
		BigInteger N;
		N = BigInteger.valueOf(12345);
		String string = N + "";
		System.out.println(string.getClass().getName());
		System.out.println(string);
	}	
}
