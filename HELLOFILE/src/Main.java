import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Hello.txt");
		Scanner ip = new Scanner(file);
		while(ip.hasNextLine()) {
			System.out.println(ip.nextLine());
		}
	}
}
