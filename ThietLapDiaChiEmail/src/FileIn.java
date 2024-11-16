import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class FileIn {
	private File fin;
	
	public FileIn(String path) {
		this.fin = new File(path);
	}
	
	public void lietKe() throws FileNotFoundException {
		Scanner sc = new Scanner(fin);
		Map<String, Integer> danhSach = new LinkedHashMap<String, Integer>();
		while(sc.hasNextLine()) {
			String s = "";
			StringTokenizer strTok = new StringTokenizer(sc.nextLine());
			while(strTok.hasMoreTokens()) {
				s+= (strTok.nextToken().toLowerCase()+" ");
			}
			danhSach.put(s, danhSach.getOrDefault(s, 0)+1);
		}
		Map<String, Integer> danhDau = new TreeMap<String, Integer>();
		for(String ten : danhSach.keySet()) {
			String[] arr = ten.split(" ");
			danhDau.put(arr[arr.length-1], danhDau.getOrDefault(arr[arr.length-1], 0)+1);
			System.out.print(arr[arr.length-1]);
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i].charAt(0));
			}
			if(danhDau.get(arr[arr.length-1]) >= 2) {
				System.out.print(danhDau.get(arr[arr.length-1]));
			}
			System.out.println("@ptit.edu.vn");
		}
	}
}
