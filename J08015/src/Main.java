import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int query = sc.nextInt();
		while(query--!=0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			ArrayList<Long> arr = new ArrayList<Long>();
			IntStream.range(0, n).forEach(e->arr.add(sc.nextLong()));
			DaySo daySo = new DaySo(n, arr);
			System.out.println(daySo.countTong(k));
		}
	}
}