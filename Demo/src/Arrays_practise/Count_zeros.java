package Arrays_practise;

public class Count_zeros {

	static int firstZero(int arr[], int low, int high) {
		if(high>=low) {
			int mid = low + (high - low)/2;
			if( ((mid == 0) || arr[mid-1] == 1) && arr[mid] == 0)
				return mid;
			if(arr[mid] == 1)
				return firstZero(arr, mid+1, high);
			else
				return firstZero(arr, low, mid-1);
		}
		return -1;
	}
	static int countZeros(int arr[], int n) {
		int first = firstZero(arr, 0, n-1);
		if(first==-1)
			return 0;	
		return n-first;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,0,0,0,0,0};
		int n = arr.length;
		System.out.println("Count of zeros is : " +countZeros(arr, n));
	}

}
