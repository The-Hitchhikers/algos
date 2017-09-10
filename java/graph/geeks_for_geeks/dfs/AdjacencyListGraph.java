

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

public class AdjacencyListGraph {

    private List<Integer>[] mAdjacencyMatrix;
    private int mMatrixResolution;
    private int mDepth;
    private int mEvenPathes;
    private int mOddPathes;
    private int mPath[];
    private int mDistance[];

    @SuppressWarnings("unchecked")
    public AdjacencyListGraph(int matrixResolution) {
	mMatrixResolution = matrixResolution;
	mAdjacencyMatrix = new ArrayList[matrixResolution];
	mPath = new int[matrixResolution];
	mDistance = new int[matrixResolution];
	for (int i = 0; i < matrixResolution; i++) {
	    mAdjacencyMatrix[i] = new ArrayList<>();
	}
    }

    public void addEdge(int n, int m) {
	mAdjacencyMatrix[n - 1].add(m - 1);
	mAdjacencyMatrix[m - 1].add(n - 1);

    }

    private void solution() {
	mDepth = 0;
	dfs(0, new boolean[mMatrixResolution]);
//	    System.out.println("break");
	System.out.print(mOddPathes * (mOddPathes - 1) / 2 + mEvenPathes * (mEvenPathes - 1) / 2);
    }

    private void solution2() {
	for (int i = 0; i < mMatrixResolution; i++) {
	    mDepth = 0;
	    simpleDFS(i, new boolean[mMatrixResolution]);
	    mPath[i] = -1;
	    for (int j = i; j < mMatrixResolution; j++) {
		int edgesCount = findPathTo(j);
		int fromVertex = i + 1;
		int toVertex = j + 1;
//		System.out.println(edgesCount + " edges to vertex " + fromVertex + " from vertex " + toVertex);
		if (edgesCount != 0 && edgesCount % 2 == 0) {
		    mEvenPathes++;
		}
	    }
	}
	System.out.println(mEvenPathes * (mEvenPathes - 1) / 2 + mOddPathes * (mOddPathes - 1) / 2);
    }

    private int findPathTo(int node) {
	int count = 0;
	for (int i = node; mDistance[i] > 0; i = mPath[i]) {
	    count++;
	}
	return count;
    }

    private void simpleDFS(int node, boolean[] visited) {
	mDistance[node] = mDepth;
	visited[node] = true;
	for (int adjacentNode : mAdjacencyMatrix[node]) {
	    if (!visited[adjacentNode]) {
		mDepth++;
		mPath[adjacentNode] = node;
		simpleDFS(adjacentNode, visited);
	    }
	}
	mDepth--;
    }

    private void dfs(int rootNode, boolean[] visited) {
	System.out.println(rootNode + 1);
	visited[rootNode] = true;
	for (int node : mAdjacencyMatrix[rootNode]) {
	    if (!visited[node]) {
		mDepth++;
//		System.out.println(mDepth+" depth");
		if (mDepth % 2 == 0) {
		    mEvenPathes++;
//		    System.out.println(mEvenPathes+" even pathes");
		} else {
		    mOddPathes++;
//		    System.out.println(mOddPathes+" depth pather");
		}
		dfs(node, visited);
		mDepth--;
	    }
	}
    }

    public static void test() {
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
//	System.out.println(testCases);
	for (int i = 0; i < testCases; i++) {
	    buildAndSolve(sc);
	}
    }

    private static void buildAndSolve(Scanner scanner) {
	int graphResolution = scanner.nextInt();
	AdjacencyListGraph graph = new AdjacencyListGraph(graphResolution);
//	    System.out.println(graphResolution);
	for (int j = 0; j < graphResolution - 1; j++) {
	    int n = scanner.nextInt();
	    int m = scanner.nextInt();
//		System.out.println(n + " " + m);
	    graph.addEdge(n, m);
	}
	graph.solution();
    }

    public static void test2() {
	Scanner s = new Scanner(System.in);
	//        FastReader s = new FastReader();
	int totalCases = s.nextInt();
	for (int i = 0; i < totalCases; i++) {
	    int totalNodes = s.nextInt();
	    Graph2 g = new Graph2(totalNodes);
	    for (int j = 0; j < totalNodes - 1; j++) {
		int x = s.nextInt() - 1;
		int y = s.nextInt() - 1;
		g.addEdge(x, y);
		g.addEdge(y, x);

	    }
	    g.DFS(0);

	    System.out.println("even count = " + g.evenCount + " " + g.oddCount);
	    System.out.println(
		    g.evenCount * (g.evenCount - 1) / 2 + g.oddCount * (g.oddCount - 1) / 2);
	}
    }
}
