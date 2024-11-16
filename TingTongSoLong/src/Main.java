import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		FileIn fin = new FileIn("DATA.in");
		System.out.println(fin.tongCacSoLong());
	}
}
