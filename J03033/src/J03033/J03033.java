package J03033;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = Integer.parseInt(input.nextLine());
		while(ques--!=0) {
			BigInteger a = new BigInteger(input.nextLine());
			BigInteger b = new BigInteger(input.nextLine());
			System.out.println(a.multiply(b).divide(a.gcd(b)));
		}
	}
}
