package Arrays_practise;

public class RemoveDuplicates {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static int remove(int arr[], int n) {
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(arr[i]!=arr[i+1])
				arr[j++] = arr[i];
		}
		arr[j++] = arr[n-1];
		return j;
	}
	public static void main(String[] args) {
		 int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
	     int n = arr.length;
	     printArray(arr, n);
	     int k = remove(arr, n);
	     printArray(arr, k);
	}

}
