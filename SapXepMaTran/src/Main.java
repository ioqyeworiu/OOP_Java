import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Matrix.in");
		Scanner sc = new Scanner(file);
		int test = sc.nextInt();
		while(test--!=0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int index = sc.nextInt();
			int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			Matrix ma1 = new Matrix(n, m, arr);
			ma1.sortColumn(index-1);
			System.out.println(ma1.toString());
		}
	}
}
