import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TayDua implements Comparable<TayDua> {
    private String ma, ten, donVi, thoiDiemDenDich;
    private int vanToc;

    public TayDua(String ten, String donVi, String thoiDiemDenDich) {
        this.ma = "";
        this.ten = ten;
        this.donVi = donVi;
        this.thoiDiemDenDich = thoiDiemDenDich;
    }

    public void ganMa() {
        String[] temp = (donVi + " " + ten).split(" ");
        for (String s : temp) {
            ma += s.charAt(0);
        }
    }

    public void tinhVanToc() {
        int quangDuong = 120;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime thoiDiemBatDau = LocalTime.parse("6:00", formatter);
        LocalTime thoiDiemDienDich = LocalTime.parse(this.thoiDiemDenDich, formatter);
        Duration duration = Duration.between(thoiDiemBatDau, thoiDiemDienDich);
        float thoiGian = (float) Math.abs((duration.toMinutes() / 60.0));
        vanToc = Math.round(quangDuong / thoiGian);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + vanToc + " Km/h";
    }

    @Override
    public int compareTo(TayDua o) {
        return this.thoiDiemDenDich.compareTo(o.thoiDiemDenDich);
    }
}
