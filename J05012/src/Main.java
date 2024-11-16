import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soDonHang = Integer.parseInt(sc.nextLine());
		ArrayList<HoaDon> arr = new ArrayList<HoaDon>();
		for(int i=1; i<=soDonHang; i++) {
			String maMH = sc.nextLine();
			String tenMH = sc.nextLine();
			int soLuong = Integer.parseInt(sc.nextLine());
			long donGia = Long.parseLong(sc.nextLine());
			long chietKhau = Long.parseLong(sc.nextLine());
			arr.add(new HoaDon(new MatHang(maMH, tenMH, donGia), soLuong, chietKhau));
		}
		DanhSachHoaDon dshd = new DanhSachHoaDon(arr);
		dshd.sapXepThanhTienGiamDan();
		System.out.println(dshd);
	}
}