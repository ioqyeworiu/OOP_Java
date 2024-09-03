package J02008;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class J02008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			int n = input.nextInt();
			long[] arr = new long[n];
			arr = LongStream.range(0, n).map(e->e+1).toArray();
			System.out.println(Arrays.stream(arr).reduce((long) 1, J02008::lcm));
		}
	}
	
	public static long gcd(Long a, Long b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static long lcm(Long a, Long b) {
		return (a*b)/gcd(a, b);
	}
}
