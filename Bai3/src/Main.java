import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soCN = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan> dscn = new ArrayList<>();
        while (soCN-- != 0) {
            String maCN = sc.nextLine();
            String tenCN = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            CongNhan cn = new CongNhan(maCN, tenCN, gioVao, gioRa);
            dscn.add(cn);
        }
        dscn.sort((o1, o2) -> o1.compareTo(o2));
        for (CongNhan cn : dscn) {
            System.out.println(cn);
        }
        sc.close();
    }
}
