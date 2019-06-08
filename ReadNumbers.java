public class ReadNumbers {
	/**
	   * Count the digits in the number and return back a verbally description of the results.  The order of the digits must be preserved.
	   * For example:
	   *  - 1 will be written as "one 1"
	   *  - 33 will be written as "two 3s"
	   *  - 12333441 will be written as "one 1, one 2, three 3, two 4, one 1"

	   *
	   * NOTE: For this example, assume we will have a maximum of four repeating digits, but this can be any number in reality
	   * 
	   * @param number Number to read and translated
	   * @return String containing the translated text of the number counting
	   */
	static String output = "";
	
	public static void main(String[] args) {		
		String input = "13332214";
		System.out.println(readNumbers(input));
	}

	private static String readNumbers(String input) {		
		if(input.length()==0) System.out.println("The input is empty.");;
		
		int[] numArr = new int[input.length()];
		for(int i = 0; i<input.length(); i++) {
			Character c = input.charAt(i);
			if(Character.isDigit(c)){
				int number = Integer.parseInt(c.toString());
				numArr[i] = number;
			}
		}
		 int i =0;
		 while (i<numArr.length) {
			int j= i;
			int start = i;
			int end = i;
			int number = numArr[i];
			while(j<numArr.length && numArr[i]==numArr[j]) {
				end = j;
				j++;
				
			}
			i=j;
			int count = end -start+1;
			output = new String(output + getTranslationOfCount(count) + " " + number + " ");
		}
		
		return output;
	}

	private static String getTranslationOfCount(int count) {
		String numTrans = "";
		switch(count) {
		case 1:
			numTrans = "one";
			break;
		case 2:
			numTrans = "two";
			break;		
		case 3:
			numTrans = "three";
			break;
		case 4:
			numTrans = "four";
			break;
		}
		return numTrans;
	}

}

