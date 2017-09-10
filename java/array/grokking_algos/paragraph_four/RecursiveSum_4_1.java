

/**
 * @author yuriitsap.
 */

public class RecursiveSum_4_1 {

    public static int sum(int[] array) {
	return sum(array, array.length - 1);
    }

    private static int sum(int[] array, int elementToStart) {
	if (elementToStart < 0) {
	    return 0;
	}
	return array[elementToStart] + sum(array, elementToStart - 1);
    }

    public static void main(String[] args) {
	System.out.println("sum = " + RecursiveSum_4_1.sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

}
