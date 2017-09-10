

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/maximum-integer-value/0
 */

public class MaxIntegerValue {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	int[] results = new int[testCases];
	for (int i = 0; i < testCases; i++) {
	    String stringToCount = scanner.next();
	    results[i] = count(stringToCount);
	}
	for (int result : results) {
	    System.out.println(result);
	}
    }

    private static int count(String stringToCount) {
	char[] chars = stringToCount.toCharArray();
	int result = chars[0] - '0';
	for (int j = 1; j < chars.length; j++) {
	    int sumResult = result + (chars[j] - '0');
	    int multiplyResult = result * (chars[j] - '0');
	    result = sumResult > multiplyResult ? sumResult : multiplyResult;
	}
	return result;
    }
}
