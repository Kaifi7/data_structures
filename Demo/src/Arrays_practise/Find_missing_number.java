package Arrays_practise;

public class Find_missing_number {

	static int findMissing(int arr[], int n) {
		int sum = n*(n+1)/2;
		for(int i=0; i<arr.length; i++) {
			sum-=arr[i];
		}
		return sum;
	}
	static int findMissingInSorted(int arr[], int low, int high) {
		if(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid]!=(mid))
				return mid;
			else if(arr[mid] == (mid))
				return findMissingInSorted(arr, mid+1, high);
			else
				return findMissingInSorted(arr, low, mid-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {2, 5, 3, 1};
		int arr1[] = {0, 1, 2, 3, 4, 5, 7};
		System.out.println(findMissing(arr, n));
		System.out.println(findMissingInSorted(arr1, 0, arr1.length-1));
	}

}
