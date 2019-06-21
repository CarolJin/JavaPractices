/*
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .
*/

import java.io.*;
import java.math.*;
import java.util.*;


public class ConsecutiveBinaryOnes {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Queue<Integer> qu = new LinkedList<Integer>();
        int reminder;
        while(n>0) {
            reminder = n%2;
            n = n/2;
            qu.add(reminder);
        }

        int count = 0;
        int max = 0;
        while(!qu.isEmpty()) {
            if(qu.poll()==1) {
                count++;
                if(count>max) max = count;
            }
            else count=0;
        }

        System.out.print(max);

        scanner.close();
    }
}
