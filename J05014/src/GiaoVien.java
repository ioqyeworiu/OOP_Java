public class GiaoVien implements Comparable<GiaoVien> {
    private String maXetTuyen, maGV, ten;
    private float diemTin, diemBoMon;
    private String boMon;
    private String tongDiem;
    private String ketQuaXetTuyen;

    public GiaoVien(int maGV, String ten, String maXetTuyen, float diemTin, float diemBoMon) {
        this.maGV = String.format("GV%02d", maGV);
        this.maXetTuyen = maXetTuyen;
        this.ten = ten;
        this.diemTin = diemTin;
        this.diemBoMon = diemBoMon;
    }

    public void tinhDiemTong() {
        char chiSoUuTien = maXetTuyen.charAt(1);
        float tong = (diemTin * 2) + diemBoMon;
        if (chiSoUuTien == '1') {
            tong += 2;
        } else if (chiSoUuTien == '2') {
            tong += 1.5;
        } else if (chiSoUuTien == '3') {
            tong += 1.0;
        }
        tongDiem = String.format("%.1f", tong);
    }

    public void xetTuyen() {
        if (Float.parseFloat(tongDiem) >= 18) {
            ketQuaXetTuyen = "TRUNG TUYEN";
        } else {
            ketQuaXetTuyen = "LOAI";
        }
    }

    public void chiaBoMon() {
        char maMon = maXetTuyen.charAt(0);
        if (maMon == 'A') {
            boMon = "TOAN";
        } else if (maMon == 'B') {
            boMon = "LY";
        } else if (maMon == 'C') {
            boMon = "HOA";
        }
    }

    @Override
    public String toString() {
        return maGV + " " + ten + " " + boMon + " " + tongDiem + " " + ketQuaXetTuyen;
    }

    @Override
    public int compareTo(GiaoVien o) {
        // if (this.tongDiem.equals(o.tongDiem)) {
        // return this.maGV.compareTo(o.maGV);
        // }
        return Float.compare(Float.parseFloat(o.tongDiem), Float.parseFloat(this.tongDiem));
    }

}