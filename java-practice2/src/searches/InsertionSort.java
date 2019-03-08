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
