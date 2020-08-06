package Arrays_practise;

public class Sort_binary_array {

	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void sortbinary(int arr[], int low, int high) {
		while(low<=high) {
			if(arr[low] == 1 && arr[high] ==0) {
				arr[low] = 0;
				arr[high]=1;
				low++;
				high --;
			}
			else if(arr[low] == 0 && arr[high] ==0 ) {
				low++;
			}
			else if(arr[low]==0 && arr[high]==1) {
				low++;
				high --;
			}
			else {
				high--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
		printArray(arr);
		sortbinary(arr, 0, arr.length-1);
		printArray(arr);
	}

}
