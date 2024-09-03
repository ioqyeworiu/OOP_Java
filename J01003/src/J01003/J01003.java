package J01003;

import java.util.Scanner;

public class J01003 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		float num1, num2;
		num1 = s.nextFloat();
		num2 = s.nextFloat();
		if(num1==0) {
			if(num2!=0)
				System.out.println("VN");
			else {
				System.out.println("VSN");
			}
		}
		else {
			System.out.printf("%.2f", -(num2/num1));
		}
	}
}
