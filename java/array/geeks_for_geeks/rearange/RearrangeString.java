

import java.util.Scanner;

/**
 * @author yuriitsap.
 */

/**
 * http://practice.geeksforgeeks.org/problems/rearrange-a-string/0
 */

public class RearrangeString {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
//	scanner.nextLine();
	int asciiStart = '0';
	int asciiEnd = asciiStart + 9;
	String[] results = new String[testCases];
	for (int i = 0; i < testCases; i++) {
	    String stringToRearrange = scanner.next();
	    results[i] = rearrange(stringToRearrange, asciiStart, asciiEnd);
	}
	for (String result : results) {
	    System.out.println(result);
	}
    }

    private static String rearrange(String s, int asciiStart, int asciiEnd) {
	String newOne = "";
	int sum = 0;
	char[] chars = s.toCharArray();
	for (int j = 0; j < chars.length; j++) {
	    if (asciiStart <= chars[j] && chars[j] <= asciiEnd) {
		sum += chars[j] - asciiStart;
	    } else {
		newOne += chars[j];
	    }
	}
	newOne += sum;
	return newOne;
    }
}
