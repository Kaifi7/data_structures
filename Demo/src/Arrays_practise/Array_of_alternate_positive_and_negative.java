package Arrays_practise;

public class Array_of_alternate_positive_and_negative {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void alternate(int arr[], int n) {
		
	}
	public static void main(String[] args) {
		int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		int n = arr.length;
		printArray(arr, n);
		alternate(arr, n);
		System.out.println("Array after shufling : ");
		printArray(arr, n);
	}

}
