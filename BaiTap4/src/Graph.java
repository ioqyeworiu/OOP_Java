
public class Graph {
	private int vertex;
	private int[][] value;
	
	public Graph(int vertex, int[][] value) {
		this.vertex = vertex;
		this.value = value;
	}
	
	public String convert() {
		String s = "";
		for(int i = 0; i<vertex-1; i++) {
			for(int j = i+1; j<vertex; j++) {
				if(value[i][j]==1) {
					Pair<Integer, Integer> p = new Pair<Integer, Integer>(i+1, j+1);
					s += (p + "\n");
				}
			}
		}
		return s;
	}
}
