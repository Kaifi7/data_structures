package Strings;

import java.util.HashMap;

public class Second_most_repeated_string {

	static void secondMost(String arr[]) {
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		int lar =0, secondlar = 0;
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				int count = hm.get(arr[i])+1;
				if(count>lar) {
					secondlar = lar;
					lar = count;
				}
				else if(count>secondlar) {
					secondlar = count;
				}
				hm.put(arr[i], count);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		for(int i=0; i<arr.length; i++) {
			int val = hm.get(arr[i]);
			if(val == secondlar) {
				System.out.println(arr[i]);
				return;
			}
		}
	}
	public static void main(String[] args) {
		String arr[] = {"geeks", "for", "geeks", "for", "geeks", "aaa"};
		secondMost(arr);
	}

}
