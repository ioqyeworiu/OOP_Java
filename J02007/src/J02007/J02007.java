package J02007;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class J02007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		for(int i=0; i<ques; i++) {
			int lenArr = input.nextInt();
			int[] arr = new int[lenArr];
			arr = IntStream.range(0, lenArr).map(e->input.nextInt()).toArray();
			Map<Integer, Long> map = frequenceOf(arr);
			arr = modifiedArr(arr);
			System.out.printf("Test %d:\n", i+1);
			Arrays.stream(arr).forEach(e->System.out.printf("%d xuat hien %d lan\n", e, map.get(e)));
		}
	}
	
	public static Map<Integer, Long> frequenceOf(int[] arr){
		return Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting()));
	}
	
	public static int[] modifiedArr(int[] arr){
		return Arrays.stream(arr).distinct().toArray();
	}
}
