
public class MatHang {
	private String maMH, tenMH, donVi;
	private int giaMua, giaBan;
	
	public MatHang(int maMH, String tenMH, String donVi, String giaMua, String giaBan) {
		this.maMH = "MH" + String.format("%03d", maMH);
		this.tenMH = tenMH;
		this.donVi = donVi;
		this.giaMua = Integer.parseInt(giaMua);
		this.giaBan = Integer.parseInt(giaBan);
	}
	
	public String getMaMH() {
		return maMH;
	}
	
	public int gia() {
		return giaBan;
	}
	
	@Override
	public String toString() {
		return tenMH + " " + donVi + " " + giaMua + " " + giaBan + " ";
	}
}
