package J02006;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class J02006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lenArr1 = input.nextInt();
		int lenArr2 = input.nextInt();
		int [] arr1 = new int[lenArr1];
		int [] arr2 = new int[lenArr2];
		arr1 = Arrays.stream(arr1).map(e->input.nextInt()).toArray();
		arr2 = Arrays.stream(arr2).map(e->input.nextInt()).toArray();
		List<Integer> list = union(arr1, arr2);
		list.stream().forEach(e->{
			System.out.printf("%d ", e);
		});
	}
	
	public static List<Integer> union(int[] arr1, int[] arr2){
		Stream<Integer> intStream1 = Arrays.stream(arr1).boxed();
		Stream<Integer> intStream2 = Arrays.stream(arr2).boxed();
		return Stream.concat(intStream1, intStream2).distinct().sorted().collect(Collectors.toList());
	}
}
