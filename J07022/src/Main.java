import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(
				new File("E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\J07022\\src\\DATA.in"));
		ArrayList<String> stringList = new ArrayList<String>();
		while (sc.hasNext()) {
			String string = sc.next();
			try {
				int integer = Integer.parseInt(string);
			} catch (Exception e) {
				stringList.add(string);
			}
		}
		stringList.sort((a, b) -> a.compareTo(b));
		for (String string : stringList) {
			System.out.printf("%s ", string);
		}
	}
}
