

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author yuriitsap.
 */

public class FindWords {

    enum Row {
	FIRST, SECOND, THIRD
    }

    private HashMap<Character, Row> rowMapping = new HashMap<>();

    /**
     * That's a lot of hardcode, but it's much faster than doing smth like this :
     * String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
     * 	Map<Character, Integer> map = new HashMap<>();
     * 	for(int i = 0; i<strs.length; i++){
     * 		for(char c: strs[i].toCharArray()){
     * 			map.put(c, i);//put <char, rowIndex> pair into the map
     * 		}
     * 	}
     */
    public FindWords() {
	rowMapping = new HashMap<>();
	rowMapping.put('Q', Row.FIRST);
	rowMapping.put('W', Row.FIRST);
	rowMapping.put('E', Row.FIRST);
	rowMapping.put('R', Row.FIRST);
	rowMapping.put('T', Row.FIRST);
	rowMapping.put('Y', Row.FIRST);
	rowMapping.put('U', Row.FIRST);
	rowMapping.put('I', Row.FIRST);
	rowMapping.put('O', Row.FIRST);
	rowMapping.put('P', Row.FIRST);
	rowMapping.put('A', Row.SECOND);
	rowMapping.put('S', Row.SECOND);
	rowMapping.put('D', Row.SECOND);
	rowMapping.put('F', Row.SECOND);
	rowMapping.put('G', Row.SECOND);
	rowMapping.put('H', Row.SECOND);
	rowMapping.put('J', Row.SECOND);
	rowMapping.put('K', Row.SECOND);
	rowMapping.put('L', Row.SECOND);
	rowMapping.put('Z', Row.THIRD);
	rowMapping.put('X', Row.THIRD);
	rowMapping.put('C', Row.THIRD);
	rowMapping.put('V', Row.THIRD);
	rowMapping.put('B', Row.THIRD);
	rowMapping.put('N', Row.THIRD);
	rowMapping.put('M', Row.THIRD);
    }

    public static void main(String[] args) {
	new FindWords().findWords(new String[]{"abdfs", "cccd", "a", "qwwewm"});
    }

    public String[] findWords(String[] words) {
	ArrayList<Integer> indexes = new ArrayList<>();
	for (int i = 0; i < words.length; i++) {
	    if (belongsToRow(words[i], rowMapping.get(Character.toUpperCase(words[i].charAt(0))))) {
		indexes.add(i);
	    }
	}
	String newWords[] = new String[indexes.size()];
	for (int i = 0; i < indexes.size(); i++) {
	    newWords[i] = words[indexes.get(i)];
	}

	return newWords;
    }

    private boolean belongsToRow(String word, Row row) {
	for (int j = 1; j < word.length(); j++) {
	    if (rowMapping.get(Character.toUpperCase(word.charAt(j))) != row) {
		return false;
	    }
	}
	return true;
    }
}
