import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soTayDua = Integer.parseInt(sc.nextLine());
        ArrayList<TayDua> dstd = new ArrayList<>();
        while (soTayDua-- != 0) {
            TayDua td = new TayDua(sc.nextLine(), sc.nextLine(), sc.nextLine());
            td.ganMa();
            td.tinhVanToc();
            dstd.add(td);
        }
        dstd.sort((o1, o2) -> o1.compareTo(o2));
        for (TayDua td : dstd) {
            System.out.println(td);
        }
    }
}
