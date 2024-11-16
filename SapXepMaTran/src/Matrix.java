import java.util.Arrays;
import java.util.Collections;

public class Matrix {
	private int rows, cols;
	private int[][] value;

	public Matrix(int rows, int cols, int[][] value) {
		this.rows = rows;
		this.cols = cols;
		this.value = value;
	}
	
	public void sortColumn(int colIndex) {
        int[] column = new int[rows];
        for (int i = 0; i < rows; i++) {
            column[i] = this.value[i][colIndex];
        }
        Arrays.sort(column);
        for (int i = 0; i < rows; i++) {
            this.value[i][colIndex] = column[i];
        }
    }
	
	@Override
	public String toString() {
		String s = "";
		for(int[] row : value) {
			for(int num : row) {
				s += (num+" ");
			}
		}
		return s;
	}
}
