
public class NhanVien {
	private String maNv, hoTen, chucVu;
	private double luongCoBan;
	private int soNgayCong;

	public NhanVien(int maNv, String hoTen, double luongCoBan, int soNgayCong, String chucVu) {
		this.maNv = "NV" + String.format("%02d", maNv);
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}

	public double luongThang() {
		return luongCoBan * soNgayCong;
	}

	public double thuong() {
		if (soNgayCong >= 25) {
			return 0.2 * luongThang();
		} else if (soNgayCong >= 22 && soNgayCong < 25) {
			return 0.1 * luongThang();
		} else {
			return 0;
		}
	}

	public double phuCap() {
		switch (chucVu) {
		case "GD":
			return 250000;
		case "PGD":
			return 200000;
		case "TP":
			return 180000;
		case "NV":
			return 150000;
		}
		return 0;
	}

	public double thuNhap() {
		return luongThang() + thuong() + phuCap();
	}

	@Override
	public String toString() {
		return maNv + " " + hoTen + " " + String.format("%.0f", luongThang()) + " " + String.format("%.0f", thuong()) + " " + String.format("%.0f", phuCap()) + " " + String.format("%.0f", thuNhap());
	}

}
