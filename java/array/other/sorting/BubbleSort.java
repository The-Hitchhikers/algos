

import java.util.Scanner;

/**
 * @author yuriitsap.
 *
 *         http://practice.geeksforgeeks.org/problems/sort-the-array/0
 */

public class BubbleSort {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
	while (testCases > 0) {
	    testCases--;
	    int arrayLength = sc.nextInt();
	    int[] array = new int[arrayLength];
	    while (arrayLength > 0) {
		arrayLength--;
		array[arrayLength] = sc.nextInt();
	    }
	    //sorting itself
	    boolean sortingWasFinished;
	    int tmp;
	    for (int i = 0; i < array.length; i++) {
		sortingWasFinished = true;
		for (int j = 0; j < array.length - 1; j++) {
		    if (array[j] > array[j + 1]) {
			tmp = array[j + 1];
			array[j + 1] = array[j];
			array[j] = tmp;
			sortingWasFinished = false;
		    }
		}
		if (sortingWasFinished) {
		    for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		    }
		    System.out.println();
		    return;
		}
	    }
	}
    }
}
