package J02106;

import java.util.Scanner;

public class J02106 {
	private static Scanner input;
	private static int N;
	private static int[][] arr;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		N = input.nextInt();
		arr = new int[N][3];
		
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			int tmp = 0;
			for(int j=0; j<3; j++) {
				arr[i][j] = input.nextInt();
				if(arr[i][j] == 1) {
					++tmp;
				}
			}
			if(tmp > 3-tmp) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
