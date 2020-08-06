package Arrays_practise;

public class Index_of_smaller_element {

	static int findExtra(int arr1[], int arr2[], int n) {
		int index = n;
		int left = 0, right = n-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr2[mid] == arr1[mid])
				left = mid + 1;
			else {
				index = mid;
				right = mid-1;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int arr1[] = {2, 4, 6, 8, 10, 12,13}; 
        int arr2[] = {2, 4, 6, 8, 10, 12}; 
        int n = arr2.length; 
        System.out.println(findExtra(arr1, arr2, n)); 
	}

}
