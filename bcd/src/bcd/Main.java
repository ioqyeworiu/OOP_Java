package bcd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("DATA.in");
		ObjectInputStream object = new ObjectInputStream(file);
		ArrayList<String> arr = (ArrayList<String>) object.readObject();
		object.close();
		for (String string : arr) {
			int index = 0;
			long cnt = 0;
			for (int i = string.length() - 1; i >= 0; i--) {
				char ch = string.charAt(i);
				if (ch == '0' || ch == '1') {
					System.out.print(ch);
					cnt += (Math.pow(2, index) * Character.getNumericValue(ch));
				}
			}
			System.out.print(" " + cnt + "\n");
		}
	}
}
