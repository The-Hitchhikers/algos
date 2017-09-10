

/**
 * @author yuriitsap.
 *         https://leetcode.com/problems/reverse-string/description/
 */

public class ReverseString {

    public String reverseString(String s) {
        if (s.isEmpty()){
            return s;
	}
	int start = 0;
	int end = s.length() - 1;
	char[] chars = s.toCharArray();
	char tmp;
	while (start <= end) {
	    tmp = chars[start];
	    chars[start] = chars[end];
	    chars[end] = tmp;
	    start++;
	    end--;
	}
	return new String(chars);
    }

    public static void main(String[] args) {
	System.out.print(new ReverseString().reverseString("hello"));
    }

}
