import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		SinhVien sinhVien = new SinhVien("B20DCCN001", input.nextLine(), input.nextLine(), input.nextLine(), input.nextFloat());
		System.out.println(sinhVien.toString());
	}
}
