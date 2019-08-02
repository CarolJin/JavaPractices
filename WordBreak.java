package dynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
//		 String s = "catsandog";
//		 List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat", "an");

		String s = "abcaa";
		List<String> wordDict = Arrays.asList("abc","aaa","ab","c");
		 
		WordBreak wb = new WordBreak();
		System.out.print(wb.wordBreak(s, wordDict));

	}

	public boolean wordBreak(String s, List<String> wordDict) {

		if (s.length() == 0 || wordDict.size() == 0)
			return false;

		int[] memo = new int[s.length()];
		Arrays.fill(memo, -1);

		return canBreak(s, wordDict, 0, memo);
	}

	private boolean canBreak(String s, List<String> wordDict, int start, int[] memo) {

		int len = s.length();

		if (start == len)
			return true;

		if (memo[start] != -1)
			return memo[start] == 1;

		String subStr = s.substring(start);

		for (String word : wordDict) {
			if (subStr.length() < word.length())
				continue;
			if (subStr.startsWith(word) && canBreak(s, wordDict, start + word.length(), memo)) {
				memo[start] = 1;
				return true;
			}
		}

		memo[start] = 0;
		return false;

	}

}
