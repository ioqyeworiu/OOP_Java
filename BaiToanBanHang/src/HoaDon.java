
public class HoaDon {
	private String maHD;
	private KhachHang kh;
	private MatHang mh;
	private int soLuong;
	
	public HoaDon(int maHD, KhachHang kh, MatHang mh, int soLuong) {
		this.maHD = "HD" + String.format("%03d", maHD);
		this.kh = kh;
		this.mh = mh;
		this.soLuong = soLuong;
	}
	
	public void setKH(KhachHang kh) {
		this.kh = kh;
	}
	
	public void setMH(MatHang mh) {
		this.mh = mh;
	}

	@Override 
	public String toString() {
		return maHD + " " + kh + mh + soLuong + " " + this.mh.gia()*soLuong; 
	}
}
