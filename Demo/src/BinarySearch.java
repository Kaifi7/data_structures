
public class BinarySearch {

	public int bsearch(int arr[], int l, int r, int x) {
		
		if(r>=l) {
			int mid = l + (r-l)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x) 
				return bsearch(arr, l, mid-1, x);
			else
				return bsearch(arr, mid+1, r,  x);	
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 8, 10, 12, 18, 20, 23, 25};
		int n = arr.length;
		int x= 23;
		BinarySearch bs = new BinarySearch();
		int result = bs.bsearch(arr, 0, n-1, x);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index : " +result);
	}

}
//complexity is O(log n);

