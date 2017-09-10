

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 * An old solution - there is a chance that it could be improved.
 */
public class SumTwoNumbers {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    int firstNumberResolution = scanner.nextInt();
	    int secondNumberResolution = scanner.nextInt();
	    GeneralLinkedList<Integer> firstList = new GeneralLinkedList<>();
	    GeneralLinkedList<Integer> secondList = new GeneralLinkedList<>();
	    for (int j = 0; j < firstNumberResolution; j++) {
		firstList.add(scanner.nextInt());
	    }
	    for (int k = 0; k < secondNumberResolution; k++) {
		secondList.add(scanner.nextInt());
	    }
	    GeneralLinkedList<Integer> result = sum(firstList, secondList);
	    result.printSelf();
	}
    }

    public static GeneralLinkedList<Integer> sum(GeneralLinkedList<Integer> first,
	    GeneralLinkedList<Integer> second) {
	GeneralLinkedList.Node<Integer> firstCurrentNode = first.getTail();
	GeneralLinkedList.Node<Integer> secondCurrentNode = second.getTail();
	GeneralLinkedList<Integer> resultList = new GeneralLinkedList<>();
	boolean increase = false;
	while (first.getCount() > second.getCount() ? firstCurrentNode != null
		: secondCurrentNode != null) {
	    int result = (firstCurrentNode == null ? 0 : firstCurrentNode.value)
		    + (secondCurrentNode == null ? 0 : secondCurrentNode.value)
		    + (increase ? 1 : 0);
	    increase = result > 9;
	    firstCurrentNode = firstCurrentNode == null ? null : firstCurrentNode.previous;
	    secondCurrentNode = secondCurrentNode == null ? null : secondCurrentNode.previous;
	    resultList.addHead(result % 10);
	}
	if (increase) {
	    resultList.addHead(1);
	}
	return resultList;
    }

}
