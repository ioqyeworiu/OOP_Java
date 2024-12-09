public class SinhVien {
    private String maSV, tenSV, lopSV, emailSV, sdtSV, gioiTinh;

    public SinhVien(String maSV, String tenSV, String lopSV, String emailSV, String sdtSV, String gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.emailSV = emailSV;
        this.sdtSV = sdtSV;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + emailSV + " " + sdtSV;
    }
}
