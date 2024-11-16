import java.util.LinkedList;
import java.util.Queue;

public class So {
	private int value;
	
	public So(int value) {
		this.value = value;
	}
	
	public Long soCanTim() {
		Queue<Long> queue = new LinkedList<Long>();
		queue.add((long) 9);
		while(true) {
			long cnt = queue.peek();
			if(cnt % value == 0) {
				return cnt;
			}
			else {
				queue.add(cnt*10);
				queue.add(cnt*10+9);
				queue.poll();
			}
		}
	}
}
