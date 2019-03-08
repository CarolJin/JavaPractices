package findNumbersFromArray;

public class findMaxMixNumbersFromAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[]{10, 2, 99, -18, 5, 8, 88, -5};
		
	    int largest = Integer.MIN_VALUE;
	    int smallest = Integer.MAX_VALUE;
	    
	    for(int number: intArray){
	    	if(number>largest){
	    		largest = number;
	    	}
	    }
		System.out.println("The largest number of the array is: "+ largest);
		
		for(int number: intArray){
		    	if(number<smallest){
		    		smallest = number;
		    	}
		    }
			System.out.println("The smallest number of the array is: "+ smallest);
					
	}

}
