package Sorting_and_Searching;

public class BinarySearch {

	static int binSearch(int arr[], int num) {
		int l = 0, r= arr.length-1;
		while(l<r) {
			int mid = l +(r-l)/2;
			if(arr[mid] == num)
				return mid+1;
			else if(arr[mid]<num) {
				l=mid+1;
			}
			else
				r=mid-1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 7, 9, 11, 15, 18};
		int num = 15;
		System.out.println(binSearch(arr,num));
	}

}
