

/**
 * @author yuriitsap.
 */

import java.util.Scanner;

/**
 * Works with NxM matrix.
 * http://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 */
public class PrintMatrixInSpiralFormV2 {

    public void print(int[][] matrix) {
	int rowStart = 0;
	int rowEnd = matrix[0].length - 1;
	int columnStart = 0;
	int columnEnd = matrix.length - 1;
	int rows = matrix.length / 2;
	int columns = matrix[0].length / 2;
	while (columnEnd >= rows && rowEnd >= columns) {
	    //first row
	    // edge case, we need to fully print the last row
	    rowEnd = columnEnd == columnStart ? rowEnd + 1 : rowEnd;
	    for (int i = rowStart; i < rowEnd; i++) {
		System.out.print(matrix[columnStart][i] + " ");
	    }
	    //first column
	    // edge case, we need to fully print the last column
	    columnEnd = rowEnd == rowStart ? columnEnd + 1 : columnEnd;
	    for (int j = columnStart; j < columnEnd; j++) {
		System.out.print(matrix[j][rowEnd] + " ");
	    }
	    //last row
	    if (columnStart != columnEnd) {
		for (int k = rowEnd; k > rowStart; k--) {
		    System.out.print(matrix[columnEnd][k] + " ");
		}
	    }

	    //last column
	    if (rowStart != rowEnd) {
		for (int l = columnEnd; l > columnStart; l--) {
		    System.out.print(matrix[l][rowStart] + " ");
		}
	    }
	    rowStart++;
	    rowEnd--;
	    columnStart++;
	    columnEnd--;
	}
    }

    public static void main(String[] args) {
	// geeks for geeks solution
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
	int matrixDimension = 4;
	int[][] matrix = new int[matrixDimension][matrixDimension];
	while (testCases > 0) {
	    //filing our awesome matrix
	    for (int i = 0; i < matrixDimension; i++) {
		for (int j = 0; j < matrixDimension; j++) {
		    matrix[i][j] = sc.nextInt();
		}

	    }
	    new PrintMatrixInSpiralFormV2().print(matrix);
	    testCases--;
	    System.out.println();
	}

	// own testcase
	/*new PrintMatrixInSpiralFormV2().print(new int[][]{
		{22, 23, 34, 10, 21, 22, 34, 22, 23, 34, 10, 21, 22, 34},
		{11, 53, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 22, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 33, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 44, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 55, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 66, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 32, 77, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34},
		{42, 53, 64, 11, 31, 32, 34, 22, 23, 34, 10, 21, 22, 34}
	});*/
    }

}
