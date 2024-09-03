package J01007;

import java.util.Scanner;

public class J01007 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		while(query--!=0) {
			long num = s.nextLong();
			long []arr;
			arr = new long[93];
			arr[0]=0;
			arr[1]=1;
			for (int i = 2; i < 93; i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			here:
			for (int i = 0; i < 93; i++) {
				if(num == arr[i]) {
					System.out.println("YES");
					break here;
				}
				else if(arr[i] > num) {
					System.out.println("NO");
					break here;
				}
			}
		}
	}
}
