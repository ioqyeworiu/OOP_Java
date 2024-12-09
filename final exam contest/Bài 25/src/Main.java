import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File(
                "E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\final exam contest\\Bài 25\\src\\SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File(
                "E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\final exam contest\\Bài 25\\src\\DANGKY.in"));
        Scanner sc3 = new Scanner(new File(
                "E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\final exam contest\\Bài 25\\src\\TRUYVAN.in"));

        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<MaDangKi> dsdk = new ArrayList<>();
        ArrayList<MaTruyVan> dstv = new ArrayList<>();

        int soSV = Integer.parseInt(sc1.nextLine());
        while (sc1.hasNextLine()) {
            dssv.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(),
                    sc1.nextLine()));
        }

        while (sc2.hasNextLine()) {
            dsdk.add(new MaDangKi(sc2.next(), sc2.next()));
        }

        int soTruyVan = Integer.parseInt(sc3.nextLine());
        while (sc3.hasNextLine()) {
            dstv.add(new MaTruyVan(sc3.next(), sc3.next()));
        }

        for (MaTruyVan tv : dstv) {
            System.out.println("DANH SACH SINH VIEN " + tv.getGioiTinh() + " DANG KY SIZE " + tv.getSizeAo());
            for (SinhVien sv : dssv) {
                if (tv.getGioiTinh().equals(sv.getGioiTinh())) {
                    for (MaDangKi dk : dsdk) {
                        if (dk.getSizeAo().equals(tv.getSizeAo()) && sv.getMaSV().equals(dk.getMaSV())) {
                            System.out.println(sv);
                            break;
                        }
                    }
                }
            }
        }
    }
}
