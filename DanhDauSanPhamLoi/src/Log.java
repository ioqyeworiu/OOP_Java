import java.util.ArrayList;

public class Log {
	private int tongSanPham, SoSanPhamLoi;
	private ArrayList<Integer> danhSachLoi;
	
	public Log(int tong, int loi, ArrayList<Integer> dsLoi) {
		this.tongSanPham = tong;
		this.SoSanPhamLoi = loi;
		this.danhSachLoi = dsLoi;
	}
	
	public ArrayList<Integer> DanhSachDung() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=tongSanPham-1; i++) {
			if(!danhSachLoi.contains(i)) {
				arr.add(i);
			}
		}
		return arr;
	}
	
	public void lietKeLoi() {
		String s = "Errors: ";
		int dau = danhSachLoi.get(0);
		int j = 1;
		for(int i=1; i<danhSachLoi.size(); i++) {
			if(dau + j == danhSachLoi.get(danhSachLoi.size()-1)) {
				s+="and ";
			}
			if(dau + j != danhSachLoi.get(i)) {
				s += (dau);
				--i;
				if(dau != danhSachLoi.get(i)) {
					s += ("-" + danhSachLoi.get(i));
				}
				s += ", ";
				if( i + 1< danhSachLoi.size()) {
					dau = danhSachLoi.get(i+1);
				}
				j=1;
			}
			else {
				++j;
			}
		}
		System.out.println(s);
	}
	
}
