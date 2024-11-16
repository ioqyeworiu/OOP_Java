import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("MONHOC.in");
		Scanner sc = new Scanner(f);
		Set<MonHoc> dsmh = new TreeSet<MonHoc>();
		while(sc.hasNextLine()) {
			dsmh.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		for(MonHoc mh : dsmh) {
			System.out.println(mh);
		}
	}
}
