public class ShortestPalindromicSubsequence {

	public static void main(String arg[]) {
		String strA = "abcadcad";
		ShortestPalindromicSubsequence i = new ShortestPalindromicSubsequence();
		String x = i.shortestPalindromeSubseq(strA);
		System.out.println("The Shortest Palindrome from " + strA + " is- " + x);
	}

	public String shortestPalindromeSubseq(String s) {
		/*
		 * Given a string s, you are allowed to convert it to a palindrome by
		 * adding characters in front of it. Find and return the shortest
		 * palindrome you can find by performing this transformation. Example 1:
		 * Input: "aacecaaa" Output: "aaacecaaa" Example 2: Input: "abcd"
		 * Output: "dcbabcd"
		 */

		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(j))
				j += 1;
		}

		if (j == s.length())
			return s;

		String suffix = s.substring(j);
		return new StringBuffer(suffix).reverse().toString() + shortestPalindromeSubseq(s.substring(0, j)) + suffix;
	}

}
