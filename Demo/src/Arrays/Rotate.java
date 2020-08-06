package Arrays;

public class Rotate {

	static void leftRotate(int arr[] , int d, int n) {
		for(int i =0; i<d; i++) {
			leftRotateByOne(arr, n);
		}
	}
	static void leftRotateByOne(int arr[], int n) {
		int i,temp;
		temp = arr[0];
		for(i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i]= temp;
	}
	static void Rotate(int arr[], int d, int n) {
		int[] temp = new int[d];
		for(int i=0; i<d; i++) {
			temp[i] = arr[i];
		}
		for(int i=0; i<n-d;i++) {
			arr[i] = arr[i+d];
		}
		int k=0;
		for(int i=n-d;i<n;i++) {
			arr[i] = temp[k++];
		}
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {1,2 ,3, 4, 5, 6, 7};
		printArray(arr, 7);
		System.out.println("printing array after left rotating : ");
		//leftRotate(arr, 2, 7);
		Rotate(arr, 5, 7);
		printArray(arr, 7);
	}

}
