package J02104;

import java.util.List;
import java.util.Scanner;

public class J02104 {
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
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i][j] == 1) {
					System.out.print("(" + (i+1) + "," + (j+1) + ")\n");
				}
			}
		}
	}
}
