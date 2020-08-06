package Arrays_practise;

import java.util.HashMap;

public class subarray_with_given_sum_negative_numbers {

	static void subArraySum(int arr[], int n, int sum) {
		int curr_sum=0;
		int start =0 ;
		int end = -1;
		HashMap<Integer, Integer>hasMap = new HashMap<>();
		for(int i=0; i<n; i++) {
			curr_sum = curr_sum + arr[i];
			if(curr_sum - sum ==0) {
				start = 0;
				end = i;
				break;
			}
			if(hasMap.containsKey(curr_sum-sum)) {
				start = hasMap.get(curr_sum-sum)+1;
				end = i;
				break;
			}
			hasMap.put(curr_sum, i);
		}
		if(end ==-1)
			System.out.println("No subarray with given sum exists");
		else
			System.out.println("Sum found between indexes : " +start+ " to " +end);
	}
	public static void main(String[] args) {
		int[] arr = {10, 2, -2, -20, 10}; 
        int n = arr.length; 
        int sum = -10; 
        subArraySum(arr, n, sum);
	}

}
