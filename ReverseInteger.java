public class ReverseInteger {

	public static void main(String[] args) {
		int i= 153;
		System.out.println(reverseInt(i));

	}

	private static int reverseInt(int x) {
		//long result = 0; //if the value exceed the int max/mi hn value, then the `int` type won't be valid for the check
		int result=0;
		
		while(x!=0) {
			int tail = x%10;
			int newResult = result*10 + tail;
			//if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0; //if the value exceed the int max/min value, then the `int` type won't be valid for the check
			// if you don't want to use `long` type, keep it as `int` type, do this:
			if(result != (newResult-tail)/10) return 0;
			result=newResult;
			x = x/10;
		}
		return result;
	}

}
