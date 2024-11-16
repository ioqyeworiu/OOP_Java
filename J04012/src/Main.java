import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		NhanVien nhanVien = new NhanVien(1, ip.nextLine(), Double.parseDouble(ip.nextLine()) , Integer.parseInt(ip.nextLine()), ip.nextLine());
		System.out.println(nhanVien.toString());
	}

}
