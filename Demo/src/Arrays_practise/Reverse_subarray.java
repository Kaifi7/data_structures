package Arrays_practise;

public class Reverse_subarray {

	static void reverseSubArray(int arr[], int n, int x, int y) {
		int left =x-1, right = y-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		int x=2, y=4;
		printArray(arr, n);
		reverseSubArray(arr, n, x, y);
		System.out.println("Array after reversing in range " +x+" "+y );
		printArray(arr, n);
	}

}
