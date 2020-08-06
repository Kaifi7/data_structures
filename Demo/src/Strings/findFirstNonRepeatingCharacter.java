package Strings;

import java.util.HashMap;

public class findFirstNonRepeatingCharacter {

	static void firstNonRepeating(String str) {
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			}
			else {
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count+1);
			}
		}
		for(int i=0; i<str.length();i++) {
			int count = hm.get(str.charAt(i));
			if(count==1) {
				System.out.println(str.charAt(i));
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		String str = "hello";
		firstNonRepeating(str);
	}

}
