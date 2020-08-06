package Arrays;

import java.util.Arrays;

public class Two_elements_sum_closest_zero {

	static void minAbsSumPair(int arr[], int n) {
		int minSum = Integer.MAX_VALUE, sum;
		Arrays.sort(arr);
		int l=0, r=n-1;
		int min_l =l, min_r=n-1;
		if(n<2) {
			System.out.println("Invalid input");
			return;
		}
		while(l<r) {
			sum = arr[l] + arr[r];
			if(Math.abs(sum)< Math.abs(minSum)) {
				minSum = sum;
				min_l = l;
				min_r = r;
			}
			if(sum<0) {
				l++;
			}
			else {
				r--;
			}
		}
		System.out.println("The two elements whose " + "sum is minimum are " + arr[min_l] + " and " +arr[min_r]);
	}
	public static void main(String[] args) {
		int arr[] = {1, 60, -10, 70, -80, 85}; 
        int n = arr.length; 
        minAbsSumPair(arr, n); 
	}

}
