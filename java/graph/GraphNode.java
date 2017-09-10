

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuriitsap.
 */

/**
 * Node representation data-structure.
 */

public class GraphNode<T> {

    private boolean mWasVisited;
    private T mItem;
    private List<GraphNode<T>> mAdjacentNodes;

    public GraphNode(T item) {
	mAdjacentNodes = new ArrayList<>();
	mItem = item;
    }

    public void addNode(GraphNode<T> node) {
	mAdjacentNodes.add(node);
    }

    public List<GraphNode<T>> getAdjacentNodes() {
	return mAdjacentNodes;
    }

    public T getItem() {
	return mItem;
    }

    public boolean wasVisited() {
	return mWasVisited;
    }

    public void setVisited(boolean wasVisited) {
	mWasVisited = wasVisited;
    }

    @Override
    public String toString() {
	return mItem.toString();
    }
}
