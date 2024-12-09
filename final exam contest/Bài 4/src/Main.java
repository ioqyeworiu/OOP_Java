import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- != 0) {
            String[] str = sc.nextLine().split(" ");
            String result = "";
            for (int i = str.length - 1; i >= 0; i--) {
                result += (str[i] + " ");
            }
            System.out.println(result.trim());
        }
    }
}
