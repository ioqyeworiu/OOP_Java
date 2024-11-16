import java.util.ArrayList;
import java.util.Collections;

public class DanhSachMatHang {
	private ArrayList<MatHang> dsMH;
	
	public DanhSachMatHang(ArrayList<MatHang> dsMH) {
		this.dsMH = dsMH;
	}
	
	public void sapXepLoiNhuanGiamDan() {
		dsMH.sort(Collections.reverseOrder());
	}
	
	@Override 
	public String toString() {
		String s = "";
		for(MatHang mh : dsMH) {
			s+=(mh+"\n");
		}
		return s;
	}
}
