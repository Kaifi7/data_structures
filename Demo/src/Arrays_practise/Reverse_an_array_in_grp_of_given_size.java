package Arrays_practise;

public class Reverse_an_array_in_grp_of_given_size {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void reverse(int arr[], int n, int k) {
		for(int i=0; i<n; i+=k) {
			int left = i;
			int right = Math.min(i+k-1, n-1);
			while(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
        int k = 3;
        int n = arr.length;
        printArray(arr, n);
        reverse(arr, n, k);
        System.out.println("Array after reversing in groups of " +k);
        printArray(arr, n);
	}

}
