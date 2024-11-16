import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tong = sc.nextInt();
		int loi = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<loi; i++) {
			arr.add(sc.nextInt());
		}
		
		Log lg = new Log(tong, loi, arr);
		lg.lietKeLoi();
	}
}
