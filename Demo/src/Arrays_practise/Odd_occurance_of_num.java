package Arrays_practise;

import java.util.HashMap;

public class Odd_occurance_of_num {

	static int findOdd(int arr[], int n) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
		}
		for(int i=0; i<n; i++) {
			if(map.get(arr[i])%2 !=0) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 2, 3, 1, 3};
		int n = arr.length;
		System.out.println(findOdd(arr, n));
	}

}
