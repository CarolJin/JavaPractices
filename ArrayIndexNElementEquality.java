package binarySearch;

//a sorted & distinct array, need to find the lowest index of Array Index & Element Equality
//You can get O(n) easily with a for loop, but if you need O(log(n)), you have to use binary search:

public class ArrayIndexNElementEquality {

	public static void main(String[] args) {
		int[] arr = { -3, -2, 1, 3 };
		System.out.println(indexEqualsValueSearch(arr));
	}

	private static int indexEqualsValueSearch(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return -1;
		if (n == 1) {
			if (arr[0] == 0)
				return 0;
			return -1;
		}

		int lowest = n;
		int start = 0;
		int end = n - 1;
		while (end >= start) {
			if (start == end) {
				if (arr[start] == start)
					lowest = start;
			}
			int mid = start + (end - start) / 2;
			if (arr[mid] >= mid) {
				if (arr[mid] == mid)
					lowest = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		if (lowest == n)
			return -1;
		return lowest;
	}

}
