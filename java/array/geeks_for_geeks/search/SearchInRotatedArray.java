

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/search-in-a-rotated-array/0
 */
public class SearchInRotatedArray {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	int[] output = new int[testCases];
	for (int i = 0; i < testCases; i++) {
	    int arraySize = scanner.nextInt();
	    int[] array = new int[arraySize];
	    for (int j = 0; j < arraySize; j++) {
		array[j] = scanner.nextInt();
	    }
	    int searchedElement = scanner.nextInt();
	    output[i] = find(array, searchedElement);
	}
	for (int j = 0; j < testCases; j++) {
	    System.out.println(output[j]);
	}
    }

    private static int find(int[] array, int searchedElement) {
	int arrayBrokePoint = 0;
	for (int i = 0; i < array.length; i++) {
	    if (i + 1 != array.length && array[i] > array[i + 1]) {
		arrayBrokePoint = i;
		break;
	    }
	}
	int resultIndex = binarySearch(array, 0, arrayBrokePoint, searchedElement);
	if (resultIndex == -1) {
	    return binarySearch(array, arrayBrokePoint + 1, array.length - 1, searchedElement);
	}
	return resultIndex;
    }

    private static int binarySearch(int[] array, int left, int right, int searchedElement) {
	while (left <= right) {
	    int mid = left + (right - left) / 2;
	    if (searchedElement > array[mid]) {
		left = mid + 1;
	    } else if (searchedElement < array[mid]) {
		right = mid - 1;
	    } else {
		return mid;
	    }
	}
	return -1;
    }

}
