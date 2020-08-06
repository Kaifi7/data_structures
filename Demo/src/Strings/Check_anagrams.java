package Strings;

public class Check_anagrams {

	static boolean areAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) 
				return false;
		int mark[] = new int[26];
		for(int i=0; i<s1.length(); i++) {
			mark[s1.charAt(i) - 'a']++;
		}
		for(int i=0; i<s2.length(); i++) {
			mark[s2.charAt(i) - 'a']--;
		}
		for(int i=0; i<26; i++) {
			if(mark[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "fedacbh";
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
	}

}
