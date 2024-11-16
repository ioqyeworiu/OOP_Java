
public class KhachHang {
	private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;
	
	public KhachHang(int maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
		this.maKH = "KH" + String.format("%03d", maKH);
		this.tenKH = tenKH;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public String getMaKH() {
		return maKH;
	}
	
	@Override 
	public String toString() {
		return tenKH + " " + diaChi + " ";
	}
}
