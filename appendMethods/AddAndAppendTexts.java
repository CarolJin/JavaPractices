package appendMethods;

import java.util.ArrayList;
import java.util.List;

public class AddAndAppendTexts {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

//		Use a List<String>, such as an ArrayList<String>. It's dynamically growable, unlike arrays (see: Effective Java 2nd Edition, Item 25: Prefer lists to arrays).


		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list); // prints "[1, 2, 3]"
/**	If you insist on using arrays, you can use java.util.Arrays.copyOf to allocate a bigger array to accomodate the additional element. This is really not the best solution, though.

		public String[] appendText(ArrayList<String> arr, String element){
		    final int N = arr.length;
		    arr = Arrays.copyOf(arr, N + 1);
		    arr[N] = element;
		    return arr;
		}

		String[] arr = { "1", "2", "3" };
		System.out.println(Arrays.toString(arr)); // prints "[1, 2, 3]"
		arr = append(arr, "4");
		System.out.println(Arrays.toString(arr)); // prints "[1, 2, 3, 4]"
		This is O(N) per append. ArrayList, on the other hand, has O(1) amortized cost per operation.
**/

	}

}
