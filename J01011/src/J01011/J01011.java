package J01011;

import java.util.Scanner;

public class J01011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int query = input.nextInt();
		while(query-- != 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.printf("%d %d\n", lcm(a, b), gcd(a, b));
		}
	}
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	public static long lcm(int a, int b) {
		return (long)a*b/gcd(a, b);
	}
}
