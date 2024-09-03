package J02020;

import java.util.Arrays;
import java.util.Scanner;

public class J02020 {
	private static int[] arr;
	private static int size;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		arr = new int[k+1];
		arr[0]=0;
		size=0;
		comb(1, n, k);
		System.out.println("\nTong cong co " + size + " to hop");
	}

	public static void comb(int i, int n, int k) {
		for(int j=arr[i-1]+1; j<=n-k+i; j++) {
			arr[i] = j;
			if(i==k) {
				xuat();
				++size;
			}
			else {
				comb(i+1, n, k);
			}
		}
	}
	
	public static void xuat() {
		Arrays.stream(arr).skip(1).forEach(e->System.out.printf("%d", e));
		System.out.print(' ');
	}
}
