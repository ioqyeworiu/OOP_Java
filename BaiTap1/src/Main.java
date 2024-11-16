import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT1 = sc.nextInt();
		int soPT2 = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i=0; i<soPT1; i++) {
			arr1.add(sc.nextInt());
		}
		for(int i=0; i<soPT2; i++) {
			arr2.add(sc.nextInt());
		}
		DaySo ds1 = new DaySo(soPT1, arr1);
		DaySo ds2 = new DaySo(soPT2, arr2);
		System.out.println(ds1.tapGiao(ds2));
		System.out.println(ds1.tapHieu(ds2));
		System.out.println(ds2.tapHieu(ds1));
	}
}
