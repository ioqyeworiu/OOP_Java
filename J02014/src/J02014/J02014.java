package J02014;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class J02014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		while(ques--!=0) {
			//khai báo mảng và nhập các phần tử
			int arrLen = input.nextInt();
			int[] intArr = new int[arrLen];
			intArr = IntStream.range(0, arrLen).map(i->input.nextInt()).toArray();
			//khai báo và khởi tạo các biến trung gian
			final int[] finalIntArr = intArr;
			int[] tmp = new int[]{0};
			int totalSum = Arrays.stream(intArr).sum();
			//xử lí
			int result = IntStream.range(0, arrLen)
				.filter(i->{
					int rightSum = totalSum - tmp[0] - finalIntArr[i];
					int leftSum = tmp[0];
					tmp[0] += finalIntArr[i];
					return leftSum == rightSum;
				})
				.findFirst()
				.orElse(-2);
			//xuất kết quả
			System.out.println(result+1);
		}
	}
}
