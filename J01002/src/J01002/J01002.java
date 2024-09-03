package J01002;

import java.util.Scanner;

public class J01002 {
	public static void main(String agrs[]) {
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		while(query--!=0) {
			long Num = s.nextInt();
			long sum = (Num*(Num+1))/2;
			System.out.println(sum);
		}
	}
}
