package Strings;

import java.util.HashMap;

public class Find_occurences_of_each_character {

	static void printChar(String str) {
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			}
			else {
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count+1);
			}
		}
		for(int i=0; i<str.length(); i++) {
			int val = hm.get(str.charAt(i));
			if(val!=0)
			System.out.println(str.charAt(i) + " " +val);
			hm.put(str.charAt(i), 0);
		}
	}
	static void countCases(String str) {
		int uc =0, lc=0, num =0, sp=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				uc++;
			else if(Character.isLowerCase(str.charAt(i)))
				lc++;
			else if(Character.isDigit(str.charAt(i)))
				num++;
			else
				sp++;
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(num);
		System.out.println(sp);
	}
	public static void main(String[] args) {
		String str =  "geeksforgeeks";
		printChar(str);
		countCases("#GeeKs01fOr@gEEks07");
	}

}
