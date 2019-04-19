public class longestNoOverlappingSubStringShoppers {
	
	public static void main(String[] args) {
		String str1 = "ababcbacadefegdehijhklij";
		String str2 = "abcd";
		char[] characters = str1.toCharArray();
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
			for (int j = n - 1; j >= i; j--) { //Need '=' here to handle non-repeat characters!
				if (inputList.get(i).equals(inputList.get(j))) {
					start = i;
					end = j;
					Interval newInterval = new Interval(start, end);
					newList.add(newInterval);
				}
			}
		}

		List<Interval> results = merge(newList);  //merge & reduce the overlapping intervals
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
