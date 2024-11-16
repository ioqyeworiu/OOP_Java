import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("E:\\UNIVERSITY SUBJECTS\\Program in vscode\\Code ptit\\OOP\\J07004\\src\\DATA.in"));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (sc.hasNext()) {
			int num = Integer.parseInt(sc.next());
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
