import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File KHin = new File("KH.in");
		File MHin = new File("MH.in");
		File HDin = new File("HD.in");
		Scanner scKH = new Scanner(KHin);
		Scanner scMH = new Scanner(MHin);
		Scanner scHD = new Scanner(HDin);
		
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		ArrayList<MatHang> dsMH = new ArrayList<MatHang>();
		
		int soLuongKH = Integer.parseInt(scKH.nextLine());
		for(int i=0; i<soLuongKH; i++) {
			KhachHang kh = new KhachHang(i+1, scKH.nextLine(), scKH.nextLine(), scKH.nextLine(), scKH.nextLine());
			dsKH.add(kh);
		}
		
		int soLuongMH = Integer.parseInt(scMH.nextLine());
		for(int i=0; i<soLuongMH; i++) {
			MatHang mh = new MatHang(i+1, scMH.nextLine(), scMH.nextLine(), scMH.nextLine(), scMH.nextLine());
			dsMH.add(mh);
		}
		
		int soLuongHD = scHD.nextInt();
		for(int i=0; i<soLuongHD; i++) {
			String maKH = scHD.next();
			String maMH = scHD.next();
			int soLuong = Integer.parseInt(scHD.next());
			HoaDon hd = new HoaDon(i+1, null, null, soLuong);
			for(KhachHang kh:dsKH) {
				if(maKH.equals(kh.getMaKH())) {
					hd.setKH(kh);
					break;
				}
			}
			for(MatHang mh:dsMH) {
				if(maMH.equals(mh.getMaMH())) {
					hd.setMH(mh);
					break;
				}
			}
			System.out.println(hd);
		}
	}
}
