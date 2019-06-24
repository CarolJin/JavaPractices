//Get maximum difference from an array
//Pass variable into different classes

import java.util.*;
import java.math.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference (int[] input) {
        this.elements = input;
    }
	public void computeDifference(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < elements.length; i++) {
            if(elements[i]<min) min = elements[i];
            if(elements[i]>max) max = elements[i];
        }
        maximumDifference = Math.abs(max-min);
    }
}

public class MaximumDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
