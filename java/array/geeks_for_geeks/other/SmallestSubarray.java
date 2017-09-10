

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x/0
 */

public class SmallestSubarray {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    int arrayResolution = scanner.nextInt();
	    int searchedNumber = scanner.nextInt();
	    int startIndex = 0;
	    int array[] = new int[arrayResolution];
	    int sum = 0;
	    int smallestSubArrayNumberCount = Integer.MAX_VALUE;
	    for (int j = 0; j < arrayResolution; j++) {
		array[j] = scanner.nextInt();
		sum += array[j];
		if (sum > searchedNumber) {
		    while (sum - array[startIndex] > searchedNumber) {
			sum -= array[startIndex];
			startIndex++;
		    }
		    if (j - startIndex + 1 < smallestSubArrayNumberCount) {
			smallestSubArrayNumberCount = j - startIndex + 1;
		    }
		}
	    }
	    System.out.println(smallestSubArrayNumberCount);
	}
    }

}
