import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fileIS = new FileInputStream("DATA.IN");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		byte[] bytes = new byte[4];
		int i = -1;
		while ((i = fileIS.read(bytes)) > 0) {
//			int num = ((bytes[0] & 0xFF) << 24) | ((bytes[1] & 0xFF) << 16) |
//                    ((bytes[2] & 0xFF) << 8) | (bytes[3] & 0xFF);
			ByteBuffer buf = ByteBuffer.wrap(bytes);
			int num = buf.getInt();
			map.put(num , map.getOrDefault(num , 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		fileIS.close();
	}
}
