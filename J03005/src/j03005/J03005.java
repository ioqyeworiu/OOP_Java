package j03005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J03005 {
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
		List<String> list = new ArrayList<String>();
		while(strg.hasMoreTokens()) {
			list.add(strg.nextToken());
		}
		for(int i=1; i<list.size(); i++) {
			name = name + list.get(i).substring(0, 1).toUpperCase() + list.get(i).substring(1).toLowerCase();
			if(i!=list.size()-1) {
				name+=" ";
			}
		}
		name = name + ", " + list.get(0).toUpperCase();
		return name;
	}
}
