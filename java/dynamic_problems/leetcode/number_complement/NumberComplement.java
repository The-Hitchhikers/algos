

/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/number-complement/description/
 */

public class NumberComplement {

    public static void main(String[] args) {
	System.out.print(new NumberComplement().findComplement(5));
    }

    public int findComplement(int num) {
	return getMask(getSteps(num)) & (~num);
    }

    private int getMask(int steps) {
	return Integer.MAX_VALUE >> (31 - steps);

    }

    private int getSteps(int num) {
	int steps = 0;
	while (num > 0) {
	    num = num >> 1;
	    steps++;
	}
	return steps;
    }

}
