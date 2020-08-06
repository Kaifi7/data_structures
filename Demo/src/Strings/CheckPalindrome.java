package Strings;

public class CheckPalindrome {

	static boolean isPalindrome(String s) {
		/*
		int l=0, h=s.length()-1;
		while(h>l) {
			if(s.charAt(l++)!=s.charAt(h--))
				return false;
		}
		return true;*/
		
		String rev = new StringBuilder(s).reverse().toString();
		if(rev.equals(s))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("abba")); 
	    System.out.println(isPalindrome("abbccbba"));
	    System.out.println(isPalindrome("geeks")); 
	}

}
