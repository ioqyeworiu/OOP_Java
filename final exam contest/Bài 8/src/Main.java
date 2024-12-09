import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<String> list = new TreeSet<>();
        while (sc.hasNext()) {
            Pattern pattern = Pattern.compile("[0-2][0-3]:[0-5][0-9]:[0-5][0-9]");
            Matcher matcher = pattern.matcher(sc.next());
            while (matcher.find()) {
                list.add(matcher.group());
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
