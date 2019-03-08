package freePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLocation {
	public static void main(String[] args) 
    { 
        int arr[] = new int[5]; 
        System.out.println(arr); //arr : It is giving the base address of array
        System.out.println(arr[0]); //arr[0] : It is giving value of array element at 0th location.
   
     //Array sorting:
        Integer [] arr1 = {23, 11, 9, 3, 19, 34, 2, 8, 4};
        Arrays.sort(arr1);
        System.out.println("Int array sorting: " + Arrays.toString(arr1));
        Arrays.sort(arr1, Collections.reverseOrder()); //Not appliable when the arr1 is in data type: int, Collections.reverseOrder doesn't work for primitive types. 
        System.out.println("Int array reverse sorting: " + Arrays.toString(arr1));
     //ArrayList sorting
        // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al);
        System.out.println("List after the use of"
                + " Collection.sort() :\n" + al); 
        
        Collections.sort(al, Collections.reverseOrder());
  
        // Let us print the sorted list 
        System.out.println("List after the use of"
                           + " Collection.reverseOrder() :\n" + al); 
    }
}
