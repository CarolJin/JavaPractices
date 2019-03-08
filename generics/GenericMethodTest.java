package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodTest {

	    public static void main( String args[] )
	    {
	        Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	       
	        printArray( intArray ) ;
	        printArray( doubleArray ); 
	        printArray( charArray ); 

	        ArrayList<Integer> aL = new ArrayList<> (Arrays.asList(1,2,5,3,7));
	        printArrayList(aL);
	        
	        myGeneric<Integer> mgI = new myGeneric<Integer>();
	        mgI.setVal(10);
	        System.out.println("The new generic array has data: " + mgI.getVal());
	        
	        myGeneric<String> mgI2 = new myGeneric<String>();
	        mgI2.setVal("Dog");
	        System.out.println("The new generic array has data: " + mgI2.getVal());
	    } 
	    
		// 泛型方法 printArray                         
		   public static < E > void printArray( E[] inputArray )
		   {         
		         for ( E element : inputArray ){        
		            System.out.printf( "%s ", element );
		         }
		         System.out.println();
		    }
		                        
		   public static void printArrayList( ArrayList<?> aL)
		   {           
		         for (Object element : aL ){        
		            System.out.printf( "%s ", element );
		         }
		         System.out.println();
		    }
}

class myGeneric<T> {
	T val;

	public void setVal(T value) {
		this.val = value;
	}

	public T getVal() {
		return val;
	}
}
