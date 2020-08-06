package SAP_LABS;

public class Second_largest {

	static void findSecondLargest(int arr[], int n) {
		int largest = Integer.MIN_VALUE;
		int secLargest = largest -1;
		for(int i=0; i<n; i++) {
			if(arr[i]>largest) {
				secLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]> secLargest && arr[i]<largest) {
				secLargest = arr[i];
			}
			System.out.println(largest + " " +secLargest);
		}
		System.out.println("Second largest is : " +secLargest);
	}
	public static void main(String[] args) {
		int arr[] = {89, 24, 75, 11, 23};
		int n = arr.length;
		findSecondLargest(arr, n);
	}

}
