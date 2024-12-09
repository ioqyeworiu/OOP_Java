import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fin = new File("DANHSACH.in");
        Scanner sc = new Scanner(fin);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        while (sc.hasNextLine()) {
            dssv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        DSSV dssv2 = new DSSV(dssv);
        dssv2.sapXep();
        System.out.println(dssv2);
    }
}