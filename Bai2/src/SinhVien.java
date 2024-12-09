public class SinhVien implements Comparable<SinhVien> {
    private String maSV, tenSV, lop, email, sdt;

    public SinhVien(String maSV, String tenSV, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + email + " " + '0' + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.lop.equals(o.lop)) {
            return this.maSV.compareTo(o.maSV);
        }
        return this.lop.compareTo(o.lop);
    }
}
