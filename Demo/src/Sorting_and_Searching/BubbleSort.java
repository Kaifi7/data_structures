package Sorting_and_Searching;

public class BubbleSort {

	static void bubble(int arr[], int n) {
		boolean swapped;
		for(int i=0; i<n-1; i++) {
			swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped= true;
				}
			}
			if(!swapped)
				return;
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 1, 15, 12, 11};
		int n = arr.length;
		bubble(arr, n);
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
	}

}
