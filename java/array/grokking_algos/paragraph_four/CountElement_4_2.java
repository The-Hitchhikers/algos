


import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author yuriitsap.
 */

public class CountElement_4_2 {

    public static int count(LinkedList<Integer> list) {
        if (list.peek() == null) return 0;
        list.pop();
        return 1 + count(list);

    }

    public static void main(String[] args) {
	System.out.println("sum = " + CountElement_4_2.count(new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7))));
    }

}
