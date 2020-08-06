package Arrays_practise;

public class Immediate_smaller_element {

	static void findSmaller(int arr[], int n) {
		int temp = arr[n-1];
		arr[n-1] =-1;
		for(int i=n-2; i>=0; i--) {
			int temp2 = arr[i];
			if(arr[i]>temp) {
				arr[i]= temp;
				
			}
			else {
				arr[i]=-1;
			}
			temp = temp2;
		}
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5, 6, 2, 3, 1, 7};
		int n = arr.length;
		findSmaller(arr, n);
		printArray(arr, n);
	}

}
