package J01018;

import java.util.Scanner;

public class J01018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = Integer.parseInt(input.nextLine());
		while(ques--!=0) {
			String str = input.nextLine();
			System.out.println(sum(str)%10==0 && check(str) ? "YES":"NO");
		}
	}
	
	public static int sum(String str) {
		return str.chars().map(i -> Character.getNumericValue(i)).sum();
	}
	
	public static boolean check(String str) {
		for(int i=0; i<str.length()-1; i++) {
			if(Math.abs(str.charAt(i)-str.charAt(i+1))!=2) {
				return false;
			}
		}
		return true;
	}
}
