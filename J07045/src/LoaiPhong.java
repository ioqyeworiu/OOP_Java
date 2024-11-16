import java.util.StringTokenizer;

public class LoaiPhong implements Comparable<LoaiPhong>{
	private String loai, ten;
	private double giaNgay, phiPV;
	
	public LoaiPhong(String thongTinPhong) {
		StringTokenizer tokens = new StringTokenizer(thongTinPhong);
		loai = tokens.nextToken();
		ten = tokens.nextToken();
		giaNgay = Double.parseDouble(tokens.nextToken());
		phiPV = Double.parseDouble(tokens.nextToken());
	}
	
	@Override
	public String toString() {
		return loai + " " + ten + " " + String.format("%.0f", giaNgay) + " " + String.format("%.2f", phiPV);
	}

	@Override
	public int compareTo(LoaiPhong o) {
		return this.ten.compareTo(o.ten);
	}
}
