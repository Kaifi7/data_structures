package Arrays_practise;

public class Reverse_an_array_upto_given_position {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void reverse(int arr[], int n, int k) {
		if(k>n)
			return;
		int left = 0, right = k-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		int n = arr.length, k=5;
		printArray(arr, n);
		reverse(arr, n, k);
		printArray(arr, n);
	}

}
