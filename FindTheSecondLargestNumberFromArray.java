package findNumbersFromArray;

import java.util.Arrays;

public class FindTheSecondLargestNumberFromArray {

	public static void main(String[] args) {

		int intArray[] = { 2, 56, -3, 88, 1, 0, 1000, 901, -1001 };
		System.out.println("The second largest number of the array is: " + find2ndLargestNum(intArray));
	}

	public static int find2ndLargestNum(int[] arr) {
		int largestNum = 0;
		int SecondLargestNum = 0;

		if (arr.length < 2) {
			return 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNum) {
				SecondLargestNum = largestNum;
				largestNum = arr[i];
			} else if (arr[i] > SecondLargestNum) {
				SecondLargestNum = arr[i];
			}
		}
		return SecondLargestNum;
	}

}
