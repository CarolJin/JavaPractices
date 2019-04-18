public class ReverseString {

	public static void main(String[] args) {
		String str= "fdjlkajflkdj";
		//reverseStr(str);
		reverseString2(str.toCharArray());

	}

	private static void reverseStr(String str) {
		String output = "";
		for(int i=str.length()-1; i>=0; i--) {
			output += str.charAt(i);
		}
		System.out.println(output);
	}
	
	private static void reverseString2(char[] s) {
	       int i = 0;
	       int j = s.length-1;
	       
	       while(i<j && j>=0) {
	    	   char tmp = s[i];
	    	   s[i] = s[j];
	    	   s[j] = tmp;
	    	   i++;
	    	   j--;
	       }
	       System.out.println(s);
	}

}

//recursive method can use: reverseStr2(str.substring(1) + str.charAt(0));
