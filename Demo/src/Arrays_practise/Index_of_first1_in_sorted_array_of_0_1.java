package Arrays_practise;

public class Index_of_first1_in_sorted_array_of_0_1 {

	static int findIndex(int arr[], int low, int high) {
		if(low <= high) {
			int mid = (low+high)/2;
			if((mid==0 || arr[mid-1]==0) && arr[mid]==1)
				return mid+1;
			else if(arr[mid]==0)
				return findIndex(arr, mid+1, high);
			else
				return findIndex(arr, low, mid-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {0, 0, 0, 1};
		int n = arr.length;
		System.out.println(findIndex(arr, 0, n-1));
	}

}
