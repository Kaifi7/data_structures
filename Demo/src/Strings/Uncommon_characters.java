package Strings;

import java.util.HashMap;

public class Uncommon_characters {

	static void printUncommon(String s1, String s2) {
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		int arr[] = new int[26];
		for(int i=0; i<26; i++)
			arr[i]=0;
		for(int i=0; i<s1.length();i++) {
			if(!hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), 1);
				arr[s1.charAt(i)-'a']=1;
			}
		}
		for(int i=0; i<s2.length();i++) {
			if(!hm.containsKey(s2.charAt(i))) {
				hm.put(s2.charAt(i), 1);
				arr[s2.charAt(i)-'a']=1;
			}
			else {
				hm.put(s2.charAt(i), 2);
				arr[s2.charAt(i)-'a']=2;
			}
		}
		for(int i=0; i<26; i++) {
			if(arr[i]==1) {
				System.out.print((char)(i+'a'));
			}
		}
	}
	public static void main(String[] args) {
		String s1 = "characters";
		String s2 = "alphabets";
		printUncommon(s1, s2);
	}

}
