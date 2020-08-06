package Arrays_practise;

import java.util.HashMap;

public class First_repeating_element {

	static int findIndex(int arr[], int n) {
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
			if(map.get(arr[i])>1) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 1, 3};
		int n = arr.length;
		System.out.println(findIndex(arr, n));
	}

}
