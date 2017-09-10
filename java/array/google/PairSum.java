

/**
 * @author yuriitsap.
 */


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Find a pair of number that add up to predefined sum.
 */
public class PairSum {

    /**
     * Works with not sorted array.
     */
    public void findInUnsorted(int array[], int sumToFind) {
	Map<Integer, List<Integer>> indexMap = new HashMap<>();
	for (int originalArrayIndex = 0; originalArrayIndex < array.length; originalArrayIndex++) {
	    int index = sumToFind - array[originalArrayIndex];
	    if (indexMap.containsKey(index)) {
		for (Integer sumElementIndex : indexMap.get(index)) {
		    System.out.println("What we have here is = " + array[sumElementIndex] +
			    " + " + array[originalArrayIndex] + " sum up to " + sumToFind
			    + ". Index = [" + sumElementIndex + ", " + originalArrayIndex
			    + "]");
		}
	    }

	    if (!indexMap.containsKey(array[originalArrayIndex])) {
		indexMap.put(array[originalArrayIndex], new LinkedList<Integer>());
	    }

	    indexMap.get(array[originalArrayIndex]).add(originalArrayIndex);
	}
    }


    /**
     * Finds all elements with the help of binary search.
     */
    public void findInSortedArray(int[] array, int sumToFind) {
	for (int i = 0; i < array.length; i++) {
	    int result = sumToFind - array[i];
	    int searchResult = binarySearch(array, result);
	    if (searchResult != -1) {
		System.out.println(
			array[i] + " + " + array[searchResult] + " = " + sumToFind + " Position = ["
				+ i + "," + searchResult + "]");
	    }
	}
    }


    /**
     * Works as O(n)  but finds only the first occurrence.
     */
    public void findInSortedArrayVersion2(int array[], int sumToFind) {
	int left = 0;
	int right = array.length - 1;
	while (left <= right) {
	    if (array[left] + array[right] > sumToFind) {
		right--;
	    } else if (array[left] + array[right] < sumToFind) {
		left++;
	    } else {
		System.out.println(
			array[left] + " + " + array[right] + " = " + sumToFind + ". Index = ["
				+ left + ", " + right + "]");
		return;
	    }

	}
    }

    /**
     * Finds index of searched number.
     */
    public int binarySearch(int[] array, int number) {
	int left = 0;
	int right = array.length - 1;
	while (left <= right) {
	    int middle = left + (right - left) / 2;
	    if (number > array[middle]) {
		left = middle + 1;
	    } else if (number < array[middle]) {
		right = middle - 1;
	    } else {
		return middle;
	    }
	}
	return -1;

    }

    public static void main(String[] args) {
//	new PairSum().findInUnsorted(new int[]{1, 2, 4, 4, 3, 9, 8, 0, 4, 7}, 8);
	new PairSum()
		.findInSortedArrayVersion2(
			new int[]{-2, -2, 0, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 10, 10},
			8);

    }

}
