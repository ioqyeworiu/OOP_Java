import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("LUYENTAP.in");
		Scanner sc = new Scanner(f);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
		while(n--!=0) { 
			String ten = sc.nextLine();
			String s = sc.nextLine();
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			StringTokenizer strt = new StringTokenizer(s);
			while(strt.hasMoreTokens()) {
				arr1.add(Integer.parseInt(strt.nextToken()));
			}
			SinhVien sv = new SinhVien(ten, arr1.get(0), arr1.get(1));
			arr.add(sv);
		}
		DanhSachSV dssv = new DanhSachSV(arr);
		dssv.sapXep();
		System.out.println(dssv);
	}
}
