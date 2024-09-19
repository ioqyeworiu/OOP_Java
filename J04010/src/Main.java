import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int ques = ip.nextInt();
		while(ques--!=0) {
			Point p1, p2, p3;
			p1 = new Point(ip.nextDouble(), ip.nextDouble());
			p2 = new Point(ip.nextDouble(), ip.nextDouble());
			p3 = new Point(ip.nextDouble(), ip.nextDouble());
			Triangle triangle = new Triangle(p1, p2, p3);
			if(triangle.isTriangle()) {
				System.out.println(triangle.toString());
			}
			else {
				System.out.println("INVALID");
			}
		}
	}
}
