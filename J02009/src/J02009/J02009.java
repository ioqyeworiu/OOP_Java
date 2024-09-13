package J02009;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.LongStream;

public class J02009 {
	private static Scanner input;
	private static int N;
	private static TreeMap<Long, Long> map;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		N = input.nextInt();
		map = new TreeMap<Long, Long>();
		LongStream.range(0, N).forEach(i->{
			Long m = Long.valueOf(input.nextLong());
			Long n = Long.valueOf(input.nextLong());
			map.put(m, n);
		});
		System.out.println(finishAt());
	}
	
	public static Long finishAt() {
		Long finishTime = (long) 0;
		for(Entry<Long, Long> entry : map.entrySet()) {
			if(entry.getKey() >= finishTime) {
				finishTime = entry.getKey() + entry.getValue();
			}
			else {
				finishTime += entry.getValue();
			}
		}
		return finishTime;
	}
}
