


import com.example.yuriitsap.algos.geeks_for_geeks.graph.BFS.GraphTraversalUtils;

/**
 * @author yuriitsap.
 */

/**
 * Graph representation data structure.
 * @param <T>
 */

public class Graph<T> {

    private GraphNode<T> mRoot;
    private int mNodesCount;

    public Graph(GraphNode<T> root, int nodesCount) {
	mRoot = root;
	mNodesCount = nodesCount;
	if (nodesCount < 0){
	    calculateNodes();
	}
    }

    public int getNodesCount() {
	return mNodesCount;
    }

    public void addNode(GraphNode<T> node) {
	//logic to handle node insert
	mRoot.addNode(node);
	mNodesCount++;
    }

    private void calculateNodes(){
	mNodesCount = GraphTraversalUtils.DFS(mRoot,true);
    }
}
