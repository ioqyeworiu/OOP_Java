import java.util.ArrayList;

public class DanhSachSinhVien {
	ArrayList<SinhVien> value;
	
	public DanhSachSinhVien(ArrayList<SinhVien> value) {
		this.value = value; 
	}
	
	public void sapXep() {
		value.sort((o1, o2) -> o1.compareTo(o2));
	}
	
	@Override
	public String toString() {
		String s = "";
		for(SinhVien sv : value) {
			s+= (sv.toString()+"\n");
		}
		return s;
	}
}
