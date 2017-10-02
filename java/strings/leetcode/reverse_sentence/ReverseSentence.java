

/**
 * @author yuriitsap.
 */

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */

public class ReverseSentence {

    public static void main(String[] args) {
	new ReverseSentence().reverseWords("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
	char[] array = s.toCharArray();
	int startReverse, endReverse;
	startReverse = 0;
	for (int i = 0; i < array.length; i++) {
	    if (array[i] == ' ' || i == array.length - 1) {
		endReverse = array[i] == ' ' ? i - 1 : i;
		reverse(array, startReverse, endReverse);
		startReverse = i + 1;
	    }
	}
	return new String(array);
    }

    private void reverse(char[] array, int start, int end) {
	char tmp;
	while (start <= end) {
	    tmp = array[start];
	    array[start] = array[end];
	    array[end] = tmp;
	    start++;
	    end--;
	}
    }

}
