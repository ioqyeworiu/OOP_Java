import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soGiamKhao = sc.nextInt();
		ArrayList<Double> arr = new ArrayList<>();
		for(int i=0; i<soGiamKhao; i++) {
			double diem = sc.nextDouble();
			arr.add(diem);
		}
		DanhSachGiamKhao ds1 = new DanhSachGiamKhao(soGiamKhao, arr);
		System.out.println(ds1.TinhDiemTrungBinh());
	}
}
