package J01021;

import java.util.Scanner;

public class J01021 {
	public static final long mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a, b = -1;
		while(true) {
			a = input.nextLong();
			b = input.nextLong();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(pow(a, b));
		}
	}
	
	public static long pow(long a, long b) {
		if(b==0) {
			return 1;
		}
		long c = pow(a, b/2);
		if(b%2==0) {
			return ((c%mod)*(c%mod))%mod;
		}
		return ((c%mod)*((c*a)%mod))%mod;
	}
}
