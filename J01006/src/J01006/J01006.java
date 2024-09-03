package J01006;

import java.util.Scanner;

public class J01006 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		while(query--!=0) {
			int num = s.nextInt();
			long []arr;
			arr = new long[92];
			arr[0] = arr[1] = 1;
			for (int i = 2; i < num; i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			System.out.println(arr[num-1]);
		}
	}
}
