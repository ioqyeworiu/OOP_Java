import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rect = new Rectangle(input.nextInt(), input.nextInt(), input.nextLine());
		if(rect.isRect()) {
			System.out.println(rect.perimeter() + " " + rect.area() + " " + rect.getColor());
		}
		else {
			System.out.println("INVALID");
		}
	}
}
