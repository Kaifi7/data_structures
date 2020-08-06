package Arrays_practise;

public class Finding_the_num_in_bitonic_array {

	static int findBitonicPoint(int arr[], int n, int l, int r) {
		int mid;
		mid = (l+r)/2;
		if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
			return mid;
		else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
			return findBitonicPoint(arr, n, mid+1, r);
		else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
			return findBitonicPoint(arr, n, l, mid-1);
		return mid;
	}
	static int searchBitonic(int arr[], int n, int key, int index) {
		if(key>arr[index])
			return -1;
		else if(key == arr[index])
			return index;
		else {
			int temp = ascendingBinarySearch(arr, 0, index-1, key);	
			if(temp!=-1)
				return temp;
			return descendingBinarySearch(arr, index+1, n-1, key);
		}
	}
	static int ascendingBinarySearch(int arr[], int l, int r, int key) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid]>key)
				return ascendingBinarySearch(arr, l, mid-1, key);
			else
				return ascendingBinarySearch(arr, mid+1, r, key);
		}
		return -1;
	}
	static int descendingBinarySearch(int arr[], int l, int r, int key) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				return descendingBinarySearch(arr, mid+1, r, key);
			else
				return descendingBinarySearch(arr, l, mid-1, key);
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {-8, 1, 2, 3, 4, 5, -2, -3};
		int n = arr.length;
		int index = findBitonicPoint(arr, n, 0, n-1);
		int key = 5;
		int x = searchBitonic(arr, n, key, index);
		if(x==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at index " +x);
		
	}

}
