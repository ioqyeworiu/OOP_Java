package J02105;

import java.util.Scanner;

public class J02105 {
	private static Scanner input;
	private static int N;
	private static int[][] arr;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		N = input.nextInt();
		arr = new int[N][N];
		setArray(arr);
		display(arr);
	}
	
	public static void setArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
	}
	
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print("List("+(i+1)+") = ");
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]==1) {
					System.out.print((j+1) + " ");
				}
			}
			System.out.println();
		}
	}
}
