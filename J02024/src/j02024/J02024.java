package j02024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class J02024 {
	private static Scanner input;
	private static int N;
	private static int[] arr;
	private static int[] generator;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			N = input.nextInt();
			arr = new int[N];
			generator = new int[N];
			IntStream.range(0, N).forEach(i->{arr[i]=input.nextInt();});
			arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(e->e.intValue()).toArray();
			next(0);
		}
	}
	
	public static boolean check() {
		int[] cnt = new int[1];
		IntStream.range(0, N).forEach(i->{
			if(generator[i] == 1) {
				cnt[0]+=arr[i];
			}
		});
		return cnt[0]%2==1;
	}
	
	public static void display() {
		IntStream.range(0, N).forEach(i->{
			if(generator[i] == 1) {
				System.out.print(arr[i] + " ");
			}
		});
		System.out.println();
	}
	
	public static void next(int i) {
		for(int j=0; j<=1; j++) {
			generator[i] = j;
			if(i==N-1) {
				if(check()) {
					display();
				}
			}
			else {
				next(i+1);
			}
		}
	}
}
