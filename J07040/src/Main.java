import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		BFileIn bf = new BFileIn("NHIPHAN.in");
		TFileIn tf = new TFileIn("VANBAN.in");
		ArrayList<String> BArr = bf.getData();
		ArrayList<String> TArr = tf.getData();
		
		Map<String, Integer> fre = new LinkedHashMap<String, Integer>();
		for(String string : TArr) {
			if(BArr.contains(string)) {
				fre.put(string, fre.getOrDefault(string, 0)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : fre.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
}