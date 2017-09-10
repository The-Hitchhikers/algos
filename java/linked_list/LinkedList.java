
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * Can not remember any related problem :(
 */
public class LinkedList {

    private Node headNode;
    private Node tailNode;
    private int count;

    private void insert(Node node) {
	if (checkEdges(node)) {
	    return;
	}
	Node currentNode = headNode;
	while (currentNode != null && currentNode.next.value < node.value) {
	    currentNode = currentNode.next;
	}

	node.next = currentNode.next;
	currentNode.next = node;
    }

    private boolean checkEdges(Node forInsertion) {
	if (forInsertion.value < headNode.value) {
	    forInsertion.next = headNode;
	    headNode.previous = forInsertion;
	    headNode = forInsertion;
	    return true;
	} else if (forInsertion.value > tailNode.value) {
	    tailNode.next = forInsertion;
	    forInsertion.previous = tailNode;
	    tailNode = forInsertion;
	    return true;
	}
	return false;
    }

    private void deleteNode(Node head, Node deleteNode) {
	Node currentNode = head;
	while (currentNode.next != null && !currentNode.equals(deleteNode)) {
	    currentNode = currentNode.next;
	}

	if (currentNode.next == null) {
	    System.out.println("This list doesn't contain such node!");
	    return;
	}
	currentNode.next.previous = currentNode.previous;

	if (currentNode.previous != null) {
	    currentNode.previous.next = currentNode.next;
	}
    }

    public static void solution(Mode mode) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    LinkedList linkedList = new LinkedList();
	    linkedList.count = scanner.nextInt();
	    Node currentNode;
	    linkedList.headNode = new Node();
	    linkedList.headNode.value = scanner.nextInt();
	    linkedList.headNode.previous = null;
	    currentNode = linkedList.headNode;
	    for (int j = 1; j < linkedList.count; j++) {
		currentNode.next = new Node();
		currentNode.next.value = scanner.nextInt();
		currentNode.next.previous = currentNode;
		currentNode = currentNode.next;
	    }
	    linkedList.tailNode = currentNode;
	    currentNode = linkedList.headNode;
	    Node performOn = new Node();
	    performOn.value = scanner.nextInt();
	    switch (mode) {
		case DELETE:
		    linkedList.deleteNode(linkedList.headNode, performOn);
		    break;
		case INSERT:
		    linkedList.insert(performOn);
		    break;
	    }

	    //printing result
	    while (currentNode != null) {
		System.out.print(currentNode.value + " ");
		currentNode = currentNode.next;
	    }
	}

    }

    private static class Node {

	int value;
	Node next;
	Node previous;

	@Override
	public boolean equals(Object o) {
	    if (this == o) {
		return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
		return false;
	    }

	    Node node = (Node) o;

	    return value == node.value;
	}

	@Override
	public int hashCode() {
	    return value;
	}
    }

    public enum Mode {
	INSERT, DELETE
    }

}
