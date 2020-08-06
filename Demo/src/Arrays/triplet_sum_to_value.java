package Arrays;

import java.util.HashSet;

public class triplet_sum_to_value {

	static boolean find3Numbers(int arr[], int arr_size, int sum) {
		for(int i=0; i<arr_size-2; i++) {
			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - arr[i];
			for(int j=i+1; j<arr_size; j++) {
				if(s.contains(curr_sum - arr[j]) && curr_sum - arr[j] != (int)s.toArray()[s.size()-1]) {
					System.out.printf("Triplet is %d %d %d", arr[i], arr[j], curr_sum-arr[j]);
					return true;
				}
				s.add(arr[j]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
		int sum = 22;
		int arr_size = arr.length;
		find3Numbers(arr, arr_size, sum);
	}

}
