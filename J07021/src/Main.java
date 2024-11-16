import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\J07021\\src\\DATA.in");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String string = sc.nextLine();
			if(!string.equals("END")) {
				StringTokenizer stringToken = new StringTokenizer(string);
				string = "";
				while (stringToken.hasMoreTokens()) {
					String tempString = stringToken.nextToken();
					string += (tempString.substring(0, 1).toUpperCase() + tempString.substring(1).toLowerCase() + " ");
				}
				System.out.println(string);
			}
		}
	}
}
