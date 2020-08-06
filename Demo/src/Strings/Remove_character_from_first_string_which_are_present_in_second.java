package Strings;

import java.util.HashMap;

public class Remove_character_from_first_string_which_are_present_in_second {

	static void removeCharacters(String s1, String s2) {
		String temp = s1;
		s1 = "";
		int j=0;
		HashMap<Integer, Character>hm = new HashMap<Integer, Character>();
		for(int i=0;i<s2.length();i++) {
			hm.put(j++, s2.charAt(i));
		}
		for(int i=0; i<temp.length();i++) {
			if(!hm.containsValue(temp.charAt(i))) {
				s1+=temp.charAt(i);
			}
		}
		System.out.println(s1.substring(0, s1.length()));
	}
	public static void main(String[] args) {
		String s1 = "geeksforgeeks is aok";
		String s2 = "mask";
		removeCharacters(s1, s2);
	}

}
