package freePractice;

public class SumOfSubArrays {
	      
	    //function compute sum all sub-array 
	    public static long SubArraySum( int arr[] , int n ) 
	    { 
	        long result = 0; 
	       
	        // computing sum of subarray using formula 
	        for (int i=0; i<n; i++) 
	            result += (arr[i] * (i+1) * (n-i)); 
	       
	        // return all subarray sum 
	        return result ; 
	    } 
	      
	    /* Driver program to test above function */
	    public static void main(String[] args)  
	    { 
	        int arr[] = {1, 2, 3} ; 
	        int n = arr.length; 
	        System.out.println("Sum of SubArray " +  
	                           SubArraySum(arr, n)); 
	    } 
}

//class GFG { 
//    
//    // Computes sum all sub-array 
//    public static long SubArraySum(int arr[], int n) 
//    { 
//        long result = 0; 
//       
//        // Pick starting point 
//        for (int i = 0; i < n; i ++) 
//        { 
//            // Pick ending point 
//            for (int j = i; j < n; j ++) 
//            { 
//                // sum subarray between current 
//                // starting and ending points 
//                for (int k = i; k <= j; k++) 
//                    result += arr[k] ; 
//            } 
//        } 
//        return result ; 
//    } 
//      
//    /* Driver program to test above function */
//    public static void main(String[] args)  
//    { 
//        int arr[] = {1, 2, 3} ; 
//        int n = arr.length; 
//        System.out.println("Sum of SubArray : " +  
//                          SubArraySum(arr, n)); 
//    } 
//} 
