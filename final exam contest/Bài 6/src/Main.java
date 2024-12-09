import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau số N
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.println(minStepsToEqualStrings(strings));
    }

    private static String rotateString(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }

    private static String minStepsToEqualStrings(String[] strings) {
        int n = strings.length;
        int length = strings[0].length();
        int minSteps = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            String target = rotateString(strings[0], i);
            int totalSteps = i;
            boolean possible = true;

            for (int j = 1; j < n; j++) {
                boolean found = false;
                for (int k = 0; k < length; k++) {
                    if (rotateString(strings[j], k).equals(target)) {
                        totalSteps += k;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                minSteps = Math.min(minSteps, totalSteps);
            }
        }

        return minSteps == Integer.MAX_VALUE ? "-1" : String.valueOf(minSteps);
    }
}