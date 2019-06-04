package binarySearch;

//Note:
//1 <= D <= weights.length <= 50000
//1 <= weights[i] <= 500

public class CapacityToShipAllWithinDdays2 {
	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int D = 3;
		
		CapacityToShipAllWithinDdays ca = new CapacityToShipAllWithinDdays();
		int capacity = ca.shipWithinDays(weights, D);
		System.out.println(capacity);
	}
	
	 public int shipWithinDays(int[] weights, int D) {
			
			int minCapacity = 1;       
	        int maxCapacity = 500*50000;
	        while(minCapacity<=maxCapacity) {
	           int midCapacity = minCapacity + (maxCapacity-minCapacity)/2;
	            boolean can = canShip(weights, D, midCapacity);
	            if(can) 
	                maxCapacity= midCapacity-1;
	            else 
	                minCapacity = midCapacity+1; 
	            }
	        return  minCapacity;  
	     }
	    
	    private static boolean canShip(int[] weights, int D, int capacity) {
	        int day =1;
	        int tempWeight=0;
	        for(int i=0; i<weights.length; i++) {     
	           if(weights[i] > capacity ||day>D) return false;
	            
	           if(tempWeight+weights[i]<=capacity) 
	               tempWeight+=weights[i];
	           else {
	               day++;
	               tempWeight = weights[i];
	            }
	        }
	        return day<=D;
	    }	
}
// Runtime: 6 ms, faster than 97.93% of Java online submissions for Capacity To Ship Packages Within D Days.
// Memory Usage: 41.8 MB, less than 97.22% of Java online submissions for Capacity To Ship Packages Within D Days.
    
