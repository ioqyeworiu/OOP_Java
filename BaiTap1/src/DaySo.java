import java.util.ArrayList;

public class DaySo {
	private ArrayList<Integer> day;
	private int soPhanTu;
	
	public DaySo(int soPhanTu, ArrayList<Integer> day) {
		this.soPhanTu = soPhanTu;
		this.day = day;
	}
	
	public String tapGiao(DaySo o){ 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String s = "";
		for(Integer so1 : this.day) {
			if(o.day.contains(so1)&&!arr.contains(so1)) {
				arr.add(so1);
			}
		}
		arr.sort((o1, o2) -> Integer.compare(o1, o2));
		for(Integer e : arr) {
			s+=(e+" ");
		}
		return s;
	}
	
	public String tapHieu(DaySo o) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String s = "";
		for(Integer so1 : this.day) {
			if(!o.day.contains(so1)&&!arr.contains(so1)) {
				arr.add(so1);
			}
		}
		arr.sort((o1, o2) -> Integer.compare(o1, o2));
		for(Integer e : arr) {
			s+=(e+" ");
		}
		return s;
	}
}
