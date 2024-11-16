import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner sc = new Scanner(new File("E:\\UNIVERSITY SUBJECTS\\Program in vscode\\Code ptit\\OOP\\J07010\\src\\SV.in"));
		ArrayList<SinhVien> arrLis = new ArrayList<SinhVien>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=n; i++) {
			SinhVien sinhVien = new SinhVien(String.format("B20DCCN%03d", i), sc.nextLine(), sc.nextLine(), new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine())), String.format("%.2f", Double.parseDouble(sc.nextLine())));
			arrLis.add(sinhVien);
		}
		
		for(SinhVien sv:arrLis) {
			System.out.println(sv.toString());
		}
	}
}