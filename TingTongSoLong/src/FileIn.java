import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIn {
	private File value;

	public FileIn(String path) {
		this.value = new File(path);
	}

	public Long tongCacSoLong() throws FileNotFoundException {
		long l = (long) 0;
		Scanner sc = new Scanner(value);
		while (sc.hasNext())
			try {
				long num = Long.parseLong(sc.next());
				if (num > Integer.MAX_VALUE) {
					l += (num);
				}
			} catch (Exception e) {
				continue;
			}
		return l;
	}
}
