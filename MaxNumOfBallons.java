package collections;
/*1189. Maximum Number of Balloons
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:
Input: text = "nlaebolko"
Output: 1
Example 2:

Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0
 
Constraints:
1 <= text.length <= 10^4
text consists of lower case English letters only.*/

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxNumOfBallons {

	public static void main(String[] args) {

		String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
		MaxNumOfBallons mn = new MaxNumOfBallons();
		System.out.print(mn.maxNumberOfBalloons(text));

	}

	public int maxNumberOfBalloons(String text) {
		int len = text.length();
		if (len < 7)
			return 0;

		int[] counts = new int[26];
		for (int i = 0; i < len; i++) {
			char c = text.charAt(i);
			counts[c - 'a']++;
		}

		String word = "balloon";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char w : word.toCharArray()) {
			hm.put(w, 1 + hm.getOrDefault(w, 0));
		}

		int min = Integer.MAX_VALUE;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			char c = entry.getKey();
			int count = entry.getValue();
			int tempMin = counts[c - 'a'] / count;
			if (tempMin < min)
				min = tempMin;
		}

		return min;
	}

}

//2ms, 35.8MB
