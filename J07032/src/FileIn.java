import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileIn {
	private File filein;
	
	public FileIn(String path) {
		this.filein = new File(path);
	}
	
	public ArrayList<Integer> getData() throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream(filein);
		ObjectInputStream obj = new ObjectInputStream(in);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
		obj.close();
		in.close();
		return arr;
	}
}
