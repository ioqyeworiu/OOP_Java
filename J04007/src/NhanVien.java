
public class NhanVien {
	private String maNv, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKi;

	public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKi) {
		this.maNv = "00001";
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.maThue = maThue;
		this.diaChi = diaChi;
		this.ngayKi = ngayKi;
	}

	@Override
	public String toString() {
		return maNv + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maThue + " " + ngayKi;
	}
}
