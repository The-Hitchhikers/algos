

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

public class CompareTwoLinkedLists {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    GeneralLinkedList<Character> firsList = GeneralLinkedList.readFromInput();
	    GeneralLinkedList<Character> secondList = GeneralLinkedList.readFromInput();
	    System.out.println(firsList.compare(secondList));
	}
    }

}
