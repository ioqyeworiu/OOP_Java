import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertex = sc.nextInt();
		int[][] arr = new int[vertex][vertex];
		for(int i = 0; i<vertex; i++) {
			for(int j = 0; j<vertex; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Graph g = new Graph(vertex, arr);
		System.out.println(g.convert());
	}
}
