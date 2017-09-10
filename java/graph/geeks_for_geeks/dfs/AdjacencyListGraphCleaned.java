

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

public class AdjacencyListGraphCleaned {

    private List<Integer>[] mAdjacencyList;
    private int mVertexCount;
    private int mGrayVertex;
    private int mRedVertex;
    private int mBaseVertex;
    private boolean[] mVisited;
    private int mDepth;

    @SuppressWarnings("unchecked")
    AdjacencyListGraphCleaned(int vertexCount, int baseVertex) {
	mVertexCount = vertexCount;
	mAdjacencyList = new LinkedList[mVertexCount];
	mBaseVertex = baseVertex;
	mVisited = new boolean[mVertexCount];
	for (int i = 0; i < mVertexCount; i++) {
	    mAdjacencyList[i] = new LinkedList<>();
	}
    }

    public void addEdge(int vertexFrom, int vertexTo) {
	mAdjacencyList[vertexFrom - 1].add(vertexTo - 1);
	mAdjacencyList[vertexTo - 1].add(vertexFrom - 1);

    }

    public void solve() {
        mGrayVertex++;
	dfs(mBaseVertex);

	System.out.println((mGrayVertex * (mGrayVertex - 1)) / 2 + (mRedVertex * (mRedVertex - 1)) / 2);
    }

    private void dfs(int node) {
        mVisited[node] = true;
	for (int adjacencyVertex : mAdjacencyList[node]) {
	    if (!mVisited[adjacencyVertex]) {
		mDepth++;
		if (mDepth % 2 == 0) {
		    mGrayVertex++;
		} else {
		    mRedVertex++;
		}
		dfs(adjacencyVertex);
		mDepth--;
	    }
	}
    }

    public static void solution() {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    int graphResolution = scanner.nextInt();
	    AdjacencyListGraphCleaned graph = new AdjacencyListGraphCleaned(graphResolution, 0);
	    for (int j = 0; j < graphResolution - 1; j++) {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		graph.addEdge(n, m);
	    }
	    graph.solve();
	}
    }
}
