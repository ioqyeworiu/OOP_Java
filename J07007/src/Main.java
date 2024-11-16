import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("E:\\UNIVERSITY SUBJECTS\\Program in vscode\\Code ptit\\OOP\\J07007\\src\\VANBAN.in"));
		Set<String> set = new TreeSet<String>();
		while(sc.hasNext()) {
			set.add(sc.next().toLowerCase());
		}
		set.forEach(System.out::println);
	}
}
