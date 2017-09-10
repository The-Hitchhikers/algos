

/**
 * @author yuriitsap.
 */

/**
 * A custom class that was created to solve the problem in generic way.
 * @param <T> anything you want.
 */
public class ReverseArray<T> {

    public T[] reverse(T[] originArray) {
	int start = 0;
	int end = originArray.length - 1;
	while (start <= end) {
	    T tmp = originArray[start];
	    originArray[start] = originArray[end];
	    originArray[end] = tmp;
	    start++;
	    end--;
	}
	print(originArray);
	return originArray;
    }

    private void print(T[] array) {
	for (T t : array) {
	    System.out.print(t + " ");
	}
    }

    public static void main(String[] args) {
	ReverseArray<Character> reverseArray = new ReverseArray<>();
	String lol = "that is really strange";
	Character[] characters = new Character[lol.length()];
	for (int i = 0; i < characters.length; i++) {
	    characters[i] = lol.toCharArray()[i];
	}
	reverseArray.reverse(characters);
    }
}
