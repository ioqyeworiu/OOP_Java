import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String id, ten, lop, ngaySinh, gpa;

	public SinhVien(String id, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.id=id;
		this.ten=ten;
		this.lop=lop;
		this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(date);
		this.gpa=String.format("%.2f", gpa);
	}
	
	@Override
	public String toString() {
		return id + " " + ten + " " + lop + " " + ngaySinh + " " + gpa;
	}
}
