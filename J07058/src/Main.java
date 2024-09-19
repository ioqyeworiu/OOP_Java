import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\UNIVERSITY SUBJECTS\\Program in vscode\\Code ptit\\OOP\\J07058\\src\\MONHOC.in");
		Scanner ip = new Scanner(file);
		ArrayList<MonHoc> danhSachMon = new ArrayList<>();
		int k=0;
		while (ip.hasNextLine()) {
			if(k==1) {
				MonHoc monHoc = new MonHoc();
				for (int i = 0; i < 3; i++) {
					if (ip.hasNextLine()) {
						switch (i) {
						case 0:
							monHoc.setMaMon(ip.nextLine());
							break;
						case 1:
							monHoc.setTenMon(ip.nextLine());
							break;
						case 2:
							monHoc.setHinhThucThi(ip.nextLine());
							break;
						}
					}
				}
				danhSachMon.add(monHoc);
			}
			else {
				ip.nextLine();
				++k;
			}
		}
		
		danhSachMon.sort((o1, o2) -> o1.compareTo(o2));
		
		for(MonHoc monHoc:danhSachMon) {
			System.out.println(monHoc.toString());
		}
	}

}
