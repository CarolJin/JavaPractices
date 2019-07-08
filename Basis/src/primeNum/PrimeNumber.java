package primeNum;

import java.util.*;

public class PrimeNumber {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num = input.nextInt();
		for (num=2;num<=100;num++){
			if(isPrime(num)){
			System.out.println(num + " is a number.");
			}
		}
	}
	public static boolean isPrime (int num){
		int i;
		if(num==2) return true;
		if(num<2||num%2==0) return false;	
		for(i=3;i<=Math.sqrt(num); i+=2){
			if(num%i==0) return false;
		}

		return true;
	}
}