

import java.util.Scanner;

/**
 * @author yuriitsap.
 */
/**
 * An old attempt to implement BFS.
 * http://practice.geeksforgeeks.org/problems/x-total-shapes/0
 * original problem was solved but not optimal.
 */

class GFG_Brute_Force {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int o = sc.nextInt();
	for (int i = 0; i < o; i++) {
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    char[][] ar = new char[n][m];
	    for (int j = 0; j < n; j++) {
		char[] ca = sc.next().toCharArray();
		for (int k = 0; k < m; k++) {
		    ar[j][k] = ca[k];
		}
	    }
	    System.out.println(goThrough(n, m, ar));
	}
    }

    private static int goThrough(int n, int m, char[][] matrix) {
	int figuresCount = 0;
	boolean visited[][] = new boolean[n][m];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		if (matrix[i][j] == 'X') {
		    if (visited[i][j]) {
			continue;
		    }
		    markVisited(i, j, n, m, matrix, visited);
		    figuresCount++;
		}
	    }
	}
	return figuresCount;
    }

    public static void markVisited(int i, int j, int n, int m, char[][] matrix,
	    boolean[][] visited) {
	if (matrix[i][j] != 'X' || visited[i][j]) {
	    return;
	}

	visited[i][j] = true;
	if (i + 1 < n) {
	    markVisited(i + 1, j, n, m, matrix, visited);
	}
	if (i - 1 >= 0) {
	    markVisited(i - 1, j, n, m, matrix, visited);
	}
	if (j + 1 < m) {
	    markVisited(i, j + 1, n, m, matrix, visited);
	}

	if (j - 1 >= 0) {
	    markVisited(i, j - 1, n, m, matrix, visited);
	}

    }
}
