package Arrays_practise;

import java.util.Arrays;

public class Print_all_triplets_with_given_sum {

	static void findTriplets(int arr[], int n, int sum) {
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l<r) {
				if(x + arr[l]+arr[r] == sum) {
					System.out.println(x + " " + arr[l] + " " + arr[r]);
					l++;
					r--;
				}
				else if(x + arr[l] + arr[r] < sum)
					l++;
				else
					r--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] { 0, -1, 2, -3, 1 }; 
        int sum = -2; 
        int n = arr.length; 
        findTriplets(arr, n, sum); 
	}

}
