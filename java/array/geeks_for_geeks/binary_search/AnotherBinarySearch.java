

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/who-will-win/0
 */

public class AnotherBinarySearch {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	int output[] = new int[testCases];
	for (int i = 0; i < testCases; i++) {
	    int arrayResolution = scanner.nextInt();
	    int searchedItem = scanner.nextInt();
	    int firstPersonTimePerOperation = scanner.nextInt();
	    int secondPersonTimePerOperation = scanner.nextInt();
	    int firstPersonSearchTime = firstPersonTimePerOperation * searchedItem;
	    int secondPersonSearchTime = binarySearch(arrayResolution, searchedItem - 1,
		    secondPersonTimePerOperation);
	    output[i] = firstPersonSearchTime < secondPersonSearchTime ? 1 : 2;
	}
	for (int j = 0; j < testCases; j++) {
	    System.out.println(output[j]);
	}
    }

    private static int binarySearch(int arrayLength, int searchedItem, int timePerOperation) {
	int operations = 0;
	int left = 0;
	int right = arrayLength - 1;
	while (left <= right) {
	    int mid = left + (right - left) / 2;
	    if (searchedItem > mid) {
		left = mid + 1;
	    } else if (searchedItem < mid) {
		right = mid - 1;
	    } else {
		break;
	    }
	    operations++;
	}
	return operations * timePerOperation;
    }

}
