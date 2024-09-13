package J02101;

import java.util.Scanner;
import java.util.stream.IntStream;

public class J02101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		IntStream.range(0, ques).forEach(e->{
			int len = input.nextInt();
			int[][] arr = new int[len][len];
			IntStream.range(0, len).forEach(i->{
				IntStream.range(0, len).forEach(j->{
					arr[i][j] = input.nextInt();
				});
			});
			display(arr);
			System.out.println();
		});
	}
	
	public static void display(int [][] arr) {
		IntStream.range(0, arr.length).forEach(i->{
			if(i%2==0) {
				IntStream.range(0, arr.length).forEach(j->{
					System.out.print(arr[i][j] + " ");
				});
			}
			else {
				IntStream.range(0, arr.length).map(j->arr.length-1-j).forEach(j->{
					System.out.print(arr[i][j] + " ");
				});
			}
		});
	}
}
