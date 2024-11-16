
public class SinhVien implements Comparable<SinhVien>{
	private String ten;
	private int baiDung, submit;
	
	public SinhVien(String ten, int baiDung, int submit) {
		this.ten = ten;
		this.baiDung =baiDung;
		this.submit = submit;
	}
	
	@Override
	public String toString() {
		return ten + " " + baiDung + " " + submit;
	}

	@Override
	public int compareTo(SinhVien o) {
		if(this.baiDung != o.baiDung) {
			return this.baiDung - o.baiDung;
		}
		else if(this.submit!=o.submit) {
			return this.submit - o.submit;
		}
		else {
			return this.ten.compareTo(o.ten);
		}
	}
	
}
