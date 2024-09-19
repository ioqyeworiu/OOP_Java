import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		NhanVien nhanVien = new NhanVien(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine());
		System.out.println(nhanVien.toString());
	}
}
