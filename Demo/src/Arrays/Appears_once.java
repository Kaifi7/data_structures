package Arrays;

import java.util.HashMap;

public class Appears_once {

	static void findElement(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]) +1;
				map.replace(arr[i], count);
			}
			else
				map.put(arr[i], 1);
		}
		for(int i=0; i<n; i++) {
			int count = map.get(arr[i]);
			if(count == 1)
				System.out.println(arr[i]);
		}
	}
	static int usingXOR(int arr[], int n) {
		int res = arr[0];
		for(int i=1; i<n; i++) {
			res = res ^ arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {7, 3, 5, 4, 5, 3, 4};
		findElement(arr, arr.length);
		System.out.println(usingXOR(arr, arr.length));
	}
	
}
