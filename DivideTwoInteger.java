package binarySearch;

public class DivideTwoInteger {

	public static void main(String[] args) {
		int dividend = -2147483648;
		int divisor = 2;
        System.out.println(divide(dividend, divisor));
	}
	
public static int divide(int dividend, int divisor) { 
        
        if(dividend==0) return 0;
        
        if(divisor==1) return dividend;
        
        if(divisor==-1) 
            return (dividend==Integer.MIN_VALUE ? Integer.MAX_VALUE: -dividend);
        
        boolean isNeg = (divisor<0 && dividend>0) || (divisor>0 && dividend<0);
        
        //Math.abs() method - Note that if the argument is equal to the value of Long.MIN_VALUE, the most negative representable long value, the result is that same value, which is negative.
        //Have to cast to `long` before `.abs` method, or we still get Integer.MIN_VALUE as it is (the negative number: -2147483648)
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        
        int ans = (int)getQuotient(dividendL, divisorL);
        
        if(isNeg) return -ans;
        return ans;        
    }
    
    private static long getQuotient(long dividendL, long divisorL) {
        
        if(dividendL<divisorL) return 0;
        
        long sum = divisorL;
        long count = 1;        
        while(dividendL >= (sum+sum)) {
                sum += sum; 
                count += count;
            }
        return count + getQuotient(dividendL-sum,divisorL);
    }

}

/*Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Note:

Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.
*/
