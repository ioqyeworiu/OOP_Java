
public class MatHang implements Comparable<MatHang>{
	private String maMH, tenMH, donVi;
	private int giaMua, giaBan;
	
	public MatHang(int maMH, String tenMH, String donVi, int giaMua, int giaBan) {
		this.maMH = String.format("MH%03d", maMH);
		this.tenMH = tenMH;
		this.donVi = donVi;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
	}
	
	public int tinhLoiNhuan() {
		return giaBan - giaMua;
	}

	@Override
	public int compareTo(MatHang o) {
		if(this.tinhLoiNhuan() == o.tinhLoiNhuan()) {
			return o.maMH.compareTo(this.maMH);
		}
		return this.tinhLoiNhuan()-o.tinhLoiNhuan();
	}
	
	@Override
	public String toString() {
		return maMH + " " + tenMH + " " + donVi + " " + giaMua + " " + giaBan + " " + tinhLoiNhuan();
	}
	
}
