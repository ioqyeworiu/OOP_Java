package J01010;

import java.util.*;

public class J01010 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long query = Long.parseLong(s.nextLine());
		while(query-- != 0) {
			String strg = s.nextLine();
			StringBuilder strgBuilder = new StringBuilder(" ");
			int[] arr = new int[]{0, 1, -1, -1, -1, -1, -1, -1, 0, 0};	
			char[] arr1 = new char[strg.length()];
			arr1 = strg.toCharArray();
			boolean ok1 = true;
			boolean ok2 = true;
			for(int i=0; i<arr1.length; i++) {
				int index = arr1[i] - '0';
				if(arr[index] == -1) {
					System.out.println("INVALID");
					ok2 = false;
					break;
				}
				else {
					if(ok1 && arr[index]==0) {
						strgBuilder.append(' ');
					}
					else {
						strgBuilder.append(arr[index]);
						ok1 = false;
					}
				}
			}
			if(ok2) {
				String strg1 = new String(strgBuilder);
				strg1 = strg1.trim();
				if(strg1 == "") {
					System.out.println("INVALID");
				}
				else {
					System.out.println(strg1);
				}
			}
		}
	}
}
