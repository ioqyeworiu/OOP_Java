
public class HoaDon implements Comparable<HoaDon>{
	private MatHang mh;
	private int soLuong;
	private long chietKhau;
	
	public HoaDon(MatHang mh, int soLuong, long chietKhau) {
		this.mh = mh;
		this.soLuong = soLuong;
		this.chietKhau = chietKhau;
	}
	
	public long thanhTien() {
		return mh.getDonGia()*soLuong-chietKhau;
	}
	
	@Override
	public String toString() {
		return mh.getMaMH() + " " + mh.getTenMH() + " " + soLuong + " " + mh.getDonGia() + " " + chietKhau + " " + thanhTien(); 
	}

	@Override
	public int compareTo(HoaDon o) {
		return Long.compare(this.thanhTien(), o.thanhTien());
	}
	
}