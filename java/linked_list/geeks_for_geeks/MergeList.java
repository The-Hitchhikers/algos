

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
 * Looks like that's the original problem.
 */
public class MergeList {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    int firstListResolution = scanner.nextInt();
	    GeneralLinkedList<Integer> firstList = new GeneralLinkedList<>();
	    GeneralLinkedList<Integer> secondList = new GeneralLinkedList<>();
	    for (int k = 0; k < firstListResolution; k++) {
		firstList.add(scanner.nextInt());
	    }
	    int secondListResolution = scanner.nextInt();
	    for (int l = 0; l < secondListResolution; l++) {
		secondList.add(scanner.nextInt());
	    }
	    GeneralLinkedList<Integer> resultingList = merge(firstList, secondList);
	    resultingList.printSelf();
	    if (secondList.getCount() > 0) {
		secondList.printSelf();
	    }
	}
    }

    private static GeneralLinkedList<Integer> merge(GeneralLinkedList<Integer> firstList,
	    GeneralLinkedList<Integer> secondList) {
	GeneralLinkedList<Integer> result = new GeneralLinkedList<>();
	GeneralLinkedList.Node<Integer> firstCurrentNode = firstList.getTail();
	GeneralLinkedList.Node<Integer> secondCurrentNode = secondList.getTail();

	while (firstCurrentNode != null) {
	    result.add(firstCurrentNode);
	    result.add(secondCurrentNode);

	    firstCurrentNode = firstCurrentNode.previous;
	    if (secondCurrentNode.previous != null) {
		secondCurrentNode = secondCurrentNode.previous;
		secondCurrentNode.next = null;
		secondList.setTail(secondCurrentNode);
		secondList.setCount(secondList.getCount() - 1);
	    } else {
		secondList.setTail(null);
		secondList.setHead(null);
		secondList.setCount(0);
	    }
	}

	return result;
    }


}
