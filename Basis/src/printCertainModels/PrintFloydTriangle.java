package printCertainModels;

import java.util.Scanner;

/**
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 *
 */

public class PrintFloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,row,element,num=1;
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Floyd Triangle");
		
		for(row=1;row<=n; row++){
			for(element=1; element<=row; element++){
				
				System.out.print(num + " ");
				num++;
			}
			System.out.println(" ");
		}
	}

}
