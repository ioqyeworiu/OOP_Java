import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SinhVien implements Comparable<SinhVien> {
    private String ten, gioVao, gioRa;
    private long thoiGianOnline;

    public SinhVien(String ten, String gioVao, String gioRa) {
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.thoiGianOnline = tinhThoiGianOnline();
    }

    public long tinhThoiGianOnline() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dt1 = LocalDateTime.parse(gioVao, formatter);
        LocalDateTime dt2 = LocalDateTime.parse(gioRa, formatter);
        Duration duration = Duration.between(dt1, dt2);
        return Math.abs(duration.toMinutes());
    }

    @Override
    public int compareTo(SinhVien o) {
        if (thoiGianOnline == o.thoiGianOnline) {
            return this.ten.compareTo(o.ten);
        }
        return Long.compare(o.thoiGianOnline, this.thoiGianOnline);
    }

    @Override
    public String toString() {
        return ten + " " + thoiGianOnline;
    }
}
