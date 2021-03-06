/*We define super digit of an integer  using the following rules:

Given an integer, we need to find the super digit of the integer.

If  has only  digit, then its super digit is .
Otherwise, the super digit of  is equal to the super digit of the sum of the digits of .
For example, the super digit of  will be calculated as:

	super_digit(9875)   	9+8+7+5 = 29 
	super_digit(29) 	2 + 9 = 11
	super_digit(11)		1 + 1 = 2
	super_digit(2)		= 2  
You are given two numbers  and . The number  is created by concatenating the string   times. Continuing the above example where , assume your value . Your initial  (spaces added for clarity).

    superDigit(p) = superDigit(9875987598759875)
                  5+7+8+9+5+7+8+9+5+7+8+9+5+7+8+9 = 116
    superDigit(p) = superDigit(116)
                  1+1+6 = 8
    superDigit(p) = superDigit(8)
All of the digits of  sum to . The digits of  sum to .  is only one digit, so it's the super digit.

Function Description

Complete the function superDigit in the editor below. It must return the calculated super digit as an integer.

superDigit has the following parameter(s):

n: a string representation of an integer
k: an integer, the times to concatenate  to make 
Input Format

The first line contains two space separated integers,  and .

Constraints

Output Format

Return the super digit of , where  is created as described above.

Sample Input 0

148 3
Sample Output 0

3
Explanation 0

Here  and , so .

super_digit(P) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperDigit {

    static int superDigit(String n, int k) {
        if(n.length()==1 && k==1)  return Integer.parseInt(n);

        long sum = 0;
        for(int i =0; i<n.length(); i++) {
            char c = n.charAt(i);
            sum += Character.getNumericValue(c);
        }

        sum*=k;

       return superDigit(new Long(sum).toString(),1);  //Long.toString(sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


//JavaScript version:

'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the digitSum function below.
function digitSum(n, k) {
    if (n.length == 1 && k == 1) return parseInt(n);

    let sum = 0;
    for (let i = 0; i < n.length; i++) {
        sum += parseInt(n.charAt(i));
    }

    sum *= k;

    return digitSum(sum.toString(),1);

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nk = readLine().split(' ');

    const n = nk[0];

    const k = parseInt(nk[1], 10);

    const result = digitSum(n, k);

    ws.write(result + '\n');

    ws.end();
}
