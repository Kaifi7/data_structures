package Arrays_practise;

public class First_and_last_element_in_sorted_array {

	static void firstLast(int arr[], int low, int high, int k) {
		int i=0, j=0;
		if(low < high) {
			int mid = (low+high)/2;
			if(arr[mid]==k) {
			    i=mid; j=mid;
				while(arr[i]==k)
					i--;
				while(arr[j]==k)
					j++;
			}
			else if(arr[mid]<k)
				low = mid+1;
			else
				high =mid-1;
		}
		System.out.println((i+1) + " "+(j-1));
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 3,3, 3, 3, 3, 5, 5, 5, 5, 67, 123, 125};
		int n = arr.length;
		int k = 3;
		firstLast(arr,  0, n-1, k);
	}

}
