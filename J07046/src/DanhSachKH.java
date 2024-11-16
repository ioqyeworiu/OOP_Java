import java.util.ArrayList;
import java.util.Collections;

public class DanhSachKH {
	private ArrayList<Khach> giaTri;

	public DanhSachKH(ArrayList<Khach> arr) {
		this.giaTri = arr;
	}

	public void sapXepDS() {
		Collections.sort(giaTri, Collections.reverseOrder());
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < giaTri.size(); i++) {
			s += giaTri.get(i) + "\n";
		}
		return s;
	}
}
