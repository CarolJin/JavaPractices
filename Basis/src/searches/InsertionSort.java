package searches;

//the best sorting

public class InsertionSort {
	
	public static void InsertionSort(int[] theArray){
		int arraySize = theArray.length;
		for(int i=0; i< arraySize; i++){
			int j=i;
			int toInsert =theArray[i];
			while((j>0)&&(theArray[j-1])>toInsert){
				theArray[j]=theArray[j-1];
				j--;
			}
			theArray[j]=toInsert;
		}
	}
	public static void main (String args[]){
		int[] array = {23, 24, 11, 4, 8, 60, 11, 45, 34, 77, 3, 1};
		InsertionSort(array);
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+ " ");
		}
	}
}

/*
package searches;

public class InsertionSort2 {

	static void insertionSort(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int j = i-1;
			int toInsert = arr[i];
			while (j >= 0 && arr[j] > toInsert) {
				arr[j + 1] = arr[j];
				printArray(arr);
				j--;
			}
			arr[j+1] = toInsert;
		}
		printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int a : arr)
			System.out.print(a + " ");
		System.out.print("\n");
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = {2,3,4,5,6,7,8,9,10,1};
		
		insertionSort(n, arr);
	}

}

*/
