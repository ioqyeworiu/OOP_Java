package J02034;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class J02034 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		List<Integer> list = IntStream.rangeClosed(1, len).map(e->input.nextInt()).boxed().collect(Collectors.toList());
		List<Integer>listTMP = IntStream.rangeClosed(1, list.get(len-1)).filter(e->Collections.frequency(list, e)==0).boxed().collect(Collectors.toList());
		if(listTMP.isEmpty()) {
			System.out.println("Excellent!");
		}
		else {
			listTMP.forEach(System.out::println);
		}
	}
}
