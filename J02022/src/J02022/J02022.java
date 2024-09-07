package J02022;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class J02022 {
	private static int[] arr;
	private static int[] visited;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int query = input.nextInt();
		while(query--!=0) {
			int N = input.nextInt();
			arr = new int[N];
			visited = new int[N+1];
			setUp();
			permute(0);
		}
	}
	
	public static void setUp() {
		visited = IntStream.range(0, arr.length+2).map(e->0).toArray();
	}
	
	public static boolean checkExcludeZero() {
		return Arrays.stream(arr).allMatch(e->e!=0);
	}
	
	public static boolean checkContainNum() {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return IntStream.rangeClosed(1, arr.length).allMatch(e->Collections.frequency(list, e)==1);
	}
	
	public static boolean checkSubStract() {
		for(int i=0; i<arr.length-1; i++) {
			if(Math.abs(arr[i]-arr[i+1])==1) {
				return false;
			}
		}
		return true;
	}
	
	public static void output() {
		Arrays.stream(arr).forEach(e->System.out.printf("%d", e));
		System.out.println();
	}
	
	public static void permute(int i) {
		for(int j=1; j<=arr.length; j++) {
			if(visited[j]==0) {
				arr[i] = j;
				visited[j] = 1;
				if(i==arr.length-1) {
					if(checkExcludeZero() && checkContainNum() && checkSubStract()) {
						output();
					}
				}
				else {
					permute(i+1);
				}
				visited[j] = 0;
			}
		}
	}
}
