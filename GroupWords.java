package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Input: String[] str = {"act", "cat", "taco", "hello", "mac", "cam","tac"};
 * Output: Groups: {"act", "cat","tac"}, {"mac", "cam"}, {"taco"}, {"hello"}
 */

public class GroupWords {

	public static void main(String[] args) {
		String[] str = { "act", "cat", "taco", "hello", "mac", "cam", "tac" };
		groupWords(str);
	}

	public static void groupWords(String[] str) {
		HashMap<String, ArrayList<String>> groups = new HashMap<String, ArrayList<String>>();

		for (int i = 0; i < str.length; i++) {
			String key = "";
			ArrayList<String> value = new ArrayList<String>();

			String word = str[i];
			char[] characters = word.toCharArray();
			Arrays.sort(characters);
			key = new String(characters); // Cannot use characters.toString(); or it returns the string representation of the object

			if (groups.containsKey(key)) {
				value = groups.get(key);
			}
			value.add(word);

			groups.put(key, value);
		}

		Set set = groups.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry group = (Map.Entry) it.next();
			System.out.printf("Group %s: %s%n", group.getKey(), group.getValue());
		}
	}

}
