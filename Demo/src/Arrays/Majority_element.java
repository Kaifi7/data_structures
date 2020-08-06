package Arrays;

import java.util.HashMap;

//majority element is the one which occurs more than n/2 times -
public class Majority_element {

	static void findMajority(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				int count = hm.get(arr[i]) + 1;
				if(count > arr.length/2) {
					System.out.println("Majority element found is : " +arr[i]);
					return;
				}
				else {
					hm.put(arr[i], count);
				}
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("No majority element found");
	}
	public static void main(String[] args) {
		int a[] = new int[] {2,2,2,2,5,5,2,3,3};
		findMajority(a);
	}

}
