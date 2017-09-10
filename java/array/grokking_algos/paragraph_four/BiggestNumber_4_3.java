

/**
 * @author yuriitsap.
 */

public class BiggestNumber_4_3 {

    public static int biggest(int[] array, int startPoint, int biggest) {
	if (startPoint < 0) {
	    return biggest;
	}

	if (biggest < array[startPoint]) {
	    biggest = array[startPoint];
	}
	return biggest(array, startPoint - 1, biggest);

    }

    public static void main(String[] args) {
	int[] array = {340, 1, 2, 3, 4, 5, 125, -22, 150};
	System.out.println("sum = " + BiggestNumber_4_3
		.biggest(array, array.length - 2, array[array.length - 1]));
    }

}
