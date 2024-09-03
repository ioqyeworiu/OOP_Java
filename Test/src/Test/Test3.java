package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyValueMap = new HashMap<>();

        System.out.println("Nhập số lượng cặp key:value:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng sau nextInt()

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập key: ");
            String key = scanner.nextLine();

            System.out.print("Nhập value: ");
            int value = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng sau nextInt()

            keyValueMap.put(key, value);
        }

        // In kết quả
        keyValueMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

