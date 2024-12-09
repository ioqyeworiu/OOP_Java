import java.util.ArrayList;

public class DSSV {
    private ArrayList<SinhVien> giaTri;

    public DSSV(ArrayList<SinhVien> giaTri) {
        this.giaTri = giaTri;
    }

    public void sapXep() {
        this.giaTri.sort((o1, o2) -> o1.compareTo(o2));
    }

    @Override
    public String toString() {
        String s = "";
        for (SinhVien sv : giaTri) {
            s += (sv + "\n");
        }
        return s;
    }

}
