import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		GiaoVien giaoVien = new GiaoVien(ip.nextLine(), ip.nextLine(), ip.nextDouble());
		System.out.println(giaoVien.toString());
	}
}
