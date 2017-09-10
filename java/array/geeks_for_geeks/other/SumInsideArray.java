

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/two-sum/description/
 * With time measuring.
 */

public class SumInsideArray {

    public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -2, -5, -3};
	long startTime = System.currentTimeMillis();
	solve(new int[]{1, 5, 4, 4, 3, 8, 2, 3, 1, 1, 1, 1, 3, 4, 5, 6, 7, 8, 9, 0, 12, 34, 56,
		78124}, 8);
	long mineSolutionTimeTaken = System.currentTimeMillis() - startTime;

	long positiveSolutionStartTime = System.currentTimeMillis();
	onlyPositive(
		new int[]{1, 5, 4, 4, 3, 8, 2, 3, 1, 1, 1, 1, 3, 4, 5, 6, 7, 8, 9, 0, 12, 34, 56,
			78124}, 8);
	long positiveSolutionTimeTaken = System.currentTimeMillis() - positiveSolutionStartTime;

	System.out.println("Mine solution took time " + mineSolutionTimeTaken);
	System.out.println("Positive number solution took time " + positiveSolutionTimeTaken);
    }

    private static void solve(int[] array, int sum) {
	Map<Integer, Integer> sumMap = new HashMap<>();
	String result = "";
	for (int i = 0; i < array.length; i++) {
	    Integer index = sumMap.get(sum - array[i]);
	    sumMap.put(array[i], i);
	    if (index != null) {
		result = result.concat(array[index] + " " + array[i] + " ");
	    }
	}
	System.out.println(result);
    }

    private static void onlyPositive(int[] array, int sum) {
	int[] frequencyArray = new int[sum + 1];
	for (int i = 0; i < array.length; i++) {
	    if (array[i] <= sum) {
		frequencyArray[array[i]]++;
	    }
	}
	int shift = 0;
	for (int j = 0; j < frequencyArray.length; j++) {
	    if (frequencyArray[j] > 0) {
		for (int k = 0; k < frequencyArray[j]; k++) {
		    array[shift] = j;
		    shift++;
		}
	    }
	}
	int i = 0;
	int j = array.length - 1;
	String result = "";
	while (i < j) {
	    if (array[i] + array[j] == sum) {
		result = result.concat(array[i] + " " + array[j] + " ");
		j--;
		i++;
	    } else if (array[i] + array[j] < sum) {
		i++;
	    } else if (array[i] + array[j] > sum) {
		j--;
	    }
	}
	System.out.println(result);
    }
}
