import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileIn {
	private File value;

	public FileIn(String path) {
		this.value = new File(path);
	}
	
	public void lietKeNhiPhan() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream(value);
		ObjectInputStream obj = new ObjectInputStream(fin);
		ArrayList<String> arr = (ArrayList<String>) obj.readObject();
		for(String str : arr) {
			String s = "";
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='0' || str.charAt(i)=='1') {
					s+=str.charAt(i);
				}
			}
			System.out.print(s + " ");
			long num = 0;
			for(int i = s.length()-1; i>=0; i--) {
				num += (Character.getNumericValue(s.charAt(i))* Math.pow(2, s.length()-i-1));
			}
			System.out.println(num);
		}
	}
	
}
