package Arrays_practise;

import java.util.HashMap;

public class Count_pairs_with_given_sum {

	static int getPairsCount(int arr[], int sum) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int twice_count = 0;
		for(int i=0; i<arr.length; i++) {
			if(map.get(sum - arr[i])!=null)
				twice_count += map.get(sum-arr[i]);
			if(sum - arr[i] == arr[i])
				twice_count--;
		}
		return twice_count/2;
	}
	public static void main(String[] args) {
		  int arr[] = new int[]{1, 5, 7, -1, 5} ; 
		  int sum = 6; 
	      System.out.println("Count of pairs is " +  getPairsCount(arr,sum)); 
	}

}
