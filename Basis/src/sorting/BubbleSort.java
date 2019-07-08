package sorting;

public class BubbleSort {
	private void bubblesort (int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	private void printArray(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++){
		   System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String []args) {
		int a[] = {12, 4, 7, 8, 1, 90, 22, 3, 66};
		BubbleSort bs = new BubbleSort();
		bs.bubblesort(a);
		System.out.println("Sorted array:");
		bs.printArray(a);
	}
}
