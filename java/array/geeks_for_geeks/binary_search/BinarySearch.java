

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * Old attempts to write binary search.
 */
public class BinarySearch {

    private int resolution;
    private int[] matrix;

    public BinarySearch(int resolution) {
	this.resolution = resolution;
	matrix = new int[resolution];
    }

    private int find(int number, int left, int right) {
//	System.out.println("left index = " + left + " right index = " + right);
	if (left > right) {
	    System.out.println("not found!");
	    throw new IllegalStateException("not in range");
	}
	int mid = left + (right - left) / 2;
	System.out.println("mid" + mid);
	if (number > matrix[mid]) {
	    return find(number, mid + 1, right);
	} else if (number < matrix[mid]) {
	    return find(number, left, mid - 1);
	}
	return mid;
    }

    public int modifiedFind(int number, int left, int right) {
	while (left <= right) {
	    int mid = left + (right - left) / 2;
	    if (number > matrix[mid]) {
		left = mid + 1;
	    } else if (number < matrix[mid]) {
		right = mid - 1;
	    } else {
		return mid;
	    }
	}
	System.out.println("Not found");
	throw new IllegalStateException("not in range");
    }

    public static void solution() {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	for (int i = 0; i < testCases; i++) {
	    int resolution = scanner.nextInt();
	    BinarySearch search = new BinarySearch(resolution);
	    for (int j = 0; j < resolution; j++) {
		search.matrix[j] = scanner.nextInt();
	    }
	    int seekNumber = scanner.nextInt();
	    System.out.println("index of number we are seeking = " + search
		    .modifiedFind(seekNumber, 0, search.resolution - 1));
	}
    }

}
