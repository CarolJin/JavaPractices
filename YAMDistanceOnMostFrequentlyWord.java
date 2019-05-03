import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
*Custom made problem: Calculate the YAM distance for an array of words
*Definition: the YAM distance of an array of words is defined as the max distance between any of the most frequently appearing words
*Example: a) [this is a funny problem created just for the sake of illustration this is not a real problem this is just a test] -- in this case the YAM distance = the index of the second problem - the index of the first problem
*Example: b) [no duplicate words can be found here] -- in this case the YAM distance is 0, since all words have the same frequency and the max distance for a single word itself is 0.
*/

public class YAMDistanceOnMostFrequentlyWord {

	public static void main(String[] args) {
		String str = "this is a funny problem created just for the sake of illustration this is not a real problem this is just a funny problem";
		// String str1 = "this";
		String[] strArray = str.split(" ");
		for (String s : strArray)
			System.out.print(s + ",");
		calculateYAMDistanceOnMostFrequentlyWord(strArray);
	}

	private static void calculateYAMDistanceOnMostFrequentlyWord(String[] strArray) {

		int distance = 0;

		HashMap<String, Integer[]> hm = new HashMap<String, Integer[]>();
		Integer[] values = null;

		for (int i = 0; i < strArray.length; i++) {
			int count = 0;
			int end;
			if (!hm.containsKey(strArray[i])) {
				values = new Integer[3]; // 3 integer array to save count, startIndex, endIndex of each word
				int start = i; // save the start index of a word
				count = 1;
				values[1] = start; // Put start index into the hashmap value(values[]) here
			} else {
				values = hm.get(strArray[i]);
				count = values[0] + 1;
			}
			end = i;
			values[0] = count;
			values[2] = end; // Put the `count` & `endIndex` for each word, replace count/endIndex when word key is already in the hashmap
			hm.put(strArray[i], values);
		}

		Set set1 = hm.entrySet();
		Iterator it = set1.iterator();

		int finalCount = 0;

		while (it.hasNext()) {
			Map.Entry me = (Entry) it.next();
			Integer[] valueArr = (Integer[]) me.getValue();
			int countTemp = valueArr[0];
			int startTemp = valueArr[1];
			int endTemp = valueArr[2];

			if (finalCount < countTemp) {
				finalCount = countTemp;
				distance = endTemp - startTemp;
			} else if (finalCount == countTemp && distance < (endTemp - startTemp)) {
				distance = endTemp - startTemp;
			}
		}
		System.out.printf("%n");
		System.out.println(distance);
	}
}
