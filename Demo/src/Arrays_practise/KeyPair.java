package Arrays_practise;

import java.util.HashSet;

public class KeyPair {

	static boolean findPair(int arr[], int n, int sum) {
		HashSet<Integer>hs = new HashSet<Integer>();
		for(int i=0; i<n; i++) {
			int temp = sum - arr[i];
			if(hs.contains(temp)) {
				System.out.println(temp + " " + arr[i]);
				return true;
			}
			else
				hs.add(arr[i]);
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
		int n = arr.length;
		int sum = 16;
		findPair(arr,n, sum);
	}

}
