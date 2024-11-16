import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soMatHang =Integer.parseInt(sc.nextLine());
		ArrayList<MatHang> arr = new ArrayList<MatHang>();
		for(int i=1; i<=soMatHang; i++) {
			arr.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		DanhSachMatHang dsmh = new DanhSachMatHang(arr);
		dsmh.sapXepLoiNhuanGiamDan();
		System.out.println(dsmh);
	}
}
