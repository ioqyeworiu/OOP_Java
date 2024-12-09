import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- != 0) {
            int i = Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    HoVaTen ten1 = new HoVaTen(sc.nextLine());
                    ten1.format();
                    System.out.println(ten1.convert1());
                    break;
                case 2:
                    HoVaTen ten2 = new HoVaTen(sc.nextLine());
                    ten2.format();
                    System.out.println(ten2.convert2());
                    break;
            }
        }
    }
}