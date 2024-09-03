package J02004;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class J02004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			int num = input.nextInt();
			long[] arr = new long[100];
			arr = LongStream.range(0, num).map(i->i=input.nextLong()).toArray();
			if(check(arr)==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean check(long[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]!=arr[r]) {
				return false;
			}
			++l;
			--r;
		}
		return true;
	}
}

