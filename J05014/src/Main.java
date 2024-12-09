import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soGV = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> dsgv = new ArrayList<>();
        for (int i = 1; i <= soGV; i++) {
            GiaoVien gv = new GiaoVien(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                    Float.parseFloat(sc.nextLine()));
            gv.tinhDiemTong();
            gv.xetTuyen();
            gv.chiaBoMon();
            dsgv.add(gv);
        }
        dsgv.sort((o1, o2) -> o1.compareTo(o2));
        for (GiaoVien gv : dsgv) {
            System.out.println(gv);
        }
    }
}
