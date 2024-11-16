import java.util.ArrayList;
import java.util.Collections;

public class DanhSachSV {
	private ArrayList<SinhVien> value;
	
	public DanhSachSV(ArrayList<SinhVien> value) {
		this.value = value;
	}
	
	public void sapXep() {
		value.sort(Collections.reverseOrder());
	}
	
	@Override
	public String toString() {
		String s="";
		for(SinhVien sv : value) {
			s+=(sv+"\n");
		}
		return s;
	}
}
