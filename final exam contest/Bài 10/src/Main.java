import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soSinhVien = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        while (soSinhVien-- != 0) {
            dssv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        dssv.sort((s1, s2) -> s1.compareTo(s2));
        for (SinhVien sv : dssv) {
            System.out.println(sv);
        }
    }
}