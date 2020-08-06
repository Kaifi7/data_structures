package Arrays_practise;

import java.util.Arrays;

public class Find_triplets_with_zero_sum {

	static boolean findTriplet(int arr[], int n) {
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l<r) {
				if(x + arr[l] + arr[r] == 0) {
					System.out.println(x + " " + arr[l] + " " + arr[r]);
					l++;
					r--;
					
				}
				else if(x + arr[l] + arr[r] < 0)
					l++;
				else
					r--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
		int n = arr.length;
		findTriplet(arr, n);
	}

}
