package freePractice;

import java.util.Scanner;

public class Factorial {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Enter an integer please: ");
		int myint = keyboard.nextInt();
		int newint = factorial(myint);
		System.out.println(newint);
	}
	
	public static int factorial(int n){
		if(n>1){
			return n * factorial(n-1);
		}else return 1;
	}

}
