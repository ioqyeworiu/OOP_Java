import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TFileIn {
	private File fileIn;
	
	public TFileIn(String path) {
		this.fileIn = new File(path);
	}
	
	public ArrayList<String> getData() throws FileNotFoundException{
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(fileIn);
		while(sc.hasNext()) {
			arr.add(sc.next().toLowerCase());
		}
		sc.close();
		return arr;
	}
}
