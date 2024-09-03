package J01005;

import java.util.Scanner;

public class J01005 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		while(query-- != 0) {
			int N = s.nextInt();
			int height = s.nextInt();
			for(int i=1; i<N; i++) {
				System.out.printf("%.6f ", Math.sqrt(i*Math.pow(height,2)/N));
			}
			System.out.println();
		}
	}
}
