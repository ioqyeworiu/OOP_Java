package J01026;

import java.util.Scanner;

public class J01026 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			long num = input.nextLong();
			if(kiemTraChinhPhuong(num)==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean kiemTraChinhPhuong(long num) {
		return num == (long)Math.sqrt(num)*(long)Math.sqrt(num);
	}
}
