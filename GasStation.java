class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas==null || gas.length==0) return -1;
        
        int start = gas.length-1;
        int index =0;
        int sum =gas[start] - cost[start];
        
        while(start>index) {
            if(sum>=0) {
                sum += gas[index] - cost[index];
                index++;
            }
            else {
                --start;
                sum += gas[start] - cost[start];
            }
        }
        
        return sum>=0 ? start : -1;
    }        
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Gas Station.
//Memory Usage: 36.7 MB, less than 64.58% of Java online submissions for Gas Station.

class GasStation0 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas==null || gas.length==0) return -1;
        
        for(int i = 0; i < gas.length; i++) {
           if(gas[i]>=cost[i]) {
             if(getLeftoverGas(gas, cost, i))
                 return i;
           } 
        }
        return -1;
    }
    
    private boolean getLeftoverGas(int[] gas, int[] cost, int start) {
        int left = 0;
        for(int i = start; i < gas.length; i++) {
            left = left + gas[i] - cost[i];
            if(left<0) 
                return false;
        }
        for(int i = 0; i <= start; i++) {
            left = left + gas[i] - cost[i];
            if(left<0) 
                return false;
        }
        return true;
    }
}
