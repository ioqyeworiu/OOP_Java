import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Set<Integer>> map = new TreeMap<>();
		for(int i=1; i<=n; i++) {
			map.put(i, new HashSet<Integer>());
		}
		for(int i=1; i<=n-1; i++) {
			int first = sc.nextInt();
			int last = sc.nextInt();
			map.get(first).add(last);
			map.get(last).add(first);
		}
		Graph graph = new Graph(n, map);
		System.out.println(graph.isStarGraph()? "Yes":"No"); 
	}
}
