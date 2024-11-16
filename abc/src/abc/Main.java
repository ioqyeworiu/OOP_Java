package abc;

import java.io.*;
import java.util.*;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			// Đọc ArrayList<Integer> từ file nhị phân
			FileInputStream fileIn = new FileInputStream("DAYSO.DAT");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			ArrayList<Integer> numbers = (ArrayList<Integer>) objectIn.readObject();
			objectIn.close();
			fileIn.close();

			// Tạo một Set để lưu các số nguyên tố khác nhau
			Set<Integer> primeSet = new TreeSet<>();

			// Kiểm tra và thêm các số nguyên tố có từ 3 chữ số trở lên vào Set
			for (Integer number : numbers) {
				if (isPrime(number) && number >= 100) {
					primeSet.add(number);
				}
			}
			
			for (Integer i : primeSet) {
				System.out.println(i);
			}
			// Ghi các số nguyên tố ra file
//			FileWriter fileWriter = new FileWriter("output.txt");
//			for (Integer prime : primeSet) {
//				fileWriter.write(prime + "\n");
//			}
//			fileWriter.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Hàm kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

}
