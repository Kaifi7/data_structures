package Strings;

import java.util.HashSet;

public class Find_first_repeated_ch {

	static void findRepeated(String str) {
		HashSet<Character>hs = new HashSet<Character>();
		for(int i=0; i<str.length();i++) {
			if(hs.contains(str.charAt(i)) && str.charAt(i)!=' ') {
				System.out.println(str.charAt(i));
				return;
			}
			else {
				hs.add(str.charAt(i));
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		String str = "abcd efgh i";
		findRepeated(str);
	}

}
