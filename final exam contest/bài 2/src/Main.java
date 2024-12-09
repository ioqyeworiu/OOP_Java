import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- != 0) {
            XauKiTu xauKiTu = new XauKiTu(sc.next());
            System.out.println(xauKiTu.solve());
        }
    }
}