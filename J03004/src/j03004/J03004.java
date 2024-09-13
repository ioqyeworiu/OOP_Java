package j03004;

import java.util.Scanner;
import java.util.StringTokenizer;

public class J03004 {
	private static Scanner input;
	private static String string;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int ques = Integer.parseInt(input.nextLine());
		while(ques--!=0) {
			string = input.nextLine();
			System.out.println(correctNameFormat(string));
		}
	}
	
	public static String correctNameFormat(String name) {
		StringTokenizer strg = new StringTokenizer(name);
		name = "";
		while(strg.hasMoreTokens()) {
			String tmp =strg.nextToken();
			tmp.toLowerCase();
			tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase();
			name = name + " " + tmp;
		}
		return name;
	}
}
