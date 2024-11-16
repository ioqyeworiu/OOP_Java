import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream("SONGUYEN.in");
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		ArrayList<Integer> arr = (ArrayList<Integer>) objectInput.readObject();
		Map<Integer, Integer> map = new TreeMap<>();
		for (Integer num : arr) {
			if (isPrime(num)) {
				map.put(num.intValue(), map.getOrDefault(num.intValue(), 0) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		fileInput.close();
	}

	public static boolean isPrime(Integer num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
