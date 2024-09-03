package Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//		// Tạo một Stream từ List
//		Stream<Integer> stream = numbers.stream();
//		int sum = numbers.stream()
//                .filter(n -> n % 2 == 0) // Lọc các số chẵn
//                .mapToInt(n -> n) // Chuyển Stream thành IntStream
//                .sum();// Tính tổng
//		System.out.println(sum); // Output: 12
		
		String strg = "123456";
		IntStream intStream = strg.chars();
//		intStream.map(Character::getNumericValue).filter(n -> n%2==1).forEach(System.out::println);
//		System.out.println(intStream);
	}
}
