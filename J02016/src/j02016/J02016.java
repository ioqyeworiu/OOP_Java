package j02016;

import java.util.Scanner;

public class J02016 {
	private static Scanner input;
	private static int N;
	private static long[] arr;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			N = input.nextInt();
			arr = new long[N];
			for(int i=0; i<N; i++) {
				long m = input.nextLong();
				arr[i] = m*m;
			}
			if(findPytago()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean findPytago() {
		for(int i=0; i<arr.length; i++) {
			int l=0;
			int r=arr.length-1;
			while(l<=r) {
				if(arr[l]+arr[r]==arr[i]) {
					return true;
				}
				else if(arr[l]+arr[r]>arr[i]) {
					--r;
				}
				else {
					++l;
				}
			}
		}
		return false;
	}
}
