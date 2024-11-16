import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Khach implements Comparable<Khach>{
	String maKH, tenKH, maPhong, ngayDen, ngayDi;
	
	public Khach(String maKH, String tenKH, String maPhong, String ngayDen, String ngayDi) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
	}
	
	public long tinhSoNgayO() {
		LocalDate den = LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyy"));
		LocalDate di = LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyy"));
		return ChronoUnit.DAYS.between(den, di);
	}

	@Override
	public String toString() {
		return maKH + " " + tenKH + " " + maPhong + " " + tinhSoNgayO();
	}

	@Override
	public int compareTo(Khach o) {
		return (int) (this.tinhSoNgayO() - o.tinhSoNgayO());
	}
}
