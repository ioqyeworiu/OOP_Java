import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileIn fin1 = new FileIn("DATA1.in");
		FileIn fin2 = new FileIn("DATA2.in");
		
		Map<Integer, Integer> frequency = new TreeMap<Integer, Integer>();
		
		ArrayList<Integer> arr1 = fin1.getData();
		for (Integer e : arr1) {
			frequency.put(e.intValue(), frequency.getOrDefault(e.intValue(), 0) + 1);
		}
		
		ArrayList<Integer> arr2 = fin2.getData();
		for (Integer e : arr2) {
			frequency.put(e.intValue(), frequency.getOrDefault(e.intValue(), 0) + 1);
		}
		
		
		
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			if (i < 10) {
				SoThuanNghich so = new SoThuanNghich(entry.getKey());
				if (so.isSoThuanNghich() && so.isLe() && so.isLengthLe() && arr1.contains(entry.getKey()) && arr2.contains(entry.getKey())) {
					System.out.println(entry.getKey() + " " + entry.getValue());
					++i;
				}
			}
			else {
				break;
			}
		}
	}
}
