import java.util.ArrayList;
import java.util.Collections;

public class DanhSachHoaDon {
	private ArrayList<HoaDon> dsHD;
	
	public DanhSachHoaDon(ArrayList<HoaDon> dsHD) {
		this.dsHD = dsHD;
	}
	
	public void sapXepThanhTienGiamDan() {
		dsHD.sort(Collections.reverseOrder());
	}
	
	@Override
	public String toString() {
		String s = "";
		for(HoaDon hd : dsHD) {
			s+=(hd+"\n");
		}
		return s;
	}
}