import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int query = sc.nextInt();
		while(query--!=0) {
			So so = new So(sc.nextInt());
			System.out.println(so.soCanTim());
		}
	}
}
