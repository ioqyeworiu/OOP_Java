package J01024;

import java.util.Scanner;
import java.util.stream.IntStream;

public class J01024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = Integer.parseInt(input.nextLine());
		while(ques-- != 0) {
			if(check(input.nextLine())==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean check(String str) {
		IntStream intStream = str.chars();
		return intStream.map(s->Character.getNumericValue(s)).allMatch(s -> s==0||s==1||s==2);
	}
}
