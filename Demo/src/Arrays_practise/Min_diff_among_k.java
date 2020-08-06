package Arrays_practise;

import java.util.Arrays;

public class Min_diff_among_k {

	static int minDiff(int arr[], int n, int k) {
		Arrays.sort(arr);
		int res = Integer.MAX_VALUE;
		for(int i=0; i<=n-k; i++) {
			int currDiff = arr[i+k-1] - arr[i];
			res = Math.min(res, currDiff);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {10, 100, 300, 200, 1000, 20, 30};
		int n = arr.length;
		int k = 3;
		System.out.println(minDiff(arr, n, k));
	}

}
