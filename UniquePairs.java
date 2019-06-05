// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

/* 

Given an array of integers, find all unique pairs with least distance.

For example, 
if array given is {10, 11, 15, 18, 12, 29, 31, 45, 50, 19, 51}, should return {(10, 11), (11, 12), (18, 19), (50,51)}
if array given is { 30, 40, 45, 50, 60,10, 15 }, should return {(10, 15), (40, 45), (45, 50)}

Write junit tests for the same. 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


class UniquePairs {
	public static void main(String[] args) {
		int[] arr = {10, 11, 15, 18, 12, 29, 31, 45, 50, 19, 51};       

		List<Interval> results = getUniquePairs(arr);

		results.forEach(itv -> System.out.printf("[%d %d] ", itv.start, itv.end));

	}

	public static ArrayList<Interval> getUniquePairs(int[] arr) {
        
        HashMap<Integer, ArrayList<Interval>> hm = new HashMap<>();
		ArrayList<Interval> al = new ArrayList<Interval>();
        
        if(arr.length<2) {
           System.out.println("Lack of array element..");
           return al;
        }

		for (int i = 0; i < arr.length - 1; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] >= arr[i]) {
					int distance = arr[j] - arr[i];
					if (!hm.containsKey(distance)) {
						al = new ArrayList<Interval>();
					} else {
						al = hm.get(distance);
					}

					Interval it = new Interval(arr[i], arr[j]);
					al.add(it);
					hm.put(distance, al);
				}
				j++;
			}
		}

		Set set = hm.entrySet();
		Iterator iterator = set.iterator();
		int min = Integer.MAX_VALUE;

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			int key = (int) mentry.getKey();
			if (key < min)
				min = key;
		}
        
        if(hm.isEmpty()) {
			System.out.println("No valid pairs..");
			return al;
		}
		return hm.get(min);
	}

}

class Intervall {
	int start;
	int end;

	Intervall() {
		start = 0;
		end = 0;
	}

	Intervall(int s, int e) {
		start = s;
		end = e;
	}
}


/*
{10, 11, 15, 18, 12, 29, 31, 45, 50, 19, 51} 
{10, -1, 0}
{10, 10} 
{0,0,0}
{1}
{}
{11, -1}
*/
