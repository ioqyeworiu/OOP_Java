import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\J07017\\src\\DATA.in"));
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean check = false;
			for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
				Pair<Integer, Integer> p = new Pair<>(i, n - i);
				if (p.isPrime()) {
					System.out.println(p);
					check = true;
					break;
				}
			}
			if (!check)
				System.out.println(-1);
		}
	}
}
