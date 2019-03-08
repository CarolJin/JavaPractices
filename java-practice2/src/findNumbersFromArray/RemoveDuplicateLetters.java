package findNumbersFromArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateLetters {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String ss=sc.nextLine();
			
		System.out.println(removeDuplicates(ss));
	}
	
	public static String removeDuplicates(String str){
		Set<Character> set1= new HashSet<>();
		StringBuffer sf= new StringBuffer();
		
		for(int i=0; i<str.length();i++){
			Character c=str.charAt(i);
			if(!set1.contains(c)){
				set1.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
		
	}

}
