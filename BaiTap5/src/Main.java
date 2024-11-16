import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("DATA.in");
		ObjectInputStream obj = new ObjectInputStream(fin);
		ArrayList<String> arr = (ArrayList<String>) obj.readObject();
		Set<Integer> set = new TreeSet<Integer>();
		for(String s : arr) {
			StringTokenizer strt = new StringTokenizer(s);
			while(strt.hasMoreTokens()) {
				try {
					int so = Integer.parseInt(strt.nextToken());
					set.add(so);
				} catch (Exception e) {
					continue;
				}
			}
		}
		for(Integer i : set) {
			System.out.println(i);
		}
	}
}
