import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("KHACH.in");
		Scanner sc = new Scanner(file);
		ArrayList<Khach> arr = new ArrayList<Khach>();
		DanhSachKH dskh = new DanhSachKH(arr);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String maKH, tenKH, maP, ngayDen, ngayDi;
			maKH = "KH" + String.format("%02d", i + 1);
			tenKH = sc.nextLine();
			maP = sc.nextLine();
			ngayDen = sc.nextLine();
			ngayDi = sc.nextLine();
			Khach khach = new Khach(maKH, tenKH, maP, ngayDen, ngayDi);
			arr.add(khach);
		}
		dskh.sapXepDS();
		System.out.println(dskh);
	}

}
