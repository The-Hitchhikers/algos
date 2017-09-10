

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x/0
 */

public class AllPairsSum {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	String[] result = new String[testCases];
	for (int k = 0; k < testCases; k++) {
	    int firstArrayResolution = scanner.nextInt();
	    int secondArrayResolution = scanner.nextInt();
	    int sum = scanner.nextInt();
	    int[] firstArray = new int[firstArrayResolution];
	    int[] secondArray = new int[secondArrayResolution];
	    Map<Integer, Integer> resultMap = new HashMap<>();
	    for (int i = 0; i < firstArrayResolution; i++) {
		int number = scanner.nextInt();
		firstArray[i] = number;
	    }
	    // probably not needed - old code
//	    Arrays.sort(firstArray);

	    for (int m = 0; m < secondArrayResolution; m++) {
		secondArray[m] = scanner.nextInt();
		resultMap.put(secondArray[m], m);
	    }

	    for (int j = firstArrayResolution - 1; j >= 0; j--) {
		int number = firstArray[j];
		if (result[k] == null) {
		    result[k] = "";
		}
		if (resultMap.containsKey(sum - number)) {
		    String partialResult = number + " " + secondArray[resultMap.get(sum - number)]
			    + (
			    !result[k].isEmpty() ? ", " : "");
		    result[k] = partialResult.concat(result[k]);
		}

	    }
	}
	for (int j = 0; j < testCases; j++) {
	    if (result[j].isEmpty()) {
		System.out.println(-1);
	    } else {
		System.out.println(result[j]);
	    }
	}
    }
}
