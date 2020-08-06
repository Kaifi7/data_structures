package Arrays_practise;

public class Find_transition_point_in_binary_array {

	static int findTransition(int arr[], int low, int high) {
		if(low<=high) {
			int mid = low + (high -low )/2;
			if(mid==0 && arr[mid]==1)
				return -1;
			if((arr[mid]==1 && arr[mid-1]==0) || (mid==0 && arr[mid]==1))
				return mid;
			else if(arr[mid] == 1)
				return findTransition(arr, low, mid-1);
			else if(arr[mid] == 0)
				return findTransition(arr, mid+1, high);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,1};
		if(findTransition(arr, 0, arr.length-1)==-1)
			System.out.println(-1);
		else
		System.out.println( 1 + findTransition(arr, 0, arr.length-1));
	}

}
