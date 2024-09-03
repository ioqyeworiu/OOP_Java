package J01004;

import java.util.Scanner;
import java.lang.Math;

public class J01004 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		while(query--!=0) {
			long num = s.nextLong();
			if(num == 0 || num == 1) {
				System.out.println("NO");
			}
			else {
				boolean ok=true;
				here:
				for(int i = 2; i <= Math.sqrt(num); i++) {
					if(num % i == 0) {
						System.out.println("NO");
						ok=false;
						break here;
					}
				}
				if(ok) {
					System.out.println("YES");
				}
			}
		}
	}
}
