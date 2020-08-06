package Arrays;

// leader element is the one which is greater then all elements on the right side
public class Leaders {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void findLeaders(int arr[], int n) {
		int lar = arr[n-1];
		System.out.print(lar + " ");
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>lar) {
				lar = arr[i];
				System.out.print(lar + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		printArray(arr, arr.length);
		System.out.println("Printing leaders ");
		findLeaders(arr, arr.length);
	}

}
