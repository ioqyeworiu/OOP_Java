import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.io.File;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fileIn = new FileInputStream(new File("DATA.in"));
		ObjectInputStream objects = new ObjectInputStream(fileIn);
		ArrayList<Integer> intList = (ArrayList<Integer>) objects.readObject();
		objects.close();
		Map<Integer, Integer> frequency = new TreeMap<Integer, Integer>();
		for (Integer num : intList) {
			int intNum = num.intValue();
			if (isPrime(num)) {
				frequency.put(intNum, frequency.getOrDefault(intNum, 0) + 1);
			}
		}
		frequency.entrySet().stream().skip(frequency.size()-10).sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}

	public static boolean isPrime(int num) {
		if (num == 1 || num == 0) {
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
