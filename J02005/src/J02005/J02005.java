package J02005;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class J02005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lenArr1 = input.nextInt();
		int lenArr2 = input.nextInt();
		int[] arr1 = new int[lenArr1];
		int[] arr2 = new int[lenArr2];
		arr1 = IntStream.range(0, lenArr1).map(i->input.nextInt()).toArray();
		arr2 = IntStream.range(0, lenArr2).map(i->input.nextInt()).toArray();
		List<Integer> list = joint(arr1, arr2);
		list.stream().forEach(e->{
			System.out.printf("%d ", e);
		});
	}

	public static List<Integer> joint(int[] arr1, int[] arr2) {
		return Arrays.stream(arr1)
				.distinct()
				.filter(e1 -> Arrays.stream(arr2).distinct().anyMatch(e2->e2==e1))
		        .boxed()
		        .sorted()
		        .collect(Collectors.toList());
	}
}

