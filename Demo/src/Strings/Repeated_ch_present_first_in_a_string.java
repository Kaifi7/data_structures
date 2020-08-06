package Strings;

import java.util.HashMap;

public class Repeated_ch_present_first_in_a_string {

	static void findRepeating(String str) {
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(!(hm.containsKey(str.charAt(i)))) {
				hm.put(str.charAt(i), 1);
			}
			else {
				count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count+1);
			}
		}
		 hm.forEach((k,v) -> System.out.println("Key = "
	                + k + ", Value = " + v)); 
		 /*
		for(Character gfg : hm.keySet()) {
			int val = hm.get(gfg);
			if(val>1) {
				System.out.println(gfg);
				return;
			}
		}*/
		for(int i=0; i<str.length();i++) {
			if(hm.get(str.charAt(i))>1) {
				System.out.println(str.charAt(i));
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		String str = "ijkksforgeeks";
		findRepeating(str);
	}

}
