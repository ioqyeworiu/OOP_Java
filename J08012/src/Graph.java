import java.util.Map;
import java.util.Set;

public class Graph {
	private int soDinh;
	private Map<Integer, Set<Integer>> dsCanh;
	
	public Graph(int soDinh, Map<Integer, Set<Integer>> dsCanh) {
		this.soDinh = soDinh;
		this.dsCanh = dsCanh;
	}
	
	public boolean isStarGraph() {
		int cnt = 0;
		for(Map.Entry<Integer, Set<Integer>> entry : dsCanh.entrySet()) {
			if(cnt > 1) {
				return false;
			}
			if(entry.getValue().size() == soDinh-1) {
				++cnt;
			}
		}
		if(cnt == 0) {
			return false;
		}
		return true;
	}
}
