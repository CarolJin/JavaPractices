import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 1. Same shopper must be in the same list
 * 2. Any letters in between the two same letters have to in the same list too
 * Input: ababcbacadefegdehijhklij
 * Output: 
 * a - a: a,b,c => ababcbaca (9)
 * d - d: d, e, f, g => defegde (7)
 * h -h, j - j: h, j, i, k, l => hijhklij (8)
 */

public class longestNoOverlappingSubStringShoppers {
	
	public static void main(String[] args) {
		String str = "ababcbacadefegdehijhklij";
		char[] characters = str.toCharArray();
		List<Character> inputList = new ArrayList<Character>();
		for (int i = 0; i < characters.length; i++) {
			inputList.add(characters[i]);
		}
		longestNoOverlappingSubStringShoppers instance = new longestNoOverlappingSubStringShoppers();
		System.out.println(instance.noOverlapShopperList(inputList));
	}

	List<Integer> noOverlapShopperList(List<Character> inputList) {

		List<Integer> output = new ArrayList<Integer>();

		int n = inputList.size();
		int start = 0;
		int end = 0;
		List<Interval> newList = new LinkedList<>();

		if (n < 1)
			return null;
		if (n == 1) {
			output.add(1);
			return output;
		}

		// Save every same characters from start - end as interval
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (inputList.get(i).equals(inputList.get(j))) {
					start = i;
					end = j;
					Interval newInterval = new Interval(start, end);
					newList.add(newInterval);
				}
			}
		}

		/*
		 * for (int i = 0; i < newList.size()-1; i++) { int newStart=0; int
		 * newEnd=0; int j = i+1; while(j < newList.size()-1) {
		 * if(newList.get(i).end > newList.get(j).end && newList.get(i).start <
		 * newList.get(j).start) { newList.remove(j); j=j+1; } else if
		 * (newList.get(i).end > newList.get(j).start) { newStart =
		 * Math.min(newList.get(i).start, newList.get(j).start); newEnd =
		 * Math.max(newList.get(i).end, newList.get(i+1).end); } int length =
		 * newEnd - newStart + 1; output.add(length); } }
		 */
		List<Interval> results = merge(newList);
		for (Interval i : results) {
			int length = i.end - i.start + 1;
			output.add(length);
		}
		return output;
	}

	private List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() <= 1)
			return intervals;

		List<Interval> result = new LinkedList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;

		for (Interval interval : intervals) {
			if (interval.start <= end) // Overlapping intervals, move the end if
										// needed
				end = Math.max(end, interval.end);
			else { // Disjoint intervals, add the previous one and reset bounds
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}