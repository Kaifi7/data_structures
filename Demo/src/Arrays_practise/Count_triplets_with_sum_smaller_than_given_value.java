package Arrays_practise;

import java.util.Arrays;

public class Count_triplets_with_sum_smaller_than_given_value {

	static int countTriplets(int arr[], int n, int sum) {
		Arrays.sort(arr);
		int count =0;
		for(int i=0; i<n-2; i++) {
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l<r) {
				if(arr[l] + arr[r] + x >= sum) {
					r--;
				}
				else  {
					count+=(r-l);
					l++;
				}
			}	
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 4, 7};
		int n = arr.length;
		int sum = 12;
		System.out.println(countTriplets(arr, n, sum));
	}

}
