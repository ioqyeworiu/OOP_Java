import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FileIn {
	private File fin;
	
	public FileIn(String path) {
		this.fin = new File(path);
	}
	
	public void lietKe() {
		try {
			// Đọc ArrayList<Integer> từ file nhị phân
			FileInputStream fileIn = new FileInputStream(fin);
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
