

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author yuriitsap.
 */

class Graph2 {

    int evenCount = 1;
    int oddCount = 0;
    static int tempStartingNode;
    int totalVertics;
    Object adj[];

    Graph2(int NoOfVertices) {
	totalVertics = NoOfVertices;
	adj = new Object[NoOfVertices];
	for (int i = 0; i < NoOfVertices; i++) {
	    adj[i] = new LinkedList<Integer>();

	}
    }

    void addEdge(int u, int v) {
	((LinkedList<Integer>) adj[u]).add(v);
    }

    void DFS(int StartingNode) {
	tempStartingNode = StartingNode;
	boolean visited[] = new boolean[totalVertics];
	DFSutil(StartingNode, visited, 1);


    }

    void DFSutil(int Vertices, boolean visited[], int count) {
	//  if(!visited[Vertices]){
	System.out.println("vertex = " + (Vertices + 1));
	visited[Vertices] = true;
	System.out.println("count = " + count);
	LinkedList<Integer> ll = (LinkedList<Integer>) adj[Vertices];
	ListIterator<Integer> ltr = ll.listIterator();
	while (ltr.hasNext()) {
	    int nextVertics = ltr.next();
	    if (!visited[nextVertics]) {
		if (count % 2 == 0) {
		    evenCount++;
		} else {
		    oddCount++;
		}
		DFSutil(nextVertics, visited, count + 1);
	    }
	}
    }
}
