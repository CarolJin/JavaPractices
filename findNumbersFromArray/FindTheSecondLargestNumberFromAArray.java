package findNumbersFromArray;

import java.util.Arrays;

public class FindTheSecondLargestNumberFromAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = {2, 56, -3, 88, 1, 0, 1000, 901, -1001};
		
		Arrays.sort(intArray);
		int theSecondLargestNum = intArray[intArray.length-2];
		
		System.out.println("The second largest number of the array is: " + theSecondLargestNum);
	}

}
