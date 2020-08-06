package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class Winner_of_election {

	static void winnerCount(String arr[]) {
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		int lar = 1;
		for(int i=0; i<arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}
			else {
				int count = hm.get(arr[i])+1;
				if(count>lar)
					lar=count;
				hm.put(arr[i], count);
			}
		}
		if(lar==1) {
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + "1");
			return;
		}
		for(int i=0; i<arr.length;i++) {
			int val = hm.get(arr[i]);
			if(val==lar) {
				System.out.println(arr[i]+" "+val);
				return;
			}
		}
	}
	public static void main(String[] args) {
		String arr[] = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny",
				"jamie", "johnny", "john"};
		String arr1[] = {"blake", "andy", "clark"};
		winnerCount(arr1);
	}

}
