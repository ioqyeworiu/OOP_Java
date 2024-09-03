package J01016;

import java.util.*;

public class J01016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cnt = 0;
		String strg = input.nextLine();
		char []arr = new char[strg.length()];
		arr = strg.toCharArray();
		for(char x : arr) {
			if(x=='4'||x=='7') {
				++cnt;
			}
		}
		if(cnt==4||cnt==7) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
