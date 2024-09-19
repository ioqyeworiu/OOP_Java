
public class GiaoVien {
	private String maNgach, hoTen;
	private double luongCoBan;

	public GiaoVien(String maNgach, String hoTen, double luongCoBan) {
		this.maNgach = maNgach;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}

	public double tinhThuNhap() {
		double phuCap = 0;
		switch (maNgach.substring(0, 2)) {
		case "HT":
			phuCap = 2000000;
			break;
		case "HP":
			phuCap = 900000;
			break;
		case "GV":
			phuCap = 500000;
			break;
		}
		return luongCoBan * Double.valueOf(maNgach.substring(2, 4)) + phuCap;
	}

	@Override
	public String toString() {
		double phuCap = 0;
		switch (maNgach.substring(0, 2)) {
		case "HT":
			phuCap = 2000000;
			break;
		case "HP":
			phuCap = 900000;
			break;
		case "GV":
			phuCap = 500000;
			break;
		}
		return maNgach + " " + hoTen + " " + String.format("%.0f", Double.valueOf(maNgach.substring(2, 4))) + " "
				+ String.format("%.0f", phuCap) + " " + String.format("%.0f", this.tinhThuNhap());
	}
}
