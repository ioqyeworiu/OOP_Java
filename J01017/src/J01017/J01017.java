package J01017;

import java.util.Scanner;

public class J01017 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = Integer.parseInt(input.nextLine());
		while(ques--!=0) {
			Boolean ok =true;
			String string = input.nextLine();
			for(int i=0; i<string.length()-1; i++) {
				if(Math.abs(string.charAt(i)-string.charAt(i+1))!=1) {
					System.out.println("NO");
					ok=false;
					break;
				}
			}
			if(ok) {
				System.out.println("YES");
			}
		}
	}
}
