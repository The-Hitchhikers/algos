
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

public class GeneralLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    public static class Node<T> {

	T value;
	Node<T> next;
	Node<T> previous;

	public Node(T value,
		Node<T> next,
		Node<T> previous) {
	    this.value = value;
	    this.next = next;
	    this.previous = previous;
	}
    }

    public void add(T value) {
	Node<T> newNode = new Node<>(value, null, tail);
	add(newNode);
    }

    public void add(Node<T> node) {
	if (tail == null) {
	    head = node;
	} else {
	    tail.next = node;
	}
	tail = node;
	count++;
    }

    public void addHead(T value) {
	addHead(new Node<>(value, head, null));
    }

    public void addHead(Node<T> node) {
	if (tail == null) {
	    add(node);
	    return;
	}
	head.previous = node;
	head = node;
	count++;

    }

    public void printSelf() {
	Node<T> current = head;
	while (current != null) {
	    System.out.print(current.value + " ");
	    current = current.next;
	}
	System.out.println();
    }

    public Node<T> getHead() {
	return head;
    }

    public void setHead(
	    Node<T> head) {
	this.head = head;
    }

    public Node<T> getTail() {
	return tail;
    }

    public void setTail(
	    Node<T> tail) {
	this.tail = tail;
    }

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    public int compare(GeneralLinkedList<T> anotherList) {
	Node<T> thisCurrentNode = getHead();
	Node<T> anotherCurrentNode = anotherList.getHead();
	if (getCount() != anotherList.getCount()) {
	    return getCount() > anotherList.getCount() ? 1 : -1;
	}
	while (thisCurrentNode.next != null) {
	    Comparable<T> firstItem = thisCurrentNode.value;
	    int compare = firstItem.compareTo(anotherCurrentNode.value);
	    if (compare != 0) {
		return compare;
	    }
	}
	return 0;
    }

    public static GeneralLinkedList<Character> readFromInput() {
	Scanner scanner = new Scanner(System.in);
	int itemsCount = scanner.nextInt();
	GeneralLinkedList<Character> list = new GeneralLinkedList<>();
	for (int i = 0; i < itemsCount; i++) {
	    list.add(scanner.next().charAt(0));
	}
	return list;
    }

}
