
public class SinhVien {
	String maSV, hoTen, ngaySinh, lop, gpa;

	public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, String gpa) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.gpa=gpa;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + gpa;
	}

}