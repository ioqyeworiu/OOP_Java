
public class SinhVien implements Comparable<SinhVien>{
	private String tenSV;
	private int dung, nop;
	
	public SinhVien(String tenSV, int dung, int nop) {
		this.tenSV = tenSV;
		this.dung = dung;
		this.nop = nop;
	}
	
	@Override
	public String toString() {
		return tenSV + " " + dung + " " + nop;
	}

	@Override
	public int compareTo(SinhVien o) {
		if(this.dung==o.dung) {
			return o.nop- this.nop;
		}
		else if(this.nop == o.nop){
			return this.tenSV.compareTo(o.tenSV);
		}
		return this.dung - o.dung;
	}
}
