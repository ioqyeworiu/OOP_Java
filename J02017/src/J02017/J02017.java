package J02017;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class J02017 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		List<Integer> list = IntStream.range(0, len).map(e->input.nextInt()).boxed().collect(Collectors.toList());
		boolean ok = true;
		while(ok) {
			ok = false;
			for(int i=0; i<list.size()-1; i++) {
				if((list.get(i)+list.get(i+1))%2==0){
					list.remove(i);
					list.remove(i);
					ok = true;
					break;
				}
			}	
		}
		System.out.println(list.size());
	}	
}
