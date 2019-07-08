package generics;

import java.util.Collection;
import java.util.HashSet;

public class GenericsGeneral {

	public void work(){
		Collection<String> Col1 = new HashSet<String>();
		this.consume(Col1);
	}
	
	public void consume(Collection <String> a){
		for(String aa: a){
			System.out.println("This is aa: "+aa);
		}
	}
	
	public static void main(String []args){
	
	}
}
