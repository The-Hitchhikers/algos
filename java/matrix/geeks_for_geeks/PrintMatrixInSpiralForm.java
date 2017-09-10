

/**
 * @author yuriitsap.
 */

/**
 * Works with NxN dimensional matrix.
 * http://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 * Doesn't includes edge case with las column/row.
 * v2 of this algo - works with NxM matrix and handles that edge case.
 */
public class PrintMatrixInSpiralForm {

    public void print(int[][] matrix) {
	int rows = matrix.length / 2;
	int firstRow = 0;
	int lastRow = matrix.length - 1;
	while (firstRow < rows && lastRow >= rows) {
	    int i = firstRow;
	    int j = lastRow;
	    while (i < lastRow) {
		System.out.print(matrix[firstRow][i] + " ");
		i++;
	    }
	    i = firstRow;
	    while (i < lastRow) {
		System.out.print(matrix[i][lastRow] + " ");
		i++;
	    }
	    while (j > firstRow) {
		System.out.print(matrix[lastRow][j] + " ");
		j--;
	    }
	    j = lastRow;
	    while (j > firstRow) {
		System.out.print(matrix[j][firstRow] + " ");
		j--;
	    }
	    firstRow++;
	    lastRow--;
	}
    }

    public static void main(String[] args) {
	new PrintMatrixInSpiralForm().print(new int[][]{
		{22, 23, 34, 10, 55},
		{42, 53, 64, 11, 44},
		{77, 88, 99, 66, 55},
		{72, 83, 94, 12, 33},
		{13, 14, 15, 16, 22}
	});
    }

}
