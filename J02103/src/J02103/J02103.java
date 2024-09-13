package J02103;

import java.util.Scanner;

public class J02103 {
	private static Scanner input;
	private static int ques;
	private static int n;
	private static int m;
	private static int[][] arr;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		ques = input.nextInt();
		for(int i=1; i<=ques; i++) {
			System.out.printf("Test %d:\n", i);
			n = input.nextInt();
			m = input.nextInt();
			arr = new int[n][m];
			setUp(arr, n, m);
			int [][] resultArr = new int [n][n];
			resultArr = multiply(arr, n, m);
			display(resultArr);
		}
	}
	
	public static void setUp(int[][] arr, int row, int col) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = input.nextInt();
			}
		}
	}
	
	public static int[][] multiply(int[][] arr, int row, int col){
		int [][] resultArr = new int[row][row];
		for(int i=0; i<row; i++) {
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					resultArr[i][j] += arr[i][k]*arr[j][k];
				}
			}
		}
		return resultArr;
	}
	
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
