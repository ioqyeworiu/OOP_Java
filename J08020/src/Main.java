import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int query = Integer.parseInt(sc.nextLine());
		while(query--!=0) {
			DayNgoac dayNgoac = new DayNgoac(sc.nextLine());
			System.out.println(dayNgoac.isTrueString()?"YES":"NO");
		}
	}
}
