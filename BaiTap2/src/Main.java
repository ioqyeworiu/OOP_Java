import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin1 = new FileInputStream("DATA1.in");
		FileInputStream fin2 = new FileInputStream("DATA2.in");
		ObjectInputStream obj1 = new ObjectInputStream(fin1);
		ObjectInputStream obj2 = new ObjectInputStream(fin2);
		ArrayList<String> arr1 = (ArrayList<String>) obj1.readObject();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();
		Set<String> ds1 = new TreeSet<String>();
		Set<Integer> ds2 = new TreeSet<Integer>();
		for(String s : arr1) {
			ds1.add(s);
		}
		for(Integer s : arr2) {
			ds2.add(s.intValue());
		}
		for(String s : ds1) {
			for(Integer i : ds2) {
				System.out.println(s+i);
			}
		}
	}
}
