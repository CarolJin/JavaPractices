public class DeletionDistance2 {

	static int output = 0;

	static int deletionDistance(String str1, String str2) {
		int i = str1.length();
		int j = str2.length();
		if (i == 0 && j == 0)
			return output;
		if (i == 0)
			return output + j;
		if (j == 0)
			return output + i;
		else {
			char a = str1.charAt(i-1); 
			char b = str2.charAt(j-1); 
			if (a == b) {
				output = deletionDistance(str1.substring(0, i-1), str2.substring(0, j-1));
			} else {
				int res1 = deletionDistance(str1.substring(0, i), str2.substring(0, j-1));
				int res2 = deletionDistance(str1.substring(0, i-1), str2.substring(0, j));
				output = 1 + Math.min(res1, res2);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str1 = "heat";
		String str2 = "hot";
		System.out.println(deletionDistance(str1, str2));
	}

}
