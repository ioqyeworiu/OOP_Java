
public class SoThuanNghich {
	private Integer so;
	
	public SoThuanNghich(Integer so) {
		this.so = so;
	}
	
	public boolean isSoThuanNghich() {
		String s1 = String.valueOf(so);
		StringBuilder s1_tmp = new StringBuilder(s1);
		String s2 = s1_tmp.reverse().toString();
		return s1.equals(s2);
	}
	
	public boolean isLe() {
		return String.valueOf(so).chars().allMatch(e -> Character.getNumericValue(e)%2==1);
	}
	
	public boolean isLengthLe() {
		int length = so.toString().length();
		return length%2==1 && length > 1;
	}
	
	public Integer intValue() {
		return so;
	}
}
