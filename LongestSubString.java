public class LongestSubString {

	public static void main(String[] args) {
		String s = "Today is  Thursday.   June 27     2019. ";
		System.out.println(getLongestSubString(s));
	}

	private static String getLongestSubString(String s) {
		String output = "";

		int maxLength = 0;
		int i = 0;
		int tempLen = 0;
		StringBuffer subStr = new StringBuffer();

		while (i < s.length()) {
			if (s.charAt(i) != ' ') {
				tempLen++;
				subStr.append(s.charAt(i));
				i++;
			} else {
				maxLength = tempLen > maxLength ? tempLen : maxLength;
				if (subStr.length() > output.length())
					output = new String(subStr.toString());
				tempLen = 0;
				subStr = new StringBuffer();
				i++;
			}
		}

		return output;
	}

}
