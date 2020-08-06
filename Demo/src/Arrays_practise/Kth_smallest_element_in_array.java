package Arrays_practise;

public class Kth_smallest_element_in_array {

	static int kthSmallest(int arr[], int l, int r, int k) {
		if(k>0 && k<=r-l+1) {
			int pos = partition(arr, l, r);
			if(pos-l == k-1)
				return arr[pos];
			if(pos-l > k-1)
				return kthSmallest(arr, l, pos-1, k);
			return kthSmallest(arr, pos+1, r, k-pos+l-1);
		}
		return Integer.MAX_VALUE;
	}
	static int partition(int arr[], int l, int r) {
		int x = arr[r], i=l;
		for(int j=l; j<=r-1; j++) {
			if(arr[j]<=x) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
		return i;
	}
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(kthSmallest(arr, 0, arr.length-1, k));
	}

}
