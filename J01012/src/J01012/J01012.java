package J01012;

import java.util.*;

public class J01012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int query = input.nextInt();
		while(query-- != 0) {
			long num = input.nextLong();
			System.out.println(count(num));
		}
	}
	
	public static boolean perSquare(long num) {
		return num == (long)Math.sqrt(num)*Math.sqrt(num);
	}
	
	public static long count(long num) {
		long cnt = 0;
		if(num%2!=0) {
			return cnt;
		}
		for(long i=1; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				if(i%2 == 0) {
					++cnt;
				}
				if((num/i)%2 == 0) {
					++cnt;
				}
			}
		}
		if(perSquare(num)) {
			--cnt;
		}
		return cnt;
	}
}
