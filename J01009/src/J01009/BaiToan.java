package J01009;

import java.util.Scanner;

public class BaiToan {
	private int num;
	public BaiToan(int num) {
		this.num = num;
	}
	public void set() {
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
	}
	public long Tinh() {
		long tong = 0;
		for(int i=1; i<=num; i++) {
			long temp=1;
			for(int j=1; j<=i; j++) {
				temp*=j;
			}
			tong+=temp;
		}
		return tong;
	}
	public void print(long value) {
		System.out.print(value);
	}
}
