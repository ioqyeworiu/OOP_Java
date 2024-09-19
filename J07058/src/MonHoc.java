
public class MonHoc implements Comparable<MonHoc>{
	private String maMon, tenMon, hinhThucThi;

	public MonHoc() {
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.hinhThucThi = hinhThucThi;
	}

	public void setMaMon(String st) {
		maMon = st;
	}
	
	public void setTenMon(String st) {
		tenMon = st;
	}
	
	public void setHinhThucThi(String st) {
		hinhThucThi = st;
	}

	@Override
	public String toString() {
		return maMon + " " + tenMon + " " + hinhThucThi;
	}

	@Override
	public int compareTo(MonHoc o) {
		return maMon.compareTo(o.maMon);
	}

}
