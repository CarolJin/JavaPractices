// Write a java program to find factors of number from 1 to 100

package findNumbersFromArray;

public class FindFactorsfromOneToAHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++){
			System.out.println(i + " has factor(s): ");
			for(int j=1; j<=i; j++){
				if(i%j==0){
					System.out.println(j);
				}
			}
		}
	}

}
