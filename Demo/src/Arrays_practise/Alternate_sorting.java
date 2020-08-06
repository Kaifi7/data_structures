package Arrays_practise;

import java.util.Arrays;

public class Alternate_sorting {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void alternateSort(int arr[], int n) {
		Arrays.sort(arr);
		int low = 0, high = n-1;
		int i=0;
		for(int j=0; j<n; j+=2) {
			int temp = arr[i];
			arr[i] = arr[high];
			arr[i+1] = temp;
			i++;
			high--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {7, 1, 2, 3, 4, 5, 6};
		int n = arr.length;
		printArray(arr, n);
		alternateSort(arr, n);
		printArray(arr, n);
	}

}
