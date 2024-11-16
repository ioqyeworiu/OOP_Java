import java.util.ArrayList;

public class DanhSachGiamKhao {
	private int soGiamKhao;
	private ArrayList<Double> list;

	public DanhSachGiamKhao(int soGiamKhao, ArrayList<Double> list) {
		this.soGiamKhao = soGiamKhao;
		this.list = list;
	}

	public String TinhDiemTrungBinh() {
		double max = -1;
		double min = 11;
		double diemTB = 0;
		int cnt = 0;
		for (int i = 0; i < this.list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			} else if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		for (Double diem : list) {
			double temp = diem.doubleValue();
			if (temp != max && temp != min) {
				diemTB += temp;
				++cnt;
			}
		}
		return String.format("%.2f", diemTB / cnt);
	}
}
