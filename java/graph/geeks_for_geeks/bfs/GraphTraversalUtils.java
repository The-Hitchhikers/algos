

import com.example.yuriitsap.algos.geeks_for_geeks.graph.GraphNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author yuriitsap.
 */

/**
 * Another old util for traversing graphs.
 */
public class GraphTraversalUtils {

    //a hack around our recursive stack
    private static int sCount = 0;

    public static <T> int BFSTraversal(GraphNode<T> rootNode, boolean logIteration) {
	int count = 0;
	Queue<GraphNode<T>> queue = new LinkedList<>();
	queue.offer(rootNode);
	while (queue.peek() != null) {
	    GraphNode<T> head = queue.poll();
	    head.setVisited(true);
	    count++;
	    if (logIteration) {
		System.out.println(count + " - " + head.toString());
	    }
	    for (GraphNode<T> node : head.getAdjacentNodes()) {
		if (!node.wasVisited()) {
		    queue.offer(node);
		}
	    }
	}
	return count;
    }

    public static <T> int DFSTraversal(GraphNode<T> rootNode, boolean logIteration) {
	int count = 0;
	Stack<GraphNode<T>> stack = new Stack<>();
	stack.add(rootNode);
	while (!stack.isEmpty()) {
	    GraphNode<T> currentNode = stack.pop();
	    currentNode.setVisited(true);
	    count++;
	    if (logIteration) {
		System.out.println(count + " - " + currentNode.toString());
	    }
	    for (int i = currentNode.getAdjacentNodes().size() - 1; i >= 0; i--) {
		GraphNode<T> currentNodeAdjacentElement = currentNode.getAdjacentNodes().get(i);
		if (!currentNodeAdjacentElement.wasVisited()) {
		    stack.add(currentNodeAdjacentElement);
		}
	    }
	}

	return count;
    }

    public static <T> int DFS(GraphNode<T> rootNode, boolean recursive) {
	if (recursive) {
	    sCount = 0;
	    return DFSRecursiveTraversal(rootNode, true);
	} else {
	    return DFSTraversal(rootNode, true);
	}

    }

    public static <T> int DFSRecursiveTraversal(GraphNode<T> rootNode, boolean logIteration) {

	if (rootNode == null) {
	    return sCount;
	}

	rootNode.setVisited(true);
	//forgive me
	sCount++;
	if (logIteration) {
	    System.out.println(sCount + " - " + rootNode.toString());
	}
	for (GraphNode<T> node : rootNode.getAdjacentNodes()) {
	    if (!node.wasVisited()) {
		DFSRecursiveTraversal(node, true);
	    }
	}

	return sCount;
    }

}
