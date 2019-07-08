package freePractice;

public class PrintArrays {
		public static void main(String[] args) 
		    { 
		        int arr[] = { 11, 22, 33 }; 
		        printArrays(arr);
		        int arr2[] = new int[] { 11, 22, 33 }; 
		        printArrays(arr2);
		    } 
		public static void printArrays(int [] array){
			for (int i = 0; i < array.length; i++) 
	            System.out.print(array[i] + " "); 
		}
 
}
