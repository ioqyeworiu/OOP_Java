package J01001;

import java.util.Scanner;

public class J01001 {
	public static void main(String agrs[]) {
		int a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		if(a>0 && b>0) {
			System.out.print(2*(a+b));
			System.out.print(' ');
			System.out.print(a*b);
		}
		else {
			System.out.print(0);
		}
	}
}
