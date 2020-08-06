package Strings;

public class String_comparison {

	static int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1>len2) {
			String temp = s2;
			s2 = s1;
			s1 = temp;
		}
		for(int i=0; i<s1.length(); i++) {
			if((s1.charAt(i)-'a') == (s2.charAt(i) - 'a'))
				continue;
			else if((s1.charAt(i)-'a') > (s2.charAt(i) - 'a'))
				return -1;
			else
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		String s1 = "abcng";
		String s2 = "abcno";
		System.out.println(compare(s1, s2));
	}

}
