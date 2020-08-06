package Arrays_practise;

import java.util.Arrays;
import java.util.HashSet;

public class Triplet_given_to_a_given_value {

	static boolean find3Numbers(int arr[], int n, int sum) {
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l<r) {
				if(x + arr[l] + arr[r] == sum) {
					System.out.println(x + " " + arr[l] + " " + arr[r]);
					return true;
				}
				else if(x + arr[l] + arr[r] < sum)
					l++;
				else
					r--;
			}
			
		}
		return false;
	}
	static boolean findTripletUsingHash(int arr[], int n, int sum) {
		for(int i=0; i<n-2; i++) {
			HashSet<Integer>hs = new HashSet<Integer>();
			int curr_sum = sum - arr[i];
			for(int j=i+1; j<n; j++) {
				if(hs.contains(curr_sum-arr[j])) {
					System.out.println(arr[i] + " " + arr[j] + " " + (curr_sum-arr[j]));
					return true;
				}
				hs.add(arr[j]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		 	int A[] = { 1, 4, 45, 6, 10, 8 }; 
	        int sum = 22; 
	        int arr_size = A.length; 
	        find3Numbers(A, arr_size, sum);
	        findTripletUsingHash(A, arr_size, sum);
	}

}
