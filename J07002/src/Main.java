import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("E:\\UNIVERSITY SUBJECTS\\Program in vscode\\Code ptit\\OOP\\J07002\\src\\DATA.in"));
		long cnt = 0;
		while (sc.hasNext()) {
			try {
				cnt+=Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}
		}
		System.out.println(cnt);
	}
}
