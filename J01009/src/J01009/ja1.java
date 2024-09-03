package J01009;

import java.util.Scanner;

public class ja1 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in); 
		num = s.nextInt();
		long tong = 0;
		for(int i=1; i<=num; i++) {
			long temp=1; 
			for(int j=1; j<=i; j++) {
				temp*=j;
			}
			tong+=temp;
		}
		System.out.println(tong);
	}
}
