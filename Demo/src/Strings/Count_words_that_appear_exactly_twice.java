package Strings;

import java.util.HashMap;

public class Count_words_that_appear_exactly_twice {

	static void countWords(String s[], int n) {
		
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		for(int i=0; i<s.length; i++) {
			if(!hm.containsKey(s[i])) {
				hm.put(s[i], 1);
			}
			else {
				int count = hm.get(s[i]);
				hm.put(s[i], count+1);
			}
		}
		int count = 0;
		for(String ss : hm.keySet()) {
			int val = hm.get(ss);
			if(val == 2)
				count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
	/*	String s[] = { "hate", "love", "peace", "love", 
                "peace", "hate", "love", "peace", 
                "love", "peace" }; */
		String str[] = {
				"Tom", "Jerry", "Thomas", "Tom", "Jerry", "Courage", "Tom", "Courage"
		};
		int n = str.length;
		countWords(str, n);
	}

}
