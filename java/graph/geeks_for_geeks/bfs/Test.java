

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * Looks like a class for testing BFS :)
 */

public class Test {

    private Queue<Integer> queue;

    public Test() {
	queue = new LinkedList<>();
    }

    public void bfs(int adjacency_matrix[][], int source) {
	int number_of_nodes = adjacency_matrix[source].length;

	int[] visited = new int[number_of_nodes];
	int i, element;

	visited[source] = 1;
	queue.add(source);

	while (!queue.isEmpty()) {
	    element = queue.remove();
	    i = element;
	    System.out.print(i + "\t");
	    while (i < number_of_nodes) {
		if (adjacency_matrix[element][i] == 1 && visited[i] == 0) {
		    queue.add(i);
		    visited[i] = 1;
		}
		i++;
	    }
	}
    }

    public static void main(String... arg) {
	int number_no_nodes, source;
	Scanner scanner = null;

	try {
	    System.out.println("Enter the number of nodes in the graph");
	    scanner = new Scanner(System.in);
	    number_no_nodes = scanner.nextInt();

	    int adjacency_matrix[][] = new int[number_no_nodes][number_no_nodes];
	    System.out.println("Enter the adjacency matrix");
	    for (int i = 0; i < number_no_nodes; i++) {
		for (int j = 0; j < number_no_nodes; j++) {
		    adjacency_matrix[i][j] = scanner.nextInt();
		}
	    }

	    System.out.println("Enter the source for the graph");
	    source = scanner.nextInt();

	    System.out.println("The BFS traversal of the graph is ");
	    Test bfs = new Test();
	    bfs.bfs(adjacency_matrix, source);

	} catch (InputMismatchException inputMismatch) {
	    System.out.println("Wrong Input Format");
	}
	scanner.close();
    }

}
