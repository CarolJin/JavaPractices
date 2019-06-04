package binarySearch;

public class CapacityToShipAllWithinDdays1 {
	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int D = 3;
		
		CapacityToShipAllWithinDdays1 ca = new CapacityToShipAllWithinDdays1();
		int capacity = ca.shipWithinDays(weights, D);
		System.out.println(capacity);
	}
	
	public int shipWithinDays(int[] weights, int D) {
		int maxWeight = findMax(weights);

		// if D is bigger or equal to target array length, then we only need to find the max value in the target array, that's the `capacity` you need!
		if (weights.length <= D)
			return maxWeight;

		int avgWeight = getAvg(weights, D);

		//Get capacity range: `min` & `max`, the final capacity you're looking for is for sure within this range.
		int minCapacity = Math.max(avgWeight, maxWeight);       
        int maxCapacity = weights.length * minCapacity;
		//Loop till we find the final & minimal capacity that can ship everything within D days:
        while(minCapacity<=maxCapacity) {
           int midCapacity = (minCapacity+ maxCapacity)/2;
            boolean can = canShip(weights, D, midCapacity);
            if(can) 
                maxCapacity= midCapacity-1;
            else 
                minCapacity = midCapacity+1; 
            }
        return  minCapacity;  
     }
    
    private static boolean canShip(int[] weights, int D, int capacity) {
        int day =1; // day starts with 1, because one the following loop started, day1 is consumed!
        int tempWeight=0;
		//Loop through the target array, get a `day` & compare it with the given D, return the result:
        for(int i=0; i<weights.length; i++) {     
           if(day>D) return false;
            
           if(tempWeight+weights[i]<=capacity) 
               tempWeight+=weights[i];
           else {
               day++;
               tempWeight = weights[i];
            }
        }
        return day<=D;
    }

	private static int findMax(int[] weights) {
		if (weights.length <= 0)
			return 0;

		int max = 0;
		for (int w : weights) {
			if (w > max)
				max = w;
		}
		return max;
	}

	private static int getAvg(int[] weights, int D) {
		int sum = 0;
		for (int w : weights) {
			sum += w;
		}
			return (int)Math.ceil(sum / D);
			//get integer(5.2 ->6 | 5 -> 5)
	}
}
// Runtime: 6 ms, faster than 97.93% of Java online submissions for Capacity To Ship Packages Within D Days.
// Memory Usage: 41.8 MB, less than 97.22% of Java online submissions for Capacity To Ship Packages Within D Days.
 
