package realPractices;

/*Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 

Input:
The first line of input contains an integer, the number of test cases T. T testcases follow. Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every testcase it contains of an integer N.

Output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.

Constraints:
1 <= T <= 100
-103 <= A <= 103
-103 <= B <= 103
1 <= N <= 104

Example:
Input:
2
2 3
4
1 2
10

Output:
5
10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 

Input:
The first line of input contains an integer, the number of test cases T. T testcases follow. 
Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). 
In the second line of every testcase it contains of an integer N.
Output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.

Constraints:
1 <= T <= 100
-103 <= A <= 103
-103 <= B <= 103
1 <= N <= 104

Example:
Input:
2
2 3
4
1 2
10

Output:
5
10   */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 

Input:
The first line of input contains an integer, the number of test cases T. T testcases follow. 
Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). 
In the second line of every testcase it contains of an integer N.
Output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.

Constraints:
1 <= T <= 100
-103 <= A <= 103
-103 <= B <= 103
1 <= N <= 104

Example:
Input:
2
2 3
4
1 2
10

Output:
5
10   */

import java.util.Scanner;

public class SeriesAP {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Please start to enter the number of testcases, a, b, n: ");
		final int numberOfTestCases = Integer.parseInt(scanner.nextLine());

		final String[] testCases = new String[numberOfTestCases];
		final int[] ns = new int[numberOfTestCases];
		for (int i = 0; i < numberOfTestCases; i++) {
			testCases[i] = scanner.nextLine();
			ns[i] = Integer.parseInt(scanner.nextLine());
		}

		for (int i = 0; i < numberOfTestCases; i++) {
			final String[] testCaseInput = testCases[i].split(" ");
			final int a = Integer.parseInt(testCaseInput[0]);
			final int b = Integer.parseInt(testCaseInput[1]);

			int diff = b - a;
			int nthNumber = b;
			
			if((ns[i] - 2)>0){
				for (int j = 0; j < ns[i] - 2; j++) {
					nthNumber = b + diff*(ns[i] - 2);
				}
			}
			if(ns[i]==1) nthNumber =a;
			if(ns[i]==2) nthNumber =b;

			System.out.println(nthNumber);
		}
	}
}
