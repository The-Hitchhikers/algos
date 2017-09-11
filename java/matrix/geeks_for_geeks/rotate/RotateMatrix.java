

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/rotate-by-90-degree/0
 */

public class RotateMatrixV2 {

    public int[][] rotate(int[][] matrix) {
	int columnStart = 0;
	int columnEnd = matrix.length - 1;
	int columns = matrix.length / 2;
	while (columnStart < columns) {
	    int tmp;
	    for (int i = columnStart; i < columnEnd - columnStart; i++) {
		tmp = matrix[columnStart][i];
		matrix[columnStart][i] = matrix[columnEnd - i][columnStart];
		matrix[columnEnd - i][columnStart] = matrix[columnEnd - columnStart][columnEnd - i];
		matrix[columnEnd - columnStart][columnEnd - i] = matrix[i][columnEnd - columnStart];
		matrix[i][columnEnd - columnStart] = tmp;
	    }
	    columnStart++;
	}
	return matrix;
    }

    public static void main(String[] args) {
	int[][] rotatedMatrix = new RotateMatrixV2().rotate(new int[][]{
		{1, 2, 3, 4},
		{6, 5, 4, 3},
		{4, 5, 6, 3},
		{3, 2, 1, 4}
	});
    }

}
