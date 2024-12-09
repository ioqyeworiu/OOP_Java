import java.time.Duration;
import java.time.LocalTime;

public class CongNhan implements Comparable<CongNhan> {
    private String maCN, tenCN, gioVao, gioRa;

    public CongNhan(String maCN, String tenCN, String gioVao, String gioRa) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public String tinhThoiGianLam() {
        LocalTime vao = LocalTime.parse(gioVao);
        LocalTime ra = LocalTime.parse(gioRa);
        Long gio, phut;
        String kiemTra;
        Duration duration = Duration.between(vao, ra);
        gio = Math.abs(duration.toHours() - 1);
        phut = Math.abs(duration.toMinutes() - 60) % 60;
        if (gio >= 8) {
            kiemTra = "DU";
        } else {
            kiemTra = "THIEU";
        }
        return gio + " gio " + phut + " phut " + kiemTra;
    }

    @Override
    public String toString() {
        return maCN + " " + tenCN + " " + tinhThoiGianLam();
    }

    @Override
    public int compareTo(CongNhan o) {
        if (this.tinhThoiGianLam().equals(o.tinhThoiGianLam())) {
            return this.maCN.compareTo(o.maCN);
        }
        return o.tinhThoiGianLam().compareTo(this.tinhThoiGianLam());
    }
}
