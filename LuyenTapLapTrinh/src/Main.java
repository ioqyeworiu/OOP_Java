import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\UNIVERSITY SUBJECTS\\Programming\\Code ptit\\OOP\\LuyenTapLapTrinh\\src\\LUYENTAP.in");
		Scanner sc = new Scanner(file);
		ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(n);
		while (n-- != 0) {
			try {
				SinhVien sv = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
				arr.add(sv);
				sc.nextLine();
			} catch (Exception e) {
				continue;
			}

		}
		DanhSachSinhVien ds = new DanhSachSinhVien(arr);
		ds.sapXep();
		System.out.println(ds.toString());
	}
}
