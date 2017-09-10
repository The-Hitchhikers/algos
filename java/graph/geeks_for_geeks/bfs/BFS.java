

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * An old attempt to implement BFS.
 * http://practice.geeksforgeeks.org/problems/x-total-shapes/0
 * original problem wasn't solved.
 */
public class GFG_BFS {

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
	int[] visited = new int[n];
	Queue<Integer> queue = new LinkedList<>();
	queue.add(0);
	while (queue.peek() != null) {
	    int element = queue.poll();
	    visited[element] = 1;
	    for (int i = 0; i < matrix[element].length; i++) {
	        if (matrix[element][i] == 'X'){
	            if (visited[i] != 1){
			queue.offer(i);
		    }
		    System.out.println(element+"  "+i);
		}
//		if (matrix[element][i] == 'X' && visited[i] != 1) {
//		    markVisited(element, i, n, m, matrix, visited);
//		    figuresCount++;
//		}
	    }
	}

	return figuresCount;
    }

    public static void markVisited(int i, int j, int n, int m, char[][] matrix, int visited[]) {
	if (matrix[i][j] != 'X' || visited[i] ==1) {
	    return;
	}

	visited[i] = 1;
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
