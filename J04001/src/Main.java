import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ques = input.nextInt();
		for (int i = 0; i < ques; i++) {
			Point p1 = new Point(input.nextDouble(), input.nextDouble());
			Point p2 = new Point(input.nextDouble(), input.nextDouble());
			System.out.printf("%.4f\n", p1.distance(p2));
		}
	}

}
