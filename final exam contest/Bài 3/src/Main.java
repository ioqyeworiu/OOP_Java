import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- != 0) {
            long maxPrime = -1;
            // loại bỏ hết các ước số chẵn trong num
            long num = sc.nextLong();
            while (num % 2 == 0) {
                maxPrime = 2;
                num /= 2;
            }
            // loại bỏ các ước số lẻ từ 3 trở đi trong num
            int sqrt = (int) Math.sqrt(num) + 1;
            for (int i = 3; i <= sqrt; i += 2) {
                while (num % i == 0) {
                    maxPrime = i;
                    num /= i;
                }
            }
            // nếu sau khi loại bỏ các ước số mà num vẫn lớn hơn 2 thì num chính là ước
            // nguyên tố lớn nhất
            if (num > 2) {
                maxPrime = num;
            }
            System.out.println(maxPrime);
        }
    }
}
