import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        while (sc.hasNext()) {
            String temp = sc.next();
            result = (temp.length() > result.length() ? temp : result);
        }
        System.out.println(result + " - " + result.length());
    }
}

// kết thúc luồng đâu vào khi:
// trên window: nhấn ctrl + Z
// trên linux/Unix/Mac : nhấn ctrl + D