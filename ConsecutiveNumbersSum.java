//at least 2 or more consecutive number, to get sum equals to input.

public class ConsecutiveNumbersSum {

	public static void main(String[] args) {
		long input = 15;
		System.out.println(consecutive(input));

	}

	public static int consecutive(long num) {
		if (num == 1 || num == 2)
			return 0;

		int result = 0;
		long sum = 0;
		long start = 1;
		long end = (num + 1) / 2;

		result = backtrack(num, sum, start, end, result);

		return result;
	}

	private static int backtrack(long num, long sum, long start, long end, int result) {
		
		
		while (start<=end) {
			long i = start;
			while(i<=end && sum < num) {
				sum += i;
				i++;
			}
			
			if (sum > num || i>end && sum < num) {
				sum = 0;
				start++;
			}
							
			if (sum == num) {
				result = result + 1;
				sum = 0;
				start++;
			}
			
		}
		
		if(start>end) return result;
		
		return 0;
		
	}
	

}
