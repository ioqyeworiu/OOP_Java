
public class MatHang {
	private String maMH, tenMH;
	private long donGia;
	
	public MatHang(String maMH, String tenMH, long donGia) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.donGia = donGia;
	}
	
	public String getMaMH() {
		return maMH;
	}
	
	public String getTenMH() {
		return tenMH;
	}
	
	public long getDonGia() {
		return donGia;
	}
}