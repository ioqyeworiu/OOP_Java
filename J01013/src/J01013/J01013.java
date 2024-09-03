package J01013;

import java.util.Scanner;

public class J01013 {
	public static int[] arr = new int[2200000];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long cnt = 0;
		untnn();
		while(N--!=0) {
			int Num = input.nextInt();
			cnt += count(Num);
		}
		System.out.println(cnt);
	}
	
	public static void untnn() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=2; i<=Math.sqrt(2*1000000); i++) {
			for(int j=i*i; j<=2*1000000; j+=i) {
				if(arr[j]==j) {
					arr[j]=i;
				}
			}
		}
	}
	
	public static long count(int num) {
		long cnt=0;
		while(num!=1) {
			cnt+=arr[num];
			num/=arr[num];
		}
		return cnt;
	}
}
