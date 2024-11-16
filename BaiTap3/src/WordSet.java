import java.util.ArrayList;
import java.util.StringTokenizer;

public class WordSet {
	private String value;
	
	public WordSet(String value) {
		this.value = value;
	}
	
	public ArrayList<String> toArrayList(String s) {
		StringTokenizer stt = new StringTokenizer(s);
		ArrayList<String> arr = new ArrayList<String>();
		while(stt.hasMoreTokens()) {
			arr.add(stt.nextToken());
		}
		return arr;
	}

	public char[] union(WordSet s2) {
		String s = (this.value + " " + s2.value).toLowerCase();
		ArrayList<String> arr = toArrayList(s);
		ArrayList<String> arr1 = new ArrayList<String>();
		s = "";
		arr.stream().distinct().sorted((o1, o2) -> o1.compareTo(o2)).forEach(e->arr1.add(e));
		for(String str : arr1) {
			s+=(str + " ");
		}
		return s.toCharArray();
	}

	public char[] intersection(WordSet s2) {
		String s = "";
		String ss1 = this.value.toLowerCase();
		String ss2 = s2.value.toLowerCase();
		ArrayList<String> arr1 = toArrayList(ss1);
		ArrayList<String> arr2 = toArrayList(ss2);
		ArrayList<String> temp1 = new ArrayList<String>();
		ArrayList<String> temp2 = new ArrayList<String>();
		arr1.stream().distinct().sorted((o1, o2) -> o1.compareTo(o2)).forEach(e->temp1.add(e));
		arr2.stream().distinct().sorted((o1, o2) -> o1.compareTo(o2)).forEach(e->temp2.add(e));
		for(String e1 : temp1) {
			for(String e2 : temp2) {
				if(e1.equals(e2)) {
					s+=(e1 + " ");
					break;
				}
			}
		}
		return s.toCharArray();
	}
	
}
