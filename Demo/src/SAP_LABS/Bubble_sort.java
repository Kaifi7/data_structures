package SAP_LABS;

public class Bubble_sort {

	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void sort(int arr[], int n) {
		int temp;
		boolean swapped = false;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					swapped = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped)
				break;
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 9, 8, 1, 21, 15};
		int n = arr.length;
		System.out.println("array before sorting : ");
		printArray(arr,n);
		System.out.println("Array after sorting : ");
		sort(arr,n);
		printArray(arr,n);
	}

}
