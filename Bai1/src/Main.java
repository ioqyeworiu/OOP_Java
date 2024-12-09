import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("DATA.in");
        ObjectInputStream obj = new ObjectInputStream(fin);
        ArrayList<String> lis = (ArrayList<String>) obj.readObject();
        Set<Integer> set = new TreeSet<>();
        for (String str : lis) {
            for (String str2 : str.split(" ")) {
                try {
                    set.add(Integer.parseInt(str2));
                } catch (Exception e) {
                    continue;
                    // TODO: handle exception
                }
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
