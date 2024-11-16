import java.util.ArrayList;
import java.util.HashMap;

public class DaySo {
	private int size;
	private ArrayList<Long> values;
	
	public DaySo(int size, ArrayList<Long> values) {
		this.size = size;
		this.values = values;
	}
	
	public long countTong(long sum) {
		HashMap<Long, Integer> map = new HashMap<>();
        long count = 0;

        for (Long num : values) {
            Long complement = sum - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;

	}
}
