
/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistance {

    public void solve(int x, int y) {
	int result = x ^ y;
	int diff = 0;
	while (result > 0) {
	    diff += result & 1;
	    result = result >> 1;
	}
	System.out.print(diff);
    }
    public int doSmth(int num){
        return ~(~num-2)^num;
    }

    public static void main(String[] args) {
        new HammingDistance().solve(1,4);
    }
}
