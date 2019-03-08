package findNumbersFromArray;

import java.util.ArrayList;

public class Remove10Multiples {

	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		for(int i=1; i<=100; i++){
			if(i%10!=0){
				list.add(Integer.toString(i));
			}							
		}
		System.out.println(list);
	}
	
}
