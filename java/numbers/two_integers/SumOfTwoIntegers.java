

/**
 * @author yuriitsap.
 * https://leetcode.com/problems/sum-of-two-integers/description/
 */
// TODO: 9/10/17 this should be solved
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
	return a >> b;
    }

    public static void main(String[] args) {
	System.out.print(new SumOfTwoIntegers().getSum(8, 1));
    }
}
