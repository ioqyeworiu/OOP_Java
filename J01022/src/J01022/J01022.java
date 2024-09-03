package J01022;

import java.util.Scanner;

public class J01022 {
	public static long[] fibo = new long[93];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		setFi(fibo);
		while(ques--!=0) {
			int N = input.nextInt();
			long K = input.nextLong();
			System.out.println(findFibo(N, K, fibo));
		}
	}
	
	public static void setFi(long[] fi) {
		fi[0]=fi[1]=1;
		for(int i=2; i<93; i++) {
			fi[i] = fi[i-1]+fi[i-2];
		}
	}
	
	public static char findFibo(int n, long k, long[] fi) {
		if(n==0) return '0';
		if(n==1) return '1';
		if(k>fi[n-2]) {
			return findFibo(n-1, k-fi[n-2], fi);
		}
		return findFibo(n-2, k, fi);
	}
}
