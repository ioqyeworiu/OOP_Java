
public class ThiSinh {
	private String hoTen, ngaySinh, mon1, mon2, mon3;

	public ThiSinh(String hoTen, String ngaySinh, float mon1, float mon2, float mon3) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.mon1 = String.format("%.1f", mon1);
		this.mon2 = String.format("%.1f", mon2);
		this.mon3 = String.format("%.1f", mon3);
	}

	@Override
	public String toString() {
		return hoTen + " " + ngaySinh + " " + String.format("%.1f", tongDiem());
	}
	
	public Float tongDiem() {
		return Float.valueOf(mon1) + Float.valueOf(mon2) + Float.valueOf(mon3);
	}
}
