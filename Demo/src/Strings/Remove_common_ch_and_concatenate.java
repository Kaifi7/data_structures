package Strings;

import java.util.HashMap;

public class Remove_common_ch_and_concatenate {

	static void removeConcat(String s1, String s2) {
		String temp = "";
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer>hm1 = new HashMap<Character, Integer>();
		for(int i=0; i<s2.length(); i++) {
			if(!hm.containsKey(s2.charAt(i))) {
				hm.put(s2.charAt(i), 1);
			}
		}
		
		for(int i=0; i<s1.length();i++) {
			if(!hm.containsKey(s1.charAt(i))) {
				temp+=s1.charAt(i);
			}
			if(!hm1.containsKey(s1.charAt(i)))
				hm1.put(s1.charAt(i), 1);
		}
		for(int i=0; i<s2.length(); i++) {
			if(!hm1.containsKey(s2.charAt(i))) {
				temp+=s2.charAt(i);
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		String s1 = "abcs";
		String s2 = "cxzca";
		removeConcat(s1, s2);
	}

}
