//Insert Delete GetRandom O(1) - Duplicates allowed

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedCollection {
	
	public static void main(String[] args) {
		int val = 1;
		int val2 = 2;
		int val3 = 2;
		int val4 = 3;
		int val5 = 100;
		RandomizedCollection obj = new RandomizedCollection();
		boolean param_1 = obj.insert(val);
		boolean param_12 = obj.insert(val2);
		boolean param_2 = obj.remove(val);
		boolean param_13 = obj.insert(val3);
		boolean param_22 = obj.remove(val2);
		boolean param_14 = obj.insert(val4);
		boolean param_100 = obj.insert(val5);
		int param_3 = obj.getRandom();
		System.out.println(param_1);
		System.out.println(param_12);
		System.out.println(param_2);
		System.out.println(param_13);
		System.out.println(param_22);
		System.out.println(param_14);
		System.out.println(param_3);
	}
	    
	    private ArrayList<Integer> al;
	    private HashMap<Integer, ArrayList<Integer>> hm; 
	    private Random random = new Random();

	    /** Initialize your data structure here. */
	    public RandomizedCollection() {
	    	al = new ArrayList<Integer>();
	    	hm = new HashMap<Integer, ArrayList<Integer>>();
	    }
	    
	    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	    public boolean insert(int val) {
	        boolean flag = false;
	        
	        if(!hm.containsKey(val)) {
	        	al = new ArrayList<Integer>();
	        	flag = true;
	        } else {
	        	al = hm.get(val);
	        	}
	            
	         al.add(val); 
	         hm.put(val, al);
	         System.out.println("the total map is "+ hm);
	         
	        return flag;
	    }
	    
	    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
	    public boolean remove(int val) {
	        boolean flag = false;
	        if(hm.containsKey(val)) {
	           al = hm.get(val); 
	           al.remove(al.size()-1);
	           flag = true; 
	           if(al.size()==0) hm.remove(val);
	        }
	        System.out.println("the remain map is "+ hm);
	        return flag;
	        
	    }
	    
	    /** Get a random element from the collection. */
	    public int getRandom() {
	    	if(hm.isEmpty()) return 0;
	    	Object [] keys = hm.keySet().toArray(); 
	    	int i =keys.length;
	    	return (int) keys[random.nextInt(i)];
	    }
	}

	/**
	 * Your RandomizedCollection object will be instantiated and called as such:
	 * RandomizedCollection obj = new RandomizedCollection();
	 * boolean param_1 = obj.insert(val);
	 * boolean param_2 = obj.remove(val);
	 * int param_3 = obj.getRandom();
	 */
