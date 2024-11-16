import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BFileIn {
	private File fileIn;
	
	public BFileIn(String path) {
		this.fileIn = new File(path);
	}
	
	public ArrayList<String> getData() throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream(fileIn);
		ObjectInputStream obj = new ObjectInputStream(fin);
		ArrayList<String> arr = (ArrayList<String>) obj.readObject();
		ArrayList<String> arr2 = new ArrayList<String>();

		for(String string : arr) {
			StringTokenizer tokens = new StringTokenizer(string);
			while(tokens.hasMoreTokens()) {
				arr2.add(tokens.nextToken().toLowerCase());
			}
		}
		
		obj.close();
		fin.close();
		return arr2;
	}
}
