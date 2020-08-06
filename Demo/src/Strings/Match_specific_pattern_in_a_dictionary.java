package Strings;

import java.util.HashMap;

public class Match_specific_pattern_in_a_dictionary {

	static void findMatchedWords(String dict[], String pattern) {
		String hash = encodeString(pattern);
		for(String word : dict) {
			if(word.length() == pattern.length() && encodeString(word).equals(hash))
				System.out.println(word + " ");
		}
	}
	static String encodeString(String str) {
		HashMap<Character, Integer>map = new HashMap<>();
		String res = " ";
		int i = 0;
		char ch;
		for(int j=0; j<str.length(); j++) {
			ch = str.charAt(j);
			if(!map.containsKey(ch)) {
				map.put(ch, i++);
			}
			res+=map.get(ch);
		}
		return res;
	}
	public static void main(String[] args) {
		String[] dict = { "abb", "abc", 
                "xyz", "xyy" }; 
		String pattern = "foo"; 
		findMatchedWords(dict, pattern);
	}

}
