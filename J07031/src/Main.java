import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Đọc dữ liệu từ file DATA1.in và DATA2.in
        ArrayList<Integer> data1 = readData("DATA1.in");
        ArrayList<Integer> data2 = readData("DATA2.in");

        // Tìm tất cả các số nguyên tố nhỏ hơn hoặc bằng 1,000,000
        boolean[] isPrime = sieveOfEratosthenes(1000000);

        // Lưu các số nguyên tố từ DATA1.in và DATA2.in vào HashSet
        Set<Integer> primesInData1 = new HashSet<>();
        Set<Integer> primesInData2 = new HashSet<>();
        for (int num : data1) {
            if (isPrime[num]) {
                primesInData1.add(num);
            }
        }
        for (int num : data2) {
            if (isPrime[num]) {
                primesInData2.add(num);
            }
        }

        // Tìm các cặp số thỏa mãn điều kiện
        ArrayList<int[]> pairs = new ArrayList<>();
        for (int n : primesInData1) {
            int m = 1000000 - n;
            if (primesInData1.contains(m) && n < m && !primesInData2.contains(n) &&!primesInData2.contains(m)) {
                pairs.add(new int[]{n, m});
            }
        }

        // Sắp xếp và in ra các cặp số
        pairs.sort(Comparator.comparingInt(a -> a[0]));
        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }

    private static ArrayList<Integer> readData(String fileName) throws IOException {
        ArrayList<Integer> data = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            data = (ArrayList<Integer>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
