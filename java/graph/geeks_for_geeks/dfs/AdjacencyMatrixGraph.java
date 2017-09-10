

/**
 * @author yuriitsap.
 */

public class AdjacencyMatrixGraph {

    private int[][] mAdjacencyMatrix;
    private int mMatrixResolution;
    private int[] mNodeEdges;

    public AdjacencyMatrixGraph(int matrixResolution) {
	mMatrixResolution = matrixResolution;
	mAdjacencyMatrix = new int[matrixResolution][matrixResolution];
	mNodeEdges = new int[matrixResolution -1];
    }

    public void addEdge(int n, int m) {
	mAdjacencyMatrix[n-1][m-1] = 1;
//	mAdjacencyMatrix[m-1][n-1] = 1;
    }

    public void solveThisGraph() {
	//assume that we begin from start(from first node)
	goThrough(0);
    }

    public void goThrough(int startNode) {
        System.out.println("Visited node = " + (startNode+1));
//	visited[startNode] = true;
	for (int i = 0; i < mAdjacencyMatrix[startNode].length; i++) {
	    if (mAdjacencyMatrix[startNode][i] == 1){
	        goThrough(i);
		checkNeighbour(startNode);
	    }
	}
    }

    private void checkNeighbour(int node){
	// TODO: 9/10/17 hey, implement this
    }

    public static void test(){
        AdjacencyMatrixGraph adjacencyMatrixGraph = new AdjacencyMatrixGraph(8);
        adjacencyMatrixGraph.addEdge(1,2);
        adjacencyMatrixGraph.addEdge(1,3);
        adjacencyMatrixGraph.addEdge(2,4);
	adjacencyMatrixGraph.addEdge(2,5);
	adjacencyMatrixGraph.addEdge(2,8);
	adjacencyMatrixGraph.addEdge(3,6);
	adjacencyMatrixGraph.addEdge(3,7);
        adjacencyMatrixGraph.solveThisGraph();
    }
}
