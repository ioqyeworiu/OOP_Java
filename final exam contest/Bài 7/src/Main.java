import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- != 0) {
            int soPhanTu = sc.nextInt();
            Map<Integer, Integer> frequency = new LinkedHashMap<>();
            while (soPhanTu-- != 0) {
                int so = sc.nextInt();
                frequency.put(so, frequency.getOrDefault(so, 0) + 1);
            }
            ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(frequency.entrySet());
            list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
            for (Entry<Integer, Integer> entry : list) {
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println();
        }
    }
}
